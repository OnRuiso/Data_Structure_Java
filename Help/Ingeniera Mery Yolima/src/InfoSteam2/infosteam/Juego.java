/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoSteam2.infosteam;

/**
 *
 * @author yolima
 */
public class Juego {
    
    private String descripcion;
    private String nombre;
    private double precio;

    public Juego() {
    }

    public Juego(String d, String n, double p) {
        this.descripcion = d;
        this.nombre = n;
        this.precio = p;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d) {
        this.descripcion = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
