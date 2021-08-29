/*
Universidad Santo Tomas seccional Tunja
Facultad de Ingenieria de Sistemas
Asignatura de Estructura de datos
Ing.Luis Felipe Narvaez Gomez
*/
package Banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente
{
	private double numeroCliente;
	private String nombre;
	private int cedula; //new
	
	public Cliente()	{	}
	public Cliente( double numeroCliente , String nombre , int cedula /*new*/ )
	{
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
		this.cedula = cedula; //new
	}
	
	public double getNumeroCliente() {		return numeroCliente;	}
	public void setNumeroCliente(double numeroCliente) {		this.numeroCliente = numeroCliente;}
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public double getCedula() {		return cedula;	} //new
	public void setCedula(int cedula) {		this.cedula = cedula;	} //new
	
	public String toString()
	{
		return "#. "+numeroCliente+" El Cliente: "+nombre + " con numero de cedula |"+cedula+"| "; //new la parte de la cedula
	}
	
}
