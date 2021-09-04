/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Requerimientos y diseño de Software
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */
package LiskovSolid;


public class Particular extends Vehiculo
{
	// Hereda los atributos de la clase vehiculos, por lo que los puede utilizar
	// los atributos que se escriban en este sera propios solo de Particular
	private int numPuertas;
	private String color;
	private String tipoMotor;
	
	public Particular()	{ super();	}
	public Particular(int numPuertas, String color, String tipoMotor    ,     int id, double valor , String tipoCombustible , int modelo , String estado)
	{
		super(id, valor , tipoCombustible , modelo , estado);
		this.numPuertas = numPuertas;
		this.color = color;
		this.tipoMotor = tipoMotor;
	}
	public int getNumPuertas() {		return numPuertas;	}
	public void setNumPuertas(int numPuertas) {		this.numPuertas = numPuertas;	}
	
	public String getColor() {		return color;	}
	public void setColor(String color) {		this.color = color;	}
	
	public String getTipoMotor() {		return tipoMotor;	}
	public void setTipoMotor(String tipoMotor) {		this.tipoMotor = tipoMotor;	}
	
	public String toString()
	{
		return super.toString()+" No.Puertas: "+numPuertas+" Color: "+color+" Motor: "+tipoMotor; 
	}
}
