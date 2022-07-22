package builderTipoUno;



public class CarBuilder implements ICar{

	private float cilindrada;
	private float caballosFuerza;
	private int velocidadMaxima;
	private String tipoFrenos;
	private String color;
	private String placa;
	
	public CarBuilder(String placa) {
		this.placa=placa;
		this.cilindrada=1000;
		this.tipoFrenos="ABS";
		this.color="verde";
	}
	
	public CarBuilder conCilindrada(float cilindrada) {
		this.cilindrada=cilindrada;
		return this;
	}
	
	public CarBuilder conCaballosFuerza(float caballosFuerza) {
		this.caballosFuerza=caballosFuerza;
		return this;
	}
	public CarBuilder conVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
		return this;
	}
	public CarBuilder conTipoFrenos(String tipoFrenos) {
		this.tipoFrenos=tipoFrenos;
		return this;
	}
	public CarBuilder conColor(String color) {
		this.color=color;
		return this;
	}
	
	 @Override
	    public Car build(){
	        Car car= new Car();
	        car.setCaballosFuerza(this.caballosFuerza);
	        car.setCilindrada(this.cilindrada);
	        car.setColor(this.color);
	        car.setTipoFrenos(this.tipoFrenos);
	        car.setVelocidadMaxima(this.velocidadMaxima);
	        return car;
	    }
}
