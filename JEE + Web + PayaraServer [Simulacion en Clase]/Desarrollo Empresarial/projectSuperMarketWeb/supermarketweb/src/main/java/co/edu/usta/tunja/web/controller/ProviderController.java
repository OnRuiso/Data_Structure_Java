/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.web.controller;

import co.edu.usta.tunja.supermarket.persistence.ejb.ProviderFacade;
import co.edu.usta.tunja.supermarket.persistence.entity.ProviderEntity;

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

@Named (value="providerController")
@RequestScoped
public class ProviderController {
    @EJB
    private ProviderFacade _ejbFacade;
    private ProviderEntity _objActual;
    
    public ProviderController (){
        
    }
    
    public ProviderEntity getCampo(){
        if(this._objActual == null){
            this._objActual = new ProviderEntity();
        }
        return this._objActual;
    }
    
    public ProviderFacade getFacade(){
        return this._ejbFacade;
    }
    
    public String grabarProvider() {
        String text, detail;
        try {
            text = "Exito";
            String detalle = "Exito";
            detail = detalle;
            //detail = ResourceBundle.getBundle("/co/edu/usta/tunja/clases/utility/txtDepartment").getString("MsgGrabarExito");
            //detail = text;
            getFacade().grabar(this._objActual);
            
            Messages.exito(text, detail);
            return "listarProvider";
        } catch (Exception e) {
            text = "Error";
            detail = e.getMessage();
            Messages.error(text, detail);
            return "listarProvider";
        }
    }
    
    public List<ProviderEntity> getProviderListado(){
        return getFacade().listar();
    }
    
    public String eliminarProvider(ProviderEntity pte) {
        String texto, detalle;
        this._objActual = pte;
        try {
            texto = "Exito al borrar";
            detalle = "Eliminado con exito";
            getFacade().borrar(pte);
            Messages.exito(texto, detalle);
            return "listarProvider";
        } catch (Exception e) {
            texto = "Error al borrar";
            detalle = e.getMessage();
            Messages.error(texto, detalle);
            return "listarProvider";
        }
    }
    
    public SelectItem[] getListadoCombo(String value){
        return Forms.addObject(getFacade().listar(), value);
    }
    
    // Interface converter
    
    @FacesConverter(forClass = ProviderEntity.class, value = "providerConverter")
    public static class ProviderControllerConverter implements Converter{
        @Override //manual escrito
        public Object getAsObject(FacesContext context, UIComponent component, String value){
            try{
                int id = Integer.parseInt(value);
                ProviderController controlador;
                ELContext contextoExterno = context.getELContext();
                Application contextoAplicacion = context.getApplication();
                String nombreDecoracionControlador = "providerController";
                controlador = (ProviderController)
                        contextoAplicacion.getELResolver().getValue(contextoExterno, null, nombreDecoracionControlador);
                
                return controlador.getFacade().buscar(id);
            }catch(NumberFormatException error){
                return null;
            }
        }
        
        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            if(value instanceof ProviderEntity){
                ProviderEntity obj = (ProviderEntity) value;
                return String.valueOf(obj.getIdProvider());
            }
            return null;
        }
    }
}
