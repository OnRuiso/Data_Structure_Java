/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.web.controller;

import co.edu.usta.tunja.supermarket.persistence.ejb.ProductTypeFacade;
import co.edu.usta.tunja.supermarket.persistence.entity.ProductTypeEntity;

import co.edu.usta.tunja.web.utility.Forms;
import co.edu.usta.tunja.web.utility.Messages;
import java.util.List;
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

/**
 *
 * @author ruiso
 */

@Named (value="productTypeController")
@RequestScoped
public class ProductTypeController {
    @EJB
    private ProductTypeFacade _ejbFacade;
    private ProductTypeEntity _objActual;
    
    public ProductTypeController (){
        
    }
    
    public ProductTypeEntity getCampo(){
        if(this._objActual == null){
            this._objActual = new ProductTypeEntity();
        }
        return this._objActual;
    }
    
    public ProductTypeFacade getFacade(){
        return this._ejbFacade;
    }
    
     public String grabarTipoProducto(){
        String text, detail;
        try {
            text = "Exito";
            String detalle = "Exito";
            detail = detalle;
            //detail = ResourceBundle.getBundle("/co/edu/usta/tunja/clases/utility/txtDepartment").getString("MsgGrabarExito");
            //detail = text;
            getFacade().grabar(this._objActual);
            Messages.exito(text, detail);
            return "listarProductType";
        } catch (Exception e) {
            text = "Error";
            detail = e.getMessage();
            Messages.error(text, detail);
            return "listarProductType";
        }
    }
    
    public SelectItem[] getListadoCombo(String value){
        return Forms.addObject(getFacade().listar(), value);
    }
    
    public List<ProductTypeEntity> getProductTypeListado() {
        return getFacade().listar();
    }
    
    public String eliminarProductType(ProductTypeEntity pte) {
        String texto, detalle;
        this._objActual = pte;
        try {
            texto = "Exito al borrar";
            detalle = "Eliminado con exito";
            getFacade().borrar(pte);
            Messages.exito(texto, detalle);
            return "listarProductType";
        } catch (Exception e) {
            texto = "Error al borrar";
            detalle = e.getMessage();
            Messages.error(texto, detalle);
            return "listarProductType";
        }
    }
    
    // Interface converter
    
    @FacesConverter(forClass = ProductTypeEntity.class, value = "productTypeConverter")
    public static class ProductTypeControllerConverter implements Converter{
        @Override //manual escrito
        public Object getAsObject(FacesContext context, UIComponent component, String value){
            try{
                int id = Integer.parseInt(value);
                ProductTypeController controlador;
                ELContext contextoExterno = context.getELContext();
                Application contextoAplicacion = context.getApplication();
                String nombreDecoracionControlador = "productTypeController";
                controlador = (ProductTypeController)
                        contextoAplicacion.getELResolver().getValue(contextoExterno, null, nombreDecoracionControlador);
                
                return controlador.getFacade().buscar(id);
            }catch(NumberFormatException error){
                return null;
            }
        }
        
        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            if(value instanceof ProductTypeEntity){
                ProductTypeEntity obj = (ProductTypeEntity) value;
                return String.valueOf(obj.getIdProductType());
            }
            return null;
        }
    }
}
