package SantotoBank;

public class Usuario
{
	private int numero;
	private String nombre;
	private String apellido;
	private int numCuentas;
	
	private int numeroCuenta[];
	private String tipo[];
	private double saldo[];
	
	public Usuario()
	{
		this.numeroCuenta = new int[3];
		this.saldo = new double[3];
		this.tipo = new String[3];
		enableTipo();
	}
	
	public Usuario(int numero, String nombre, String apellido, int numCuentas, Cuenta clienteSaldo) 
	{
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numCuentas = numCuentas;
		
		this.numeroCuenta = new int[3];
		this.tipo = new String[3];
		this.saldo = new double[3];
		enableTipo();
	}

	public int getNumero() {		return numero;	}
	public void setNumero(int numero) {		this.numero = numero;	}

	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	public String getApellido() {		return apellido;	}
	public void setApellido(String apellido) {		this.apellido = apellido;	}
	
	public int getNumCuentas() {		return numCuentas;	}
	public void setNumCuentas(int numCuentas) {		this.numCuentas = numCuentas;	}
	
	
	//----------- eran de la clase cuenta
	
	public int[] getNumeroCuenta() {		return numeroCuenta;	}
	public void setNumeroCuenta(int[] numeroCuenta) {		this.numeroCuenta = numeroCuenta;	}

	public String[] getTipo() {		return tipo;	}
	public void setTipo(String[] tipo) {		this.tipo = tipo;	}

	public double[] getSaldo() {		return saldo;	}
	public void setSaldo(double[] saldo) {		this.saldo = saldo;	}
	
	// ----
	

	public void enableTipo()
	{
		
		for(int i=0; i < 3; i++)		{			numeroCuenta[i] = 0;		}
		for(int i=0; i < 3; i++)		{			saldo[i] = 0;		}
		for(int i=0; i < 3; i++)		{			tipo[i] = new String();		}
		for(int i = 0 ; i < 5; i++)		{			apellido = "Z";		}
	}
	
}
