/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.web.controller;

import co.edu.usta.tunja.supermarket.persistence.ejb.ProductFacade;
import co.edu.usta.tunja.supermarket.persistence.ejb.ProductTypeFacade;
import co.edu.usta.tunja.supermarket.persistence.entity.ProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.ProductTypeEntity;

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
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
/**
 *
 * @author ruiso
 */

@Named (value="productController")
@SessionScoped
public class ProductController implements Serializable{
    @EJB
    private ProductFacade _ejbFacade;
    @EJB
    private ProductTypeFacade _productTypeFacade;
    private ProductEntity _objActual;
    private Integer fkProductTypeID;
    
    public ProductController (){
        
    }

    public ProductTypeFacade getProductTypeFacade() {
        return _productTypeFacade;
    }

    public void setProductTypeFacade(ProductTypeFacade _productTypeFacade) {
        this._productTypeFacade = _productTypeFacade;
    }

    public Integer getFkProductTypeID() {
        return fkProductTypeID;
    }

    public void setFkProductTypeID(Integer fkProductTypeID) {
        this.fkProductTypeID = fkProductTypeID;
        Map<String,Object> sesionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
                sesionMap.put("fkId", fkProductTypeID);
                System.out.println("setFkProductTypeID:"+sesionMap.get("fkId"));
                System.out.println("setFkProductTypeID:fkProductTypeID ="+sesionMap.get("fkProductTypeID"));
    }
    
    
    
    public ProductEntity getCampo(){
        if(this._objActual == null){
            this._objActual = new ProductEntity();
        }
        return this._objActual;
    }
    
    public ProductFacade getFacade(){
        return this._ejbFacade;
    }
    
    public String grabarProduct() {
        String text, detail;
        
        try {
            System.out.println("grabarProduct"+getFkProductTypeID());
            Map<String,Object> sesionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
            setFkProductTypeID(Integer.parseInt(sesionMap.get("fkId").toString()));
            System.out.println("ProductController.grabarProduct: ifFkType="+getFkProductTypeID()+" nombreProd="+getCampo().getProductName());
            ProductTypeEntity pte=_productTypeFacade.buscar(getFkProductTypeID());
            text = "Exito";
            String detalle = "Exito";
            detail = detalle;
            //detail = ResourceBundle.getBundle("/co/edu/usta/tunja/clases/utility/txtDepartment").getString("MsgGrabarExito");
            //detail = text;
            _objActual.setFkProductType(pte);
            
            _objActual.setFkIdProductType(getFkProductTypeID());
            getFacade().grabar(this._objActual);
            
            Messages.exito(text, detail);
            return "listarProduct";
        } catch (Exception e) {
            text = "Error";
            detail = e.getMessage();
            Messages.error(text, detail);
            e.printStackTrace();
            return "listarProduct";
        }
    }
    
    public String eliminarProduct(ProductEntity pte) {
        String texto, detalle;
        this._objActual = pte;
        try {
            texto = "Exito al borrar";
            detalle = "Eliminado con exito";
            getFacade().borrar(pte);
            Messages.exito(texto, detalle);
            return "listarProduct";
        } catch (Exception e) {
            texto = "Error al borrar";
            detalle = e.getMessage();
            Messages.error(texto, detalle);
            return "listarProduct";
        }
    }
    
    public List<ProductEntity> getProductListado(){
        return getFacade().listar();
    }
    
    public SelectItem[] getListadoCombo(String value){
        return Forms.addObject(getFacade().listar(), value);
    }
    
        // Interface converter
    /*
    @FacesConverter(forClass = ProductEntity.class, value = "productConverter")
    public static class ProductControllerConverter implements Converter{
        @Override //manual escrito
        public Object getAsObject(FacesContext context, UIComponent component, String value){
            try{
                int id = Integer.parseInt(value);
                ProductController controlador;
                ELContext contextoExterno = context.getELContext();
                Application contextoAplicacion = context.getApplication();
                String nombreDecoracionControlador = "productController";
                controlador = (ProductController)
                        contextoAplicacion.getELResolver().getValue(contextoExterno, null, nombreDecoracionControlador);
                
                return controlador.getFacade().buscar(id);
            }catch(NumberFormatException error){
                return null;
            }
        }
        
        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
            if(value instanceof ProductEntity){
                ProductEntity obj = (ProductEntity) value;
                return String.valueOf(obj.getIdProduct());
            }
            return null;
        }
    }*/
    
    // Interface converter
    
    @FacesConverter(forClass = ProductTypeEntity.class, value = "productTypeConverter")
    public static class ProductControllerConverter implements Converter{
        @Override //manual escrito
        public Object getAsObject(FacesContext context, UIComponent component, String value){
            try{
                int id = Integer.parseInt(value);
                ProductController controlador;
                ELContext contextoExterno = context.getELContext();
                Application contextoAplicacion = context.getApplication();
                String nombreDecoracionControlador = "productController";
                controlador = (ProductController)
                        contextoAplicacion.getELResolver().getValue(contextoExterno, null, nombreDecoracionControlador);
                Map<String,Object> sesionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
                sesionMap.put("fkId", id);
                System.out.println("productTypeConverter:"+sesionMap.get("fkId")+id);
                controlador.setFkProductTypeID(id);
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
