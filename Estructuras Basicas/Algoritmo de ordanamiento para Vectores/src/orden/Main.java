package orden;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) 
	{
		//##METODO BURBUJA ------------------------------------------------------------------------------------------------------------------------
		//definir tamaño del vector
		int teclado = Integer.parseInt(JOptionPane.showInputDialog("De que tamaño es el vector?: "));
				
		int vector[] = new int[teclado];
		//poner valores en cada posicion		
		for (int i=0 ; i < vector.length ; i++ )
		{
			vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Posicion ["+i+ "] del vector sera?: "));
		}
		//ordenar menor a Mayor
		for (int i=0 ; i < teclado - 1 ; i++ )
		{
			for (int j = i+1 ; j < teclado ; j++)
			{
				if(vector[i]>vector[j])
				{
					int a = vector[i];
					vector[i] = vector[j];
					vector[j] = a;
				}
			}
		}
		for (int i=0 ; i < vector.length ; i++ )
		{
			System.out.println("En orden el vector es:"+ vector[i]);
		}
		
		
		
		
		
		//ordenar Mayor a menor
		for (int i=0 ; i < teclado - 1 ; i++ )
		{
			for (int j = i+1 ; j < teclado ; j++)
			{
				if(vector[i]<vector[j])
				{
					int a = vector[i];
					vector[i] = vector[j];
					vector[j] = a;
				}
			}
		}
		for (int i=0 ; i < vector.length ; i++ )
		{
			System.out.println("En orden el vector es:"+ vector[i]);
		}
		
		//# METODO SELECCION -----------------------------------------------------------------------------------------------------------------------
		
		
		
		
		
	}

}
