package builderTipoUno;

public class Car {
	private float cilindrada;
	private float caballosFuerza;
	private int velocidadMaxima;
	private String tipoFrenos;
	private String color;
	private String placa;
	
	
	public Car() {
	}
	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	public float getCaballosFuerza() {
		return caballosFuerza;
	}
	public void setCaballosFuerza(float caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getTipoFrenos() {
		return tipoFrenos;
	}
	public void setTipoFrenos(String tipoFrenos) {
		this.tipoFrenos = tipoFrenos;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Car [cilindrada=" + cilindrada + ", caballosFuerza=" + caballosFuerza + ", velocidadMaxima="
				+ velocidadMaxima + ", tipoFrenos=" + tipoFrenos + ", color=" + color + ", placa=" + placa + "]";
	}
	
	

}
