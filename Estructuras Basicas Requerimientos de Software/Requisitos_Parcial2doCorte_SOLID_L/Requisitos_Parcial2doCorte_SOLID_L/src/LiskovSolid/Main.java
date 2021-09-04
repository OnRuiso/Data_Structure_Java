/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Requerimientos y dise�o de Software
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */

package LiskovSolid;

import javax.swing.JOptionPane;

/*
 * SOLID _ L :
 * 
 * Principio de sustitucion de Liskov: �Derived classes must be substitutable for their base classes.�
 * 
 *Este principio alude a quien lo ha creado BARBARA LISKOV
 * 	
 * Este principio dice que : �Derived classes must be substitutable for their base classes.�   =  " las clases derivadas deben poder sustituirse por sus clases base�.
 * 
 * Esto quiere decir que si nuestro codigo utiliza una clase padre en especifico , podriamos llegar a utilizar cualquiera de sus clases Hijas y no habria conflictos
 * De la misma manera podria cambiar de utilizar la clase hija a la clase padre y tampoco deberia haber problema
 * 
 * Seg�n Robert C. Martin incumplir el Liskov Substitution Principle (LSP) implica violar tambi�n el principio de Abierto/Cerrado.
 * 
 * El segundo principio de SOLID lo formul� Bertrand Meyer en 1988 en su libro �Object Oriented Software Construction� 
 * y dice: �Deber�as ser capaz de extender el comportamiento de una clase, sin modificarla�. En otras palabras: 
 * las clases que usas deber�an estar abiertas para poder extenderse y cerradas para modificarse.
 * 
 */

public class Main 
{
	private Controller metodo = new Controller();

	public static void main(String[] args)
	{
		Main m = new Main();
		m.metodo = new Controller();
		
		m.metodo.initVechiculos();
		
		boolean estado = true;
		
		while(estado)
		{
			int teclado = 0;
			while(true)
			{
				try {
					teclado = Integer.parseInt( JOptionPane.showInputDialog("Ingrese que tipo de Vehiculos quiere ver: \n"
							+ "[1] Ver Vehiculos Generales \n"
							+ "[2] Ver Vehiculos Particulares \n"
							+ "[3] Ver Vehiculos Publicos \n"
							+ "\n"
							+ "[0] Salir del programa") );
					break;
				}catch(NumberFormatException e)	{
					JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Error"+"</b></h1></html>"+"\n"+"Dato ingresado ["+ e.getMessage() +"] \n"+ "Vuelve a intentarlo");
					}
			}

			
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Error en el dato Ingresado");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you later");
					estado = false;
					break;
				case 1:
					m.metodo.mostrarGeneral();
					break;
				case 2:
					m.metodo.mostrarParticulares();
					break;
				case 3:
					m.metodo.mostrarPublico();;
					break;
			}
		}

	}

}
