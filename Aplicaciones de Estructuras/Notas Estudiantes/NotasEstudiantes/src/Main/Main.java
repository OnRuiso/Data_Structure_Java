package Main;
import Main.Launch;

public class Main 
{
	private Launch init; //variable para manejar metodos de la clase Launch 
	private Matrix inic;

	public static void main(String[] args) 
	{
		Main m = new Main(); //variable que hace de puente entre La ckase Main y el metodo main , para utilizar las variables descritas en el o traidas a el
		m.init = new Launch(); // inicializo para trabajar con los metodos de la clase Launch
		m.inic = new Matrix();
		
		m.init.inicioPrograma();
	
		
		// TODO Auto-generated method stub
		

	}

}
