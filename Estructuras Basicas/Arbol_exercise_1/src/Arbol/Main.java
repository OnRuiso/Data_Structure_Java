package Arbol;

public class Main
{
	/*
	 * (by OnRuiso)
	 * Apuntes personales:
	 * 
	 * Un arbol binario es una organizacion de elementos conformado por una raiz de la cual se desplegan nodos de par en par
	 * El ordenamiento  va en que los elementos situados en el lado izquierdo tendran un indice menor que los situados en el derecho
	 */
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Arbol arbol = new Arbol();
		
		arbol.insertContenido(0, "Naranja");
		arbol.insertContenido(2, "Manzana");
		arbol.insertContenido(4, "Pera");
		arbol.insertContenido(1, "Platano");
		arbol.insertContenido(3, "Guayaba");
		arbol.insertContenido(6, "Mandarina");
		arbol.insertContenido(5, "Papaya");
		arbol.insertContenido(7, "Sandia");
		
		//notece que estan en desorden
		// que estoy llamando el metodo como si nada, porque no estan en privado en la clase Arbol y no hay getters and setter para acceder a ellos
		// esto en la practica esta mal pero por estudio inicial "Arbol_exercise_1" lo auto valo
		// nota arreglar para version 2, codigo limpio
		
		arbol.recorrer(arbol.raiz);
		
		//recorrera el nodo raiz, el cual se embiara como parametro al metodo "recorrer" de la clase Arbol
		
		//lo que arrojara por consola es la lectura de todo el arbol de menor a mayor sin contar la raiz
		
		/*
		 * 	Indice: |0| fruta: |Naranja| 
			Indice: |1| fruta: |Platano| 
			Indice: |2| fruta: |Manzana| 
			Indice: |3| fruta: |Guayaba| 
			Indice: |4| fruta: |Pera| 
			Indice: |5| fruta: |Papaya| 
			Indice: |6| fruta: |Mandarina| 
			Indice: |7| fruta: |Sandia| 
			

		 */
		
		

	}

}
