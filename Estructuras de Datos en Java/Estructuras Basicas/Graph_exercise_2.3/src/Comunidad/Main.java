package Comunidad;

public class Main
{
	MapRepresentation map = new MapRepresentation();
	Recorrer run = new Recorrer();
	Graph graf = new Graph();
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Main m = new Main();
		m.map = new MapRepresentation();
		m.run = new Recorrer();

		Graph graph = m.map.getCities();
        System.out.println(graph);
        
        //m.run.recorridoDFS(m.graf.getNodes().get(0) );
	}

}
