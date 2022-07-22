/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing.Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */
package Ukelele;

public class Cliente
{
	private int numero;
	private int cedula;
	private String nombre;
	private boolean sex;
	
	public Cliente() {
		
	}
	public Cliente(int numero , int cedula , String nombre , boolean sex)
	{
		this.numero = numero;
		this.cedula = cedula;
		this.nombre = nombre;
		this.sex = sex;
	}
	
	public int getNumero() {		return numero;	}
	public void setNumero(int numero) {		this.numero = numero;	}
	
	public int getCedula() {		return cedula;	}
	public void setCedula(int cedula) {		this.cedula = cedula;	}
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public boolean isSex() {		return sex;	}
	public void setSex(boolean sex) {		this.sex = sex;	}
	
	
}
