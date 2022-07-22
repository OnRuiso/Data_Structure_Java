package SantotoBank;

public class Usuario
{
	private int numero;
	private String nombre;
	private String apellido;
	private int numCuentas;
	private Cuenta clienteSaldo[];
	
	public Usuario() {}
	
	public Usuario(int numero, String nombre, String apellido, int numCuentas, Cuenta clienteSaldo) 
	{
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numCuentas = numCuentas;
		this.clienteSaldo = new Cuenta[5];
	}

	public int getNumero() {		return numero;	}
	public void setNumero(int numero) {		this.numero = numero;	}

	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	public String getApellido() {		return apellido;	}
	public void setApellido(String apellido) {		this.apellido = apellido;	}
	
	public int getNumCuentas() {		return numCuentas;	}
	public void setNumCuentas(int numCuentas) {		this.numCuentas = numCuentas;	}
	
	public Cuenta[] getClienteSaldo() {		return clienteSaldo;	}
	public void setClienteSaldo(Cuenta[] clienteSaldo) {		this.clienteSaldo = clienteSaldo;	}
	
	
	
}
