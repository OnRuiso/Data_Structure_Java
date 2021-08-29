package Comunidad;

public class MapRepresentation
{
    public static Graph getCities()
    	{

        Node maf = new Node("Maria Fernanda"); //24
        Node pau = new Node("Paula Rojas"); //24
        Node kathe =  new Node("Katherine Vargas"); //24
        Node juli = new Node("Juliana"); //24
        Node dani = new Node("Daniela Sandoval"); //24
        
        Node sweety = new Node("Angelica Viviana"); //23
        Node moly = new Node("Maoly Vanessa"); //23
        Node manu = new Node("Manuela Casteblanco");//23
        Node angie = new Node("Angie Alvarez"); //23
        Node jade = new Node("Jaidith"); //23
        
        Node majo = new Node("Maria Jose"); //22        
        Node madchen = new Node("Jeira Michelle"); //22
        Node sofi = new Node("Sofia Arenas"); //22
        Node tania = new Node("Tania"); //22
        Node nath = new Node("Natalia"); //22
        
        Node kohai = new Node("Dara"); //19
        Node ticozzi = new Node("Angie Ticozzi"); //19
        
        Node angieR = new Node("Angie Rojas"); //18
        
        Node tefa = new Node("Estefania"); //17
        
        Node esp2 = new Node("Zineb Rafiq"); //15       
        
        Node esp1 = new Node("Haizea"); //14
        
        
        // Hare una relacion accedente de que persona tiene como mayores a
        
        //esp1 tiene como mayores a:                        //esp2 tiene como mayores a:         			//tefa tiene como mayores a:					//angieR tiene como mayores	a:							//ticozzi tiene como mayores a:
        
        esp1.addEdge(new Edge(esp1, esp2, 1) );							
        esp1.addEdge(new Edge(esp1, tefa, 3) ); 			esp2.addEdge(new Edge(esp2, tefa, 2) );
        esp1.addEdge(new Edge(esp1, angieR, 4) ); 			esp2.addEdge(new Edge(esp2, angieR, 3) );		tefa.addEdge(new Edge(tefa, angieR, 1) );
        esp1.addEdge(new Edge(esp1, ticozzi, 5) ); 			esp2.addEdge(new Edge(esp2, ticozzi, 4) );		tefa.addEdge(new Edge(tefa, ticozzi, 2) );		angieR.addEdge(new Edge(angieR, ticozzi, 1) );			
        esp1.addEdge(new Edge(esp1, kohai, 5) ); 			esp2.addEdge(new Edge(esp2, kohai, 4) );		tefa.addEdge(new Edge(tefa, kohai, 2) );		angieR.addEdge(new Edge(angieR, kohai, 1) );			
        esp1.addEdge(new Edge(esp1, nath, 8) );  			esp2.addEdge(new Edge(esp2, nath, 7) );			tefa.addEdge(new Edge(tefa, nath, 5) );			angieR.addEdge(new Edge(angieR, nath, 4) );				ticozzi.addEdge(new Edge(ticozzi, nath, 3) );
        esp1.addEdge(new Edge(esp1, tania, 8 ) ); 			esp2.addEdge(new Edge(esp2, tania, 7) );		tefa.addEdge(new Edge(tefa, tania, 5) );		angieR.addEdge(new Edge(angieR, tania, 4) );			ticozzi.addEdge(new Edge(ticozzi, tania, 3) );
        esp1.addEdge(new Edge(esp1, sofi, 8) ); 			esp2.addEdge(new Edge(esp2, sofi, 7) );			tefa.addEdge(new Edge(tefa, sofi, 5) );			angieR.addEdge(new Edge(angieR, sofi, 4) );				ticozzi.addEdge(new Edge(ticozzi, sofi, 3) );
        esp1.addEdge(new Edge(esp1, madchen, 8) ); 			esp2.addEdge(new Edge(esp2, madchen, 7) );		tefa.addEdge(new Edge(tefa, madchen, 5) );		angieR.addEdge(new Edge(angieR, madchen, 4) );			ticozzi.addEdge(new Edge(ticozzi, madchen, 3) );
        esp1.addEdge(new Edge(esp1, majo, 8) ); 			esp2.addEdge(new Edge(esp2, majo, 7) );			tefa.addEdge(new Edge(tefa, majo, 5) );			angieR.addEdge(new Edge(angieR, majo, 4) );				ticozzi.addEdge(new Edge(ticozzi, majo, 3) );
        esp1.addEdge(new Edge(esp1, jade, 9) ); 			esp2.addEdge(new Edge(esp2, jade, 8) );			tefa.addEdge(new Edge(tefa, jade, 6) );			angieR.addEdge(new Edge(angieR, jade, 5) );				ticozzi.addEdge(new Edge(ticozzi, jade, 4) );
        esp1.addEdge(new Edge(esp1, angie, 9) );  			esp2.addEdge(new Edge(esp2, angie, 8) );		tefa.addEdge(new Edge(tefa, angie, 6) );		angieR.addEdge(new Edge(angieR, angie, 5) );			ticozzi.addEdge(new Edge(ticozzi, angie, 4) );
        esp1.addEdge(new Edge(esp1, manu, 9) ); 			esp2.addEdge(new Edge(esp2, manu, 8) );			tefa.addEdge(new Edge(tefa, manu, 6) );			angieR.addEdge(new Edge(angieR, manu, 5) );				ticozzi.addEdge(new Edge(ticozzi, manu, 4) );
        esp1.addEdge(new Edge(esp1, moly, 9) ); 			esp2.addEdge(new Edge(esp2, moly, 8) );			tefa.addEdge(new Edge(tefa, moly, 6) );			angieR.addEdge(new Edge(angieR, moly, 5) );				ticozzi.addEdge(new Edge(ticozzi, moly, 4) );
        esp1.addEdge(new Edge(esp1, sweety, 9) );			esp2.addEdge(new Edge(esp2, sweety, 8) );		tefa.addEdge(new Edge(tefa, sweety, 6) );		angieR.addEdge(new Edge(angieR, sweety, 5) );           ticozzi.addEdge(new Edge(ticozzi, sweety, 4) );
        esp1.addEdge(new Edge(esp1, dani, 10) );			esp2.addEdge(new Edge(esp2, dani, 9) );			tefa.addEdge(new Edge(tefa, dani, 7) );			angieR.addEdge(new Edge(angieR, dani, 6) );				ticozzi.addEdge(new Edge(ticozzi, dani, 5) );
        esp1.addEdge(new Edge(esp1, juli, 10) );			esp2.addEdge(new Edge(esp2, juli, 9) );			tefa.addEdge(new Edge(tefa, juli, 7) );			angieR.addEdge(new Edge(angieR, juli, 6) );				ticozzi.addEdge(new Edge(ticozzi, juli, 5) );
        esp1.addEdge(new Edge(esp1, kathe, 10) );			esp2.addEdge(new Edge(esp2, kathe, 9) );		tefa.addEdge(new Edge(tefa, kathe, 7) );		angieR.addEdge(new Edge(angieR, kathe, 6) );			ticozzi.addEdge(new Edge(ticozzi, kathe, 5) );
        esp1.addEdge(new Edge(esp1, pau, 10) );				esp2.addEdge(new Edge(esp2, pau, 9) );			tefa.addEdge(new Edge(tefa, pau, 7) );			angieR.addEdge(new Edge(angieR, pau, 6) );				ticozzi.addEdge(new Edge(ticozzi, pau, 5) );
        esp1.addEdge(new Edge(esp1, maf, 10) );				esp2.addEdge(new Edge(esp2, maf, 9) );			tefa.addEdge(new Edge(tefa, maf, 7) );			angieR.addEdge(new Edge(angieR, maf, 6) );				ticozzi.addEdge(new Edge(ticozzi, maf, 5) );
        

        // kohai tiene como mayores a:						nath tiene como mayores a:						tania tiene como mayores a: 					sofi tiene como mayores a:								madchen tiene como mayores a:
        
        kohai.addEdge(new Edge(kohai, nath, 3) );			
        kohai.addEdge(new Edge(kohai, tania, 3) );			
        kohai.addEdge(new Edge(kohai,sofi, 3) );			
        kohai.addEdge(new Edge(kohai, madchen, 3) );		
        kohai.addEdge(new Edge(kohai, majo, 3) );			
        kohai.addEdge(new Edge(kohai, jade, 4) );			nath.addEdge(new Edge(nath, jade, 1) );			tania.addEdge(new Edge(tania, jade, 1) );		sofi.addEdge(new Edge(sofi, jade, 1) );					madchen.addEdge(new Edge(madchen, jade, 1) );
        kohai.addEdge(new Edge(kohai, angie, 4) );			nath.addEdge(new Edge(nath, angie, 1) );		tania.addEdge(new Edge(tania, angie, 1) );		sofi.addEdge(new Edge(sofi, angie, 1) );				madchen.addEdge(new Edge(madchen, angie, 1) );
        kohai.addEdge(new Edge(kohai, manu, 4) );			nath.addEdge(new Edge(nath, manu, 1) );			tania.addEdge(new Edge(tania, manu, 1) );		sofi.addEdge(new Edge(sofi, manu, 1) );					madchen.addEdge(new Edge(madchen, manu, 1) );
        kohai.addEdge(new Edge(kohai, moly, 4) );			nath.addEdge(new Edge(nath, moly, 1) );			tania.addEdge(new Edge(tania, moly, 1) );		sofi.addEdge(new Edge(sofi, moly, 1) );					madchen.addEdge(new Edge(madchen, moly, 1) );
        kohai.addEdge(new Edge(kohai, sweety, 4) );			nath.addEdge(new Edge(nath, sweety, 1) );		tania.addEdge(new Edge(tania, sweety, 1) );		sofi.addEdge(new Edge(sofi, sweety, 1) );				madchen.addEdge(new Edge(madchen, sweety, 1) );
        kohai.addEdge(new Edge(kohai, dani, 5) );			nath.addEdge(new Edge(nath, dani, 2) );			tania.addEdge(new Edge(tania, dani, 2) );		sofi.addEdge(new Edge(sofi, dani, 2) );					madchen.addEdge(new Edge(madchen, dani, 2) );
        kohai.addEdge(new Edge(kohai, juli, 5) );			nath.addEdge(new Edge(nath, juli, 2) );			tania.addEdge(new Edge(tania, juli, 2) );		sofi.addEdge(new Edge(sofi, juli, 2) );					madchen.addEdge(new Edge(madchen, juli, 2) );
        kohai.addEdge(new Edge(kohai, kathe, 5) );			nath.addEdge(new Edge(nath, kathe, 2) );		tania.addEdge(new Edge(tania, kathe, 2) );		sofi.addEdge(new Edge(sofi, kathe, 2) );				madchen.addEdge(new Edge(madchen, kathe, 2) );
        kohai.addEdge(new Edge(kohai, pau, 5) );			nath.addEdge(new Edge(nath, pau, 2) );			tania.addEdge(new Edge(tania, pau, 2) );		sofi.addEdge(new Edge(sofi, pau, 2) );					madchen.addEdge(new Edge(madchen, pau, 2) );
        kohai.addEdge(new Edge(kohai, maf, 5) );			nath.addEdge(new Edge(nath, maf, 2) );			tania.addEdge(new Edge(tania, maf, 2) );		sofi.addEdge(new Edge(sofi, maf, 2) );					madchen.addEdge(new Edge(madchen, maf, 2) );
        
        
        // majo tiene como mayores a:						jade tiene como mayores a:						angie tiene como mayores a:						manu tiene como mayores a:								maoly tiene como mayores a: 
        
        majo.addEdge(new Edge(majo, jade, 1) );				
        majo.addEdge(new Edge(majo, angie, 1) );			
        majo.addEdge(new Edge(majo, manu, 1) );				
        majo.addEdge(new Edge(majo, moly, 1) );				
        majo.addEdge(new Edge(majo, sweety, 1) );			
        majo.addEdge(new Edge(majo, dani, 2) );				jade.addEdge(new Edge(jade, dani, 1) );			angie.addEdge(new Edge(angie, dani, 1) );		manu.addEdge(new Edge(manu, dani, 1) );					moly.addEdge(new Edge(moly, dani, 1) );
        majo.addEdge(new Edge(majo, juli, 2) );				jade.addEdge(new Edge(jade, juli, 1) );			angie.addEdge(new Edge(angie, juli, 1) );		manu.addEdge(new Edge(manu, juli, 1) );					moly.addEdge(new Edge(moly, juli, 1) );
        majo.addEdge(new Edge(majo, kathe, 2) );			jade.addEdge(new Edge(jade, kathe, 1) );		angie.addEdge(new Edge(angie, kathe, 1) );		manu.addEdge(new Edge(manu, kathe, 1) );				moly.addEdge(new Edge(moly, kathe, 1) );
        majo.addEdge(new Edge(majo, pau, 2) );				jade.addEdge(new Edge(jade, pau, 1) );			angie.addEdge(new Edge(angie, pau, 1) );		manu.addEdge(new Edge(manu, pau, 1) );					moly.addEdge(new Edge(moly, pau, 1) );
        majo.addEdge(new Edge(majo, maf, 2) );				jade.addEdge(new Edge(jade, maf, 1) );			angie.addEdge(new Edge(angie, maf, 1) );		manu.addEdge(new Edge(manu, maf, 1) );					moly.addEdge(new Edge(moly, maf, 1) );
        
        
        //sweety tiene como mayores a:
        
        sweety.addEdge(new Edge(sweety, dani, 1) );			
        sweety.addEdge(new Edge(sweety, juli, 1) );			
        sweety.addEdge(new Edge(sweety, kathe, 1) );			
        sweety.addEdge(new Edge(sweety, pau, 1) );			
        sweety.addEdge(new Edge(sweety, maf, 1) );			

        
        
        Graph graph = new Graph();
        graph.addNode(esp1);        graph.addNode(esp2);        graph.addNode(tefa);        graph.addNode(angieR);      graph.addNode(ticozzi);
        graph.addNode(kohai);       graph.addNode(nath);        graph.addNode(tania);       graph.addNode(sofi);        graph.addNode(madchen);
        graph.addNode(majo);        graph.addNode(jade);        graph.addNode(angie);        graph.addNode(manu);        graph.addNode(moly);
        graph.addNode(sweety);
        

        return graph;
    }

    public static void main(String[] args)
    {
        Graph graph = getCities();
        System.out.println(graph);
    }
}
