/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.web.controller;

import co.edu.usta.tunja.supermarket.persistence.ejb.TicketFacade;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketEntity;

import co.edu.usta.tunja.web.utility.Forms;
import javax.ejb.EJB;
import javax.el.ELContext;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import co.edu.usta.tunja.web.utility.Messages;
import java.util.List;

/**
 *
 * @author ruiso
 */

@Named(value = "ticketController")
@RequestScoped
public class TicketController {

    @EJB
    private TicketFacade _ejbFacade;
    private TicketEntity _objActual;

    public TicketController() {

    }

    public TicketEntity getCampo() {
        if (this._objActual == null) {
            this._objActual = new TicketEntity();
        }
        return this._objActual;
    }

    public TicketFacade getFacade() {
        return this._ejbFacade;
    }

    public String grabarTicket() {
        String text, detail;
        try {
            text = "Exito";
            String detalle = "Exito";
            detail = detalle;
            //detail = ResourceBundle.getBundle("/co/edu/usta/tunja/clases/utility/txtDepartment").getString("MsgGrabarExito");
            //detail = text;           
            getFacade().grabar(this._objActual);

            Messages.exito(text, detail);
            return "listarTicket";
        } catch (Exception e) {
            text = "Error";
            detail = e.getMessage();
            Messages.error(text, detail);
            return "listarTicket";
        }
    }

    public List<TicketEntity> getTicketListado() {
        return getFacade().listar();
    }
    
    public String eliminarTicket(TicketEntity pte) {
        String texto, detalle;
        this._objActual = pte;
        try {
            texto = "Exito al borrar";
            detalle = "Eliminado con exito";
            getFacade().borrar(pte);
            Messages.exito(texto, detalle);
            return "listarTicket";
        } catch (Exception e) {
            texto = "Error al borrar";
            detalle = e.getMessage();
            Messages.error(texto, detalle);
            return "listarTicket";
        }
    }

    public SelectItem[] getListadoCombo(String value) {
        return Forms.addObject(getFacade().listar(), value);
    }

    // Interface converter
    @FacesConverter(forClass = TicketEntity.class, value = "ticketConverter")
    public static class TicketControllerConverter implements Converter {

        @Override //manual escrito
        public Object getAsObject(FacesContext context, UIComponent component, String value) {
            try {
                int id = Integer.parseInt(value);
                TicketController controlador;
                ELContext contextoExterno = context.getELContext();
                Application contextoAplicacion = context.getApplication();
                String nombreDecoracionControlador = "ticketController";
                controlador = (TicketController) contextoAplicacion.getELResolver().getValue(contextoExterno, null, nombreDecoracionControlador);

                return controlador.getFacade().buscar(id);
            } catch (NumberFormatException error) {
                return null;
            }
        }

        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            if (value instanceof TicketEntity) {
                TicketEntity obj = (TicketEntity) value;
                return String.valueOf(obj.getIdTicket());
            }
            return null;
        }
    }
}
