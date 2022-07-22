package Foresta;

public class Fruteria
{
	Arbol arbol = new Arbol();
	
//-----------------------------------------------------------------------------------------------------	
	public void initFruteria()
	{
		arbol.insertContenido(0, "Naranja");
		arbol.insertContenido(2, "Manzana");
		arbol.insertContenido(4, "Pera");
		arbol.insertContenido(1, "Platano");
		arbol.insertContenido(3, "Guayaba");
		arbol.insertContenido(6, "Mandarina");
		arbol.insertContenido(5, "Papaya");
		arbol.insertContenido(7, "Sandia");
	}
//-----------------------------------------------------------------------------------------------------
	public void recorrer()
	{
		arbol.recorrerMenorMayor(arbol.getRaiz());
	}

}
