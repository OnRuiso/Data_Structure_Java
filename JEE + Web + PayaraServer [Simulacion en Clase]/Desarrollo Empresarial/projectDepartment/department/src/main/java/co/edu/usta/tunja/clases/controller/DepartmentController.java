/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.clases.controller;

import co.edu.usta.tunja.clases.ejb.DepartmentFacade;
import co.edu.usta.tunja.clases.entity.DepartmentEntity;
import co.edu.usta.tunja.clases.utility.Messages;
import java.io.Serializable;
import java.util.List;


import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author ruiso
 */
@Named(value = "departmentController")
@RequestScoped
public class DepartmentController implements Serializable {

    /**
     * Creates a new instance of DepartmentController
     */
    @EJB
    private DepartmentFacade _ejbFacade;
    private DepartmentEntity _objActual;

    public DepartmentController() {
    }

    public DepartmentEntity getCampo() {
        if (this._objActual == null) {
            this._objActual = new DepartmentEntity();
        }
        return this._objActual;
    }

    public DepartmentFacade getFacade() {
        return this._ejbFacade;
    }

    public String grabarUsuario() {
        String text, detail;
        try {
            text = "Exito";
            String detalle = "Exito";
            detail = detalle;
            //detail = ResourceBundle.getBundle("/co/edu/usta/tunja/clases/utility/txtDepartment").getString("MsgGrabarExito");
            //detail = text;
            getFacade().grabar(this._objActual);
            Messages.exito(text, detail);
            return "crear";
        } catch (Exception e) {
            text = "Error";
            detail = e.getMessage();
            Messages.error(text, detail);
            return "crear";
        }
    }

    public List<DepartmentEntity> getDepartmentListado() {
        return getFacade().listar();
    }

    /*
    public SelectItem[] getListadoCombo(String value) {
        return Forms.addObject(getFacade().listar(), value);
    }

    // Interface converter
    @FacesConverter(forClass = DepartmentEntity.class, value = "departmentConverter")
    public static class DepartmentControllerConverter implements Converter {

        @Override //manual escrito
        public Object getAsObject(FacesContext context, UIComponent component, String value) {
            try {
                int id = Integer.parseInt(value);
                DepartmentController controlador;
                ELContext contextoExterno = context.getELContext();
                Application contextoAplicacion = context.getApplication();
                String nombreDecoracionControlador = "departmentController";
                controlador = (DepartmentController) contextoAplicacion.getELResolver().getValue(contextoExterno, null, nombreDecoracionControlador);

                return controlador.getFacade().buscar(id);
            } catch (NumberFormatException error) {
                return null;
            }
        }

        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            if (value instanceof PersonEntity) {
                PersonEntity obj = (PersonEntity) value;
                return String.valueOf(obj.getIdPerson());
            }
            return null;
        }
    }
     */
}
