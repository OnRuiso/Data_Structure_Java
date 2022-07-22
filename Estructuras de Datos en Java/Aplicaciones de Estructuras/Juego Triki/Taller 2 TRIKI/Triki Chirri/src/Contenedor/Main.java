/*
 Facultad: Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo Estudiante: 2312660
 Ejercicio: TRIKI 
 */

package Contenedor;

import javax.swing.JOptionPane;


public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//##Cada Objeto celda representa una casilla en mi triki de orden decendente, izquierda a derecha................................................................................
		Casilla celda1 = new Casilla("1");
		Casilla celda2 = new Casilla("2");
		Casilla celda3 = new Casilla("3");
		Casilla celda4 = new Casilla("4");
		Casilla celda5 = new Casilla("5");
		Casilla celda6 = new Casilla("6");
		Casilla celda7 = new Casilla("7");
		Casilla celda8 = new Casilla("8");
		Casilla celda9 = new Casilla("9");
		
		//Armo mi matriz predefinida con los objetos celda ...............................................................................................................................
		
		Casilla [][] matrizTriki = {{celda1 , celda2 , celda3} , 
									{celda4 , celda5 , celda6} ,
									{celda7 , celda8 , celda9}};

		JOptionPane.showMessageDialog(null, "Bienvenido al Juego Triki \n ¡Comencemos! \n \n"+ "Estructura de Datos \n" + "Est. Luis Felipe Narvaez Gomez \n"+ "Cod.Est.2312660 \n");

		
		boolean estado = true;
		
		//Inicio el ciclo while .............................................................................................................................................................
		
		
		while(estado)
		{

			int teclado = Integer.parseInt( JOptionPane.showInputDialog("JUEGO TRIKI \n \n" +
																		" Que posicion quieres? [#] \n Para Salir del juego escribe [0] \n \n \n" +
																		matrizTriki[0][0].getNumero() + " | "+ matrizTriki[0][1].getNumero() +" | "+ matrizTriki[0][2].getNumero() + "\n"+
																		matrizTriki[1][0].getNumero() + " | "+ matrizTriki[1][1].getNumero() +" | "+ matrizTriki[1][2].getNumero() + "\n"+
																		matrizTriki[2][0].getNumero() + " | "+ matrizTriki[2][1].getNumero() +" | "+ matrizTriki[2][2].getNumero()) );
			
			switch(teclado)
			{
				case 1:
					char valorTriki1 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [1]: ").charAt(0);
					String valorTriki11 = Character.toString(valorTriki1);
					matrizTriki[0][0].setNumero(valorTriki11); 
														
					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
														
					break;
					
				case 2:
					char valorTriki2 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [2]: ").charAt(0);
					String valorTriki22 = Character.toString(valorTriki2);
					matrizTriki[0][1].setNumero(valorTriki22);

					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
														
					break;
					
				case 3:
					char valorTriki3 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [3]: ").charAt(0);
					String valorTriki33 = Character.toString(valorTriki3);
					matrizTriki[0][2].setNumero(valorTriki33);

					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
										
					break;
					
				case 4:
					char valorTriki4 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [4]: ").charAt(0);
					String valorTriki44 = Character.toString(valorTriki4);
					matrizTriki[1][0].setNumero(valorTriki44);

					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
										
					break;
					
				case 5:
					char valorTriki5 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [5]: ").charAt(0);
					String valorTriki55 = Character.toString(valorTriki5);
					matrizTriki[1][1].setNumero(valorTriki55);

					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
										
					break;
					
				case 6:
					char valorTriki6 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [6]: ").charAt(0);
					String valorTriki66 = Character.toString(valorTriki6);
					matrizTriki[1][2].setNumero(valorTriki66);

					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
										
					break;
					
				case 7:
					char valorTriki7 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [7]: ").charAt(0);
					String valorTriki77 = Character.toString(valorTriki7);
					matrizTriki[2][0].setNumero(valorTriki77);

					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
										
					break;
					
				case 8:
					char valorTriki8 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [8]: ").charAt(0);
					String valorTriki88 = Character.toString(valorTriki8);
					matrizTriki[2][1].setNumero(valorTriki88);
					
					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
										
					break;
					
				case 9:
					char valorTriki9 =  JOptionPane.showInputDialog("Ingresa 'o' o 'x' [9]: ").charAt(0);
					String valorTriki99 = Character.toString(valorTriki9);
					matrizTriki[2][2].setNumero(valorTriki99);
					
					if( ( matrizTriki[0][0].getNumero().equals(matrizTriki[0][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) || 
							( matrizTriki[1][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[1][0].getNumero().equals(matrizTriki[1][2].getNumero()) ) || 
							( matrizTriki[2][0].getNumero().equals(matrizTriki[2][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][0].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][0].getNumero()) ) ||
							( matrizTriki[0][1].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][1].getNumero().equals(matrizTriki[2][1].getNumero()) ) ||
							( matrizTriki[0][2].getNumero().equals(matrizTriki[1][2].getNumero()) && matrizTriki[0][2].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							
							( matrizTriki[0][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[0][0].getNumero().equals(matrizTriki[2][2].getNumero()) ) ||
							( matrizTriki[2][0].getNumero().equals(matrizTriki[1][1].getNumero()) && matrizTriki[2][0].getNumero().equals(matrizTriki[0][2].getNumero()) ) )
						{
							JOptionPane.showMessageDialog(null,"¡Ganaste!");
							estado = false;
						}else {			JOptionPane.showMessageDialog(null,"Siguiente Jugador");		}
										
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "No valido");
					break;
				
				case 0:
					estado= false;
					break;
				
					
			}
			
		}
		
		
		
	}

}
