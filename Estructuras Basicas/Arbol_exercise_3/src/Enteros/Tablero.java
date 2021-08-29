package Enteros;

public class Tablero
{
	Arbol arbol = new Arbol();
	
	//-----------------------------------------------------------------------------------------------------
	public void initTablero()
	{
		arbol.insertContenido(0, 0);
		arbol.insertContenido(2, 2);
		arbol.insertContenido(4, 4);
		arbol.insertContenido(1, 1);
		arbol.insertContenido(3, 3);
		arbol.insertContenido(6, 6);
		arbol.insertContenido(5, 5);
		arbol.insertContenido(7, 7);
	}
	
	//-----------------------------------------------------------------------------------------------------
	public void recorrer()
	{
		arbol.recorrerMenorMayor(arbol.getRaiz());
	}

}
