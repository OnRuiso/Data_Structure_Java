/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 
 CODIGO MODIFICADO _ EJERCICIO EN CLASE _ 19-04-2021
 */
package Stack_Exercise1;

public class Ficha
{
	private String color;
	private int numero;
	
	public Ficha() {
		
	}
	public Ficha(String color , int numero)
	{
		this.color = color;
		this.numero = numero;
	}
	public String getColor() {		return color;	}
	public void setColor(String color) {		this.color = color;	}
	
	public int getNumero() {		return numero;	}
	public void setNumero(int numero) {		this.numero = numero;	}
	
	public String toString()
	{
		return "El Numero es: " + numero + " con solor: " + color ;
	}
	
	
}
