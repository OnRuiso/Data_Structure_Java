package Bodega;

public class Producto
{
	private String tipo;
	private double peso;
	
	public Producto() { }

	public Producto(String tipo , double peso)
	{
		this.tipo = tipo;
		this.peso = peso;
	}

	public String getTipo() {		return tipo;	}
	public void setTipo(String tipo) {		this.tipo = tipo;	}

	public double getPeso() {		return peso;	}
	public void setPeso(double peso) {		this.peso = peso;	}
	
	public String toString()
	{
		return "El Producto es: | "+tipo+" | con un peso de:  | "+peso+" |";
	}
	
}
