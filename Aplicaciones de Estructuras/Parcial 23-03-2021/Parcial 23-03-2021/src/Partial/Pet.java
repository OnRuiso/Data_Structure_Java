/*
 PARCIAL 23-03-2021
 
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */

package Partial;

public class Pet
{
	private int id;
	private String nombre;
	private String tipo;
	private String enfermedad;
	private int triage;
	
	public Pet()
	{
		//this.tipo = new String[3];
		//initTipo();
	}
	
	public Pet(int id, String nombre, String enfermedad, int triage)
	{
		this.id = id;
		this.nombre = nombre;
		this.enfermedad = enfermedad;
		this.triage = triage;
		this.tipo = tipo;
		//this.tipo = new String[3];
		//initTipo();
	}
	
	
	
	public int getId() {		return id;	}
	public void setId(int id) {		this.id = id;	}

	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	public String getTipo() {		return tipo;	}
	public void setTipo(String tipo) {		this.tipo = tipo;	}

	public String getEnfermedad() {		return enfermedad;	}
	public void setEnfermedad(String enfermedad) {		this.enfermedad = enfermedad;	}

	public int getTriage() {		return triage;	}
	public void setTriage(int triage) {		this.triage = triage;	}

	/*
	public void initTipo()
	{
		for(int i=0 ; i < 3 ; i++)
		{
			tipo[i] = "new";
		}
	}
	*/
}
