package Folder;

public class UnitC extends SO
{
	private String ubicacion;
	
	/*
	public UnitC () {
		super();
	}
	*/
	public UnitC ( String ubicacion ,   String nombre, String tipo, double tamaño, double tamañoEnDisco, String contiene, String creado, String atributos)
	{
		super(nombre, tipo, tamaño, tamañoEnDisco, contiene, creado, atributos);
		this.ubicacion = ubicacion;
	}

	public String getUbicacion() {		return ubicacion;	}
	public void setUbicacion(String ubicacion) {		this.ubicacion = ubicacion;	}
	
	public String toString()
	{
		return super.toString() + "Ubicacion : "+ubicacion+"\n\n";
	}
}
