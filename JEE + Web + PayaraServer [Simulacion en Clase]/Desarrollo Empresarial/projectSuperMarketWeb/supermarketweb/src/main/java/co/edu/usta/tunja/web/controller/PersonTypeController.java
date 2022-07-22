/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.web.controller;

import co.edu.usta.tunja.supermarket.persistence.ejb.PersonTypeFacade;
import co.edu.usta.tunja.supermarket.persistence.entity.PersonTypeEntity;

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

@Named (value="personTypeController")
@RequestScoped
public class PersonTypeController {
    @EJB
    private PersonTypeFacade _ejbFacade;
    private PersonTypeEntity _objActual;
    
    public PersonTypeController (){
        
    }
    
    public PersonTypeEntity getCampo(){
        if(this._objActual == null){
            this._objActual = new PersonTypeEntity();
        }
        return this._objActual;
    }
    
    public PersonTypeFacade getFacade(){
        return this._ejbFacade;
    }
    
    public String grabarPersonType() {
        String text, detail;
        try {
            text = "Exito";
            String detalle = "Exito";
            detail = detalle;
            //detail = ResourceBundle.getBundle("/co/edu/usta/tunja/clases/utility/txtDepartment").getString("MsgGrabarExito");
            //detail = text;
            getFacade().grabar(this._objActual);
            
            Messages.exito(text, detail);
            return "listarPersonType";
        } catch (Exception e) {
            text = "Error";
            detail = e.getMessage();
            Messages.error(text, detail);
            return "listarPersonType";
        }
    }
    
    public List<PersonTypeEntity> getPersonTypeListado(){
        return getFacade().listar();
    }
    
    public String eliminarPersonType(PersonTypeEntity pte) {
        String texto, detalle;
        this._objActual = pte;
        try {
            texto = "Exito al borrar";
            detalle = "Eliminado con exito";
            getFacade().borrar(pte);
            Messages.exito(texto, detalle);
            return "listarPersonType";
        } catch (Exception e) {
            texto = "Error al borrar";
            detalle = e.getMessage();
            Messages.error(texto, detalle);
            return "listarPersonType";
        }
    }
    
    public SelectItem[] getListadoCombo(String value){
        return Forms.addObject(getFacade().listar(), value);
    }
    
    // Interface converter
    
    @FacesConverter(forClass = PersonTypeEntity.class, value = "personTypeConverter")
    public static class PersonTypeControllerConverter implements Converter{
        @Override //manual escrito
        public Object getAsObject(FacesContext context, UIComponent component, String value){
            try{
                int id = Integer.parseInt(value);
                PersonTypeController controlador;
                ELContext contextoExterno = context.getELContext();
                Application contextoAplicacion = context.getApplication();
                String nombreDecoracionControlador = "personTypeController";
                controlador = (PersonTypeController)
                        contextoAplicacion.getELResolver().getValue(contextoExterno, null, nombreDecoracionControlador);
                
                return controlador.getFacade().buscar(id);
            }catch(NumberFormatException error){
                return null;
            }
        }
        
        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            if(value instanceof PersonTypeEntity){
                PersonTypeEntity obj = (PersonTypeEntity) value;
                return String.valueOf(obj.getIdPersonType());
            }
            return null;
        }
    }
}
