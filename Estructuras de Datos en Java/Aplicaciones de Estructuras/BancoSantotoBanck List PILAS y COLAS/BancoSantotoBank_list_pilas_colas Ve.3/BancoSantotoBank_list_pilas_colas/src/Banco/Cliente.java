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
	
	private List<Cuenta> valoresCuenta;
	
	public Cliente()	{	}
	public Cliente( double numeroCliente , String nombre , List<Cuenta> valoresCuenta)
	{
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
		valoresCuenta = new ArrayList<Cuenta>();
	}
	
	public double getNumeroCliente() {		return numeroCliente;	}
	public void setNumeroCliente(double numeroCliente) {		this.numeroCliente = numeroCliente;}
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public List<Cuenta> getValoresCuenta() {		return valoresCuenta;	}
	public void setValoresCuenta(List<Cuenta> valoresCuenta) {		this.valoresCuenta = valoresCuenta;	}
	
	public String toString()
	{
		return "#. "+numeroCliente+" El Cliente: "+nombre;
	}
	
	/*
	public void listaCuentas()
	{
		//valoresCuenta = new ArrayList<Cuenta>();
		
		valoresCuenta.add(new Cuenta ( 1 , "#F171467816" , 55.99 , "Corriente" ));
		valoresCuenta.add(new Cuenta ( 1 , "#M13171455" , 75.99 , "Ahorros"));
		valoresCuenta.add(new Cuenta ( 1, "#$%&THYUJIK", 88.99 , "Corriente"));
		valoresCuenta.add(new Cuenta ( 1, "%$&/JHGFTYU12" , 45.99 , "Ahorros"));
		valoresCuenta.add(new Cuenta ( 1 , "%&YHNUJMIK456" , 35.99 , "Corriente"));
		valoresCuenta.add(new Cuenta ( 1 , "SalvaMartha:v#Batman" , 23.99 ,"Ahorros"));
		valoresCuenta.add(new Cuenta ( 1 , "#AWSD141792" , 24.99 , "Corriente"));
		
		/*
		Metodo anterior cuando manejaba herencia 
		
		cliente.add(new Cuenta ( 1 , "Juliana" , 1 , "#F171467816" , 55.99 , "Corriente" ));
		cliente.add(new Cuenta ( 2 , "Maoly" , 1 , "#M13171455" , 75.99 , "Ahorros"));
		cliente.add(new Cuenta ( 3 , "Fernanda" , 1, "#$%&THYUJIK", 88.99 , "Corriente"));
		cliente.add(new Cuenta ( 4 , "Monica" , 1, "%$&/JHGFTYU12" , 45.99 , "Ahorros"));
		cliente.add(new Cuenta ( 5 , "Natalia" , 1 , "%&YHNUJMIK456" , 35.99 , "Corriente"));
		cliente.add(new Cuenta ( 6 , "Laura" , 1 , "SalvaMartha:v#Batman" , 23.99 ,"Ahorros"));
		cliente.add(new Cuenta ( 7 , "Valentina" , 1 , "#AWSD141792" , 24.99 , "Corriente"));
		 
	}*/
	
}
