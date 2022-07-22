package compraventa;

public class Publico extends Vehiculo 
{
	// Hereda los atributos de la clase vehiculos, por lo que los puede utilizar
		// los atributos que se escriban en este sera propios solo de Particular
	
	private int capacidad;
	private String tipo;
	private boolean cupo;
	
	public Publico() {	}
	
	public Publico(int capacidad, String tipo, boolean cupo   ,  int id, double valor , String tipoCombustible , int modelo , String estado)
	{
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.cupo = cupo;
	}

	public int getCapacidad() {		return capacidad;	}
	public void setCapacidad(int capacidad) {		this.capacidad = capacidad;	}

	public String getTipo() {		return tipo;	}
	public void setTipo(String tipo) {		this.tipo = tipo;	}

	public boolean isCupo() {		return cupo;	}
	public void setCupo(boolean cupo) {		this.cupo = cupo;	}
	
	public String toString()
	{
		return "Capacidad: "+capacidad+" Tipo: "+tipo+" Cupo: "+cupo; 
	}
}
