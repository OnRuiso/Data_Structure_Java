package SantotoBank;

public class Cuenta
{
	private int numeroCuenta;
	private int tipo;
	private double saldo;
	
	
	public Cuenta() {}
	
	public Cuenta(int numeroCuenta, int tipo , double saldo)
	{
		this.numeroCuenta = numeroCuenta;
		this.tipo = tipo;
		this.saldo = saldo;	
	}

	public int getNumeroCuenta() {		return numeroCuenta;	}
	public void setNumeroCuenta(int numeroCuenta) {		this.numeroCuenta = numeroCuenta;	}

	public int getTipo() {		return tipo;	}
	public void setTipo(int tipo) {		this.tipo = tipo;	}

	public double getSaldo() {		return saldo;	}
	public void setSaldo(double saldo) {		this.saldo = saldo;	}
	
	
}
