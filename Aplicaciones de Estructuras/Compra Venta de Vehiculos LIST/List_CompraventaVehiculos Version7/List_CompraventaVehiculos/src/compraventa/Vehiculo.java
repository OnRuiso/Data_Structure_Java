package compraventa;

public class Vehiculo {
	
	private int id;
	private double valor;
	private String tipoCombustible;
	private int modelo;
	private String estado;
	
	public Vehiculo() {	}
	
	public Vehiculo(int id, double valor , String tipoCombustible , int modelo , String estado)
	{
		this.id = id;
		this.valor = valor;
		this.tipoCombustible = tipoCombustible;
		this.modelo = modelo;
	}

	public int getId() {		return id;	}
	public void setId(int id) {		this.id = id;	}

	public double getValor() {		return valor;	}
	public void setValor(double valor) {		this.valor = valor;	}

	public String getTipoCombustible() {		return tipoCombustible;	}
	public void setTipoCombustible(String tipoCombustible) {		this.tipoCombustible = tipoCombustible;	}

	public int getModelo() {		return modelo;	}
	public void setModelo(int modelo) {		this.modelo = modelo;	}

	public String getEstado() {		return estado;	}
	public void setEstado(String estado) {		this.estado = estado;	}
	
	
	public String toString()
	{
		return "ID: " + id + "Valor: "+ valor + "Combustible: "+ tipoCombustible + "Modelo: "+ modelo + "Estado: "+ estado; 
	}

}
