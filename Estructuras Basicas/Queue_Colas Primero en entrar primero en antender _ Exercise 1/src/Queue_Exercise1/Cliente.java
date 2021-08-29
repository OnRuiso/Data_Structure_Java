/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 
 CODIGO MODIFICADO _ EJERCICIO EN CLASE _ 19-04-2021
 */
package Queue_Exercise1;

public class Cliente
{
	private String nombre;
	private int edad;
	
	public Cliente() {
		
	}
	public Cliente(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	public int getEdad() {		return edad;	}
	public void setEdad(int edad) {		this.edad = edad;	}
	
	public String toString()
	{
		return "Nombre del Cliente: " + nombre + " con una edad de: " + edad;
	}
	
}
