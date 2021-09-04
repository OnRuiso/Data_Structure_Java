/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Requerimientos y diseño de Software
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */
package LiskovSolid;

import java.util.ArrayList;
import java.util.List;

public class Controller
{
	List<Particular> carroParticular;
	List<Publico> carroPublico;
	List<Vehiculo> carroGeneral;
	
	//------------------------------------------------------------------------METODOS-----------------------------------------------------------------------------------------------------
	public void initVechiculos()
	{
		carroParticular = new ArrayList<Particular>();
		
		carroParticular.add(new Particular ( 4 , "verde" , "Automatico" , 1 , 500000000.0 , "ACPM" , 2016 , "nuevo" ) );
		carroParticular.add(new Particular ( 4 , "amarillo" , "Automatico" , 2 , 200000000.0 , "Gas" , 2017 , "nuevo" ) );
		carroParticular.add(new Particular ( 4 , "rojo" , "Mecanico" , 3 , 100000000.0 , "Gasolina" , 2018 , "usado" ) );
		
		carroPublico = new ArrayList<Publico>();
		
		carroPublico.add(new Publico( 80, "camioneta", true, 1, 4000000000.0, "Gasolina", 2014, "nuevo") );
		carroPublico.add(new Publico( 200, "Bus Intercontinental", true, 2, 12000000000.0, "Gasolina", 2015, "nuevo" ));
		carroPublico.add(new Publico( 75, "Bus", true, 3, 2000000000.0, "Gasolina", 2016, "nuevo" ));
		
		carroGeneral = new ArrayList<Vehiculo>();
		
		carroGeneral.add(new Vehiculo( 1, 4000000.0, "ACPM", 2014, "usado" ) );
		carroGeneral.add(new Vehiculo( 2, 2000000.0, "Gasolina", 2011, "usado") );
		carroGeneral.add(new Vehiculo( 3, 1000000.0, "Electrico", 2011, "usado") );
		
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		public void mostrarParticulares()
		{		
			System.out.println("El tamaño de la lista es: " + carroParticular.size() );
			
			for(int i=0 ; i<carroParticular.size() ; i++)
			{
				System.out.println("Vehiculo Particular " + carroParticular.get(i).toString() );
			}
		}
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		public void mostrarPublico()
		{		
			System.out.println("El tamaño de la lista es: " + carroPublico.size() );
			
			for(int i=0 ; i < carroPublico.size() ; i++)
			{
				System.out.println("Vehiculo Publico " + carroPublico.get(i).toString() );
			}
		}
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		public void mostrarGeneral()
		{
			System.out.println("El tamaño de la lista es: " + carroGeneral.size() );
			
			for(int i=0 ; i < carroGeneral.size() ; i++)
			{
				System.out.println("Vehiculo Vendidos " + carroGeneral.get(i).toString() );
			}
		}
	

	
	
}
