//TALLER 1. BIBLIOTECA DE STEAM SENCILLA.
//Estudiante: Luis Felipe Narvaez Gomez
//Codigo:2312660
//Clase de Estructura de Datos

package steamII;

public class Juego 
{
	//Mis atributos   ................................................................................................................................................
	
	private String nombre;
	private String descripcion; 
	private double precio;
	private int dlc;

	//Contructores que utilizare para la informacion del juego   ................................................................................................................................................
	
	public Juego(String nombre, String descripcion , double precio , int dlc)// mi contructor principal con cada uno de los componentes que hace mis atributos generales
	{
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.dlc = dlc;
	}

	public Juego() //contructor de prueba cuando los objetos estan vacios recurriran a este constructor
	{
	}

	
	//GET y SET para mis atributos    ................................................................................................................................................
	
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	public String getDescripcion() {		return descripcion;	}
	public void setDescripcion(String descripcion) {		this.descripcion = descripcion;	}

	public int getDlc() {		return dlc;	}
	public void setDlc(int dlc) {		this.dlc = dlc;	}

	public double getPrecio() {		return precio;	}
	public void setPrecio(double precio) {		this.precio = precio;	}
	
	
	
}
