package Enteros;

public class Main
{
	Tablero pizarra = new Tablero();

	public static void main(String[] args)
	{
		Main m = new Main();
		m.pizarra = new Tablero();
		
		m.pizarra.initTablero();
		m.pizarra.recorrer();

	}

}
