/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 */

package Notas;

public class Estudiante
{
	private String nombre;
	private int id;
	
	
	public Estudiante() { }
	
	public Estudiante(String nombre, int id)
	{
		this.nombre = nombre;
		this.id = id;
		
	}

	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	public int getId() {		return id;	}
	public void setId(int id) { 	this.id = id;	}
	
	
	
	
}	
