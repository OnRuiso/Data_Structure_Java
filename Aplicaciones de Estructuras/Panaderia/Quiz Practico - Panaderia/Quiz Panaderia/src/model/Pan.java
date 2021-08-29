/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 Ejercicio: Quiz Practico - Panaderia
 */
package model;

/**
 *
 * @author yolima
 */
public class Pan {
    
    private String tipo;
    private int precio;

    public Pan() {    }

    public Pan(String tipo, int precio) 
    {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {        return tipo;    }
    public void setTipo(String tipo) {        this.tipo = tipo;    }

    public int getPrecio() {        return precio;    }
    public void setPrecio(int precio) {        this.precio = precio;    }
    
    
}
