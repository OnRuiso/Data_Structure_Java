/*
Universidad Santo Tomas seccional Tunja
Facultad de Ingenieria de Sistemas
Asignatura de Estructura de datos
Ing.Luis Felipe Narvaez Gomez
*/
package Banco;

public class Cuenta extends Cliente
{
	private int numCuenta;
	private String clave;
	private double saldo;
	private String tipoCuenta;
	
	public Cuenta()
	{
		super();
	}
	public Cuenta (double numeroCliente , String nombre , int numCuenta , String clave , double saldo , String tipoCuenta) 
	{
		super(numeroCliente , nombre);
		this.numCuenta = numCuenta;
		this.clave = clave;
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
	}
	
	public int getNumCuenta() {		return numCuenta;	}
	public void setNumCuenta(int numCuenta) {		this.numCuenta = numCuenta;	}
	
	public String getClave() {		return clave;	}
	public void setClave(String clave) {		this.clave = clave;	}
	
	public double getSaldo() {		return saldo;	}
	public void setSaldo(double saldo) {		this.saldo = saldo;	}
	
	public String getTipoCuenta() {		return tipoCuenta;	}
	public void setTipoCuenta(String tipoCuenta) {		this.tipoCuenta = tipoCuenta;	}
	
	public String toString() {
		return super.toString()+" Numero de Cuenta: " + numCuenta + " con clave de acceso : "+clave+" posee un saldo de: "+saldo+ " siendo de tipo: "+tipoCuenta;
	}
	
}
