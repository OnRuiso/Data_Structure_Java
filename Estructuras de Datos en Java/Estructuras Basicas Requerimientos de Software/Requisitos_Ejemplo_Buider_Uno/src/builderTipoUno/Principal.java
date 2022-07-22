package builderTipoUno;

public class Principal {
	
	 public static void main(String[] args) {

	        CarBuilder builder= new CarBuilder("bjq086");
             
	        
	        Car car = builder
	        		     .conColor("negro")
	        		     .conVelocidadMaxima(250)
	        		     .conTipoFrenos("abs")
	        		     .conCilindrada(3000)
	        		     .build();

	        System.out.println(car);
	    }

}
