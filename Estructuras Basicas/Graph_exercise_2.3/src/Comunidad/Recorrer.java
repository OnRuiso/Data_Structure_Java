package Comunidad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Recorrer
{
	
	MapRepresentation map = new MapRepresentation();
	Graph graf = new Graph();
	
	//............................................................................Metodo DFS o de profundidad ...................................................................................
	/*
	 * En este metodo se comienza con un dodo cualquiera U
	 * Por cada nodo U se expande en profundidad de forma recursiva por un camino ya definido
	 * Cuando no sea posible visitar mas nodos por ese camino, se regresara al nodo anterior y asi susesibamente
	 * Se repite el proceso con cada uno de los nodos hermanos del nodo ya procesado.
	 * 
	 * Se utiliza una estructura de visitas, un vector , cuyas posiciones representan a los nodos y sus valores representan si ya fue visitado o no
	 */
	
	/*
	static int vertices , arcos;
	static int MAX = 100005; //cantidad maxima de nodos en el grafo
	static ArrayList <Integer> ady[] = new ArrayList[MAX]; //lista de adyacencia
	static boolean marked[] = new boolean [MAX]; //estructura auxiliar para marcar los grafos visitados
	
	//Este metodo recibe el nodo inicial s
	public static void recorridoDFS(Node s)
	{
		marked[s] = true;
		int i, next;
		
		for (i=0 ; i < ady[s].size(); i++)
		{
			next = ady[s].get(i);
			
			if ( !marked[next])
			{
				recorridoDFS(next);
			}
		}
			
	}
	*/
	//..............................................................................MEtodo BFS o busqueda en anchura..................................................................
	
	/*
	 * Este tipo de recorrido  comienza con un nodo U aleatorio para empezar, esto se lo puedo decir yo
	 * Este metodo explora todos auellos nodos v adyacentes a u
	 * Para cada uno de los nodos v, se exploran sus respectivos adyacentes , que no hayan sido visitados antes
	 * Se continua de esta manera hasta recorrer todo el grafo
	 * 
	 * utilizara la estructura d euna cola 
	 * y un vector que nos diga cuando hemos visitado un nodo , esto puede ser utilizando cada posicion que represente un nodo y segun su valor determinara si este ya ha sido recorrido o no
	 * en el vector se puede guardar un boolean
	 * 
	 */
	
	
	
	static int v, e; // vertices, arcos
	static int MAX = 100005; //cantidad maxima de nodos en el grafo
	static ArrayList<Integer> ady[] = new ArrayList[MAX]; //lista de Adyacencia
	static long distance[] = new long[MAX];
	
	// si la distancia en el nodo "U" es menor a "0", distance[u] < 0 , entonces es porque este nodo no ha sido visitado, si es mayor a 0 ya lo hemos recorrido 
	
	//Recibe el nodo inicial s
	static void recorridobfs(int s)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		distance[s] = 0;
		int actual, i , next;
		
		while( !q.isEmpty() )
		{
			actual = q.poll();
			
			for(i = 0 ; i < ady[actual].size(); i++)
			{
				next = ady[actual].get(i);
				
				if (distance[next] == 1)
				{
					distance[next] = distance[actual] +1;
					q.add(next);
				}
			}
		}
		
	}
	
	
	
	//...................................................................Metodo que vieron en clase................................................................................
	
	
/*
	public void recorrer(Node n) {

        if (!n.isMostrar()) {
            System.out.println(" nombre: " + n.getName());
            n.setMostrar(true);
            if (n.getEdges() != null) {
                for (Edge edge : n.getEdges()) {
                    System.out.println(" peso : " + edge.getEdad());
                    recorrer(edge.getMenor());
                }

            }
        }
        }
*/
	
	//.................................................................................................................................................................................
	/* seguir intentando
	 * 
	 * https://www.youtube.com/watch?v=P45bRlCTqHI
	 * 
	 * https://www.youtube.com/watch?v=xK0ShW9G-Ts
	 * 
	 * 
	 * Arco de mayor peso:
	 * 
	 * Una vez recorrido el grafo por cualquiera de los metodos puede llamarse la "edad" por su metodo get correspondiente
	 * en caso de utilizar el metodo BFS, mientras se va recorriendo se puede ir comparando la mayor edad dentro de la cola de elementos
	 * esta edad esta indecsada al nodo en cuestion , por lo que se veria quien tiene el mayor arco
	 * 
	 * otra que veo es tener una lista volatil donde se agreguen las edades una vez se este recorriendo y estimar el mayor
	 * 
	 * 
	 */
       
}
