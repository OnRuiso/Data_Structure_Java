/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */
package ArrayList;

public class Instrument
{
	private String nombre;
	private double nomodelo;
	private String modelo;
	
	public Instrument()	{	}
	public Instrument(String nombre , double precio , String modelo)
	{
		this.modelo = modelo;
		this.nombre = nombre;
		this.nomodelo = nomodelo;
	}
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public double getNomodelo() {		return nomodelo;	}
	public void setNomodelo(double nomodelo) {		this.nomodelo = nomodelo;	}
	
	public String getModelo() {		return modelo;	}
	public void setModelo(String modelo) {		this.modelo = modelo;	}
	
	public String toString()//polimorfismo
	{
		return "instrumento: " + nombre + " con el modelo: "+ modelo + "No de modelo : " + nomodelo;
	}

}
