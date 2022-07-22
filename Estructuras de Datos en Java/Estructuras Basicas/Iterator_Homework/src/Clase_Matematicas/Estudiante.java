package Clase_Matematicas;

public class Estudiante
{
	private String nombre;
	private int edad;
	private String genero;
	
	public Estudiante()	{	}
	
	public Estudiante(String nombre, int edad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public int getEdad() {		return edad;	}
	public void setEdad(int edad) {		this.edad = edad;	}
	
	public String getGenero() {		return genero;	}
	public void setGenero(String genero) {		this.genero = genero;	}
	
	public String toString()
	{
		return "Estudiante: " + nombre + " con genero " + genero + " tiene una edad de " + edad;
	}
	
}
