package Folder;

public class SO
{
	private String nombre;
	private String tipo;
	private double tama�o;
	private double tama�oEnDisco;
	private String contiene;
	private String creado;
	private String atributos;
	

	public SO(	String nombre, String tipo, double tama�o, double tama�oEnDisco, String contiene, String creado, String atributos )
	{
		this.nombre = nombre;
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.tama�oEnDisco = tama�oEnDisco;
		this.contiene = contiene;
		this.creado = creado;
		this.atributos = atributos;
	}
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public String getTipo() {		return tipo;	}
	public void setTipo(String tipo) {		this.tipo = tipo;	}
	
	public double getTama�o() {		return tama�o;	}
	public void setTama�o(double tama�o) {		this.tama�o = tama�o;	}
	
	public double getTama�oEnDisco() {		return tama�oEnDisco;	}
	public void setTama�oEnDisco(double tama�oEnDisco) {		this.tama�oEnDisco = tama�oEnDisco;	}
	
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
				+"Tama�o: "+tama�o+"Gb \n"
				+"Tama�o en Disco: "+tama�oEnDisco+"Gb \n"
				+"Contiene: "+contiene+"\n"
				+"Creado: "+creado+"\n"
				+"Atributos: "+atributos+"\n";
	}
	
	
}
