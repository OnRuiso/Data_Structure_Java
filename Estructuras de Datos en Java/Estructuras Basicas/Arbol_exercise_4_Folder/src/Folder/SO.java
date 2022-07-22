package Folder;

public class SO
{
	private String nombre;
	private String tipo;
	private double tamaño;
	private double tamañoEnDisco;
	private String contiene;
	private String creado;
	private String atributos;
	

	public SO(	String nombre, String tipo, double tamaño, double tamañoEnDisco, String contiene, String creado, String atributos )
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.tamañoEnDisco = tamañoEnDisco;
		this.contiene = contiene;
		this.creado = creado;
		this.atributos = atributos;
	}
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public String getTipo() {		return tipo;	}
	public void setTipo(String tipo) {		this.tipo = tipo;	}
	
	public double getTamaño() {		return tamaño;	}
	public void setTamaño(double tamaño) {		this.tamaño = tamaño;	}
	
	public double getTamañoEnDisco() {		return tamañoEnDisco;	}
	public void setTamañoEnDisco(double tamañoEnDisco) {		this.tamañoEnDisco = tamañoEnDisco;	}
	
	public String getContiene() {		return contiene;	}
	public void setContiene(String contiene) {		this.contiene = contiene;	}
	
	public String getCreado() {		return creado;	}
	public void setCreado(String creado) {		this.creado = creado;	}
	
	public String getAtributos() {		return atributos;	}
	public void setAtributos(String atributos) {		this.atributos = atributos;	}
	
	
	public String toString()
	{
		return "Folder Propieties: \n\n"
				+"Nombre: "+nombre+"\n"
				+"Tipo: "+tipo+"\n"
				+"Tamaño: "+tamaño+"Gb \n"
				+"Tamaño en Disco: "+tamañoEnDisco+"Gb \n"
				+"Contiene: "+contiene+"\n"
				+"Creado: "+creado+"\n"
				+"Atributos: "+atributos+"\n";
	}
	
	
}
