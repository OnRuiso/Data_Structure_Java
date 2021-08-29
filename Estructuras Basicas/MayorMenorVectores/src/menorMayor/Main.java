package menorMayor;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// EL MAYOR
		
		char v[]= {'a','n','f','e'};
		char mayor = ' ';
		
		for(int i = 0 ; i < v.length ; i++)
		{
			if(v[i]>mayor)
				mayor=v[i];
		}
		System.out.println("La letra mayor es: "+mayor);
		
		//
		
		int vi[]= {2,5,8,5,5,7,1246,54,51468};
		int mayori = 0;
		
		for(int i = 0 ; i < vi.length ; i++)
		{
			if(vi[i] > mayori)
				mayori = vi[i];
		}
		System.out.println("Entero mayor es: "+mayori);
		
		//
		
		String vs[]= {"hola","pepe","casa","computador"};
		String mayors = "";
		for(int i=0 ; i < vs.length ; i++)
		{
			if(vs[i].compareTo(mayors)>0)
				mayors=vs[i];
		}
		System.out.println("La palabra mas larga es:" + mayors);
		
		//// EL MENOR
		
		char v1[]= {'a','n','f','e'};
		char menor = 'z';//inicializo con lo mas grande posible para que halle en el vector el valor real menor
		//si inicializara en blanco tomaria esto como el menor
		
		for(int i = 0 ; i < v1.length ; i++)
		{
			if(v1[i]<menor)
				menor=v1[i];
		}
		System.out.println("La letra menor es: "+menor);
		
		//  
		
		int vi1[]= {2,5,8,5,5,7,1246,54,51468};
		int menori = 1246; //lo inicializo con uno de los valores del vector para que encuentre el valor menor real
		
		for(int i = 0 ; i < vi1.length ; i++)
		{
			if(vi1[i] < menori)
				menori = vi1[i];
		}
		System.out.println("Entero menor es: "+menori);
		
		//
		
		String vs1[]= {"hola","pepe","casa","computador"};//solo observa la primera letra o caracter de cada palabra
		String menors = vs[0];
		for(int i=0 ; i < vs1.length ; i++)
		{
			if(vs1[i].compareTo(menors)<0)
				menors=vs1[i];
		}
		System.out.println("La palabra mas corta es:" + menors);
		
		//PROMEDIO
		
		float notas[] ={5,5,4,8,9,10,5,8,9,10,10};
		float tempNotas = 0;
		
		for(int i=0 ; i < notas.length ; i++)
		{
			tempNotas =+ notas[i];
		}
			
		float promedio = tempNotas / notas.length ;
		System.out.println("El promedio de notas es: "+promedio);
			
		
	}

}
