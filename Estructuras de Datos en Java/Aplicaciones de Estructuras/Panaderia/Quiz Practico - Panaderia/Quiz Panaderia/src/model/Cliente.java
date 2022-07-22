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
public class Cliente {
    
    private String nombre;
    public Pan Canasta[];

    public Cliente() {    }

    public Cliente(String nombre, Pan[] Canasta) {
        this.nombre = nombre;
        this.Canasta = Canasta;
    }

    public String getNombre() {        return nombre;    }
    public void setNombre(String nombre) {        this.nombre = nombre;    }

    public Pan[] getCanasta() {        return Canasta;    }
    public void setCanasta(Pan[] Canasta) {        this.Canasta = Canasta;    }
    
    
}
