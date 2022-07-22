package Arbol;

//nota: esta codigo tiene los reerrores empezando con la declaracion de privados atributos, arreglar en la version limpia de estudio

public class Arbol
{
	//un arbol es una sucesion de nodos
	//debemos inicializar este arbol , "plantarlo", para eso creamos la raiz del arbol
	
	Nodo raiz;
	//contructor para inicializar la raiz
	public Arbol()
	{
		raiz=null;
	}
	
	//metodo para insertar el contenido de las ramas(nodos hijos de la raiz)
	public void insertContenido(int i, Object fruta)//indice del nodo (quien nos dice en que nodo estamos) , contenido del nodo (para este ejemplo es fruta)
	{
		//Object me permitira ingresar cualquier tipo de dato poara este ejemplo
		//bien object puede cambiarse por String, Double , Integer o lo que yo quiera
		
		
		Nodo n = new Nodo(i); //objeto n , inicializamos un nodo que variara segun el indice
		n.contenido = fruta; //n tendra un contenido , esta es la fruta
		
		//validamos si el arbol hasta ahora va a empezar
		//si la raiz es null entonces hasta ahora va a empezar a crecer , por tanto el primer objeto del arbol , la raiz , sera lo que este en este momento en 
		//si por el contrario hay algo en la raiz entonces el contenido de n debe situarse a la derecha o a la izquierda
		// para ello la raiz la almacenaremos en una nueva variabe auxiliar primero
		
		if(raiz == null)
		{
			raiz=n;
		}
		else
		{
			Nodo aux = raiz;
			
			//ahora tenemos que nuevamente validar
			/*
			 * mientras que aux no sea nulo, haremos que el padre, el nodo que posee nos hijos sea el auxiliar
			 *   
			 *    padre
			 *   /     \
			 * hijo    hijo
			 * 
			 * De esta manera estaremos escalando dentro del arbol
			 */
			
			while (aux != null)
			{
				n.padre = aux;
				
				//recordemos que el orden de este arbol es que el indice de la izquierda es mayor a la derecha
				//bajo este precepto podemos ordenar lo que vamos metiendo por contenido
				//para esto debemos comparar el indice que lleva el objeto n (llave) con el indice qe lleva la variable aux (llave)
				
				if(n.llave >= aux.llave)
				{
					aux = aux.derecha;
				}
				else {
					aux = aux.izquierda;
				}
				
			}
			
			//debemos hacer que queden enlazados una vez termina el ciclo while 
			if(n.llave < n.padre.llave)
			{
				n.padre.izquierda = n;
			}else {
				n.padre.derecha = n;
			}
			
		}
	}
	
	//metodo para recorrer en orden el arbol de izquierda a derecha y organizarlos de menor al mayor
	// este metodo es recursibo , esto quiere decir que se llama a si mismo para la ejecucucion
	public void recorrer(Nodo n)
	{
		if(n != null)
		{
			recorrer(n.izquierda);
			System.out.println("Indice: |"+n.llave+"| fruta: |"+n.contenido+"| Version 1");
			recorrer(n.derecha);
		}
	}
	
	
	//clase privada para el nodo
	private class Nodo
	{
		public Nodo padre; 			//el nodo padre
		public Nodo derecha; 		// el nodo de la derecha
		public Nodo izquierda; 		// el nodo de la izquierda
		
		public int llave; 			//indice o llave que identifica al nodo que se esta utilizando
		public Object contenido;		//el contenido que tendra el nodo (Object es un tipo de atrivuto que me permite almacenar cualquier tipo de dato, un objeto)
		
		//constructor para inicializar las variables del arbol
		// este recibira el indice o llave como parametro para ser utilizado
		public Nodo(int indice)
		{
			llave=indice;
			derecha=null;
			izquierda=null;
			padre=null;
			contenido=null;
			
		}
	}
}
