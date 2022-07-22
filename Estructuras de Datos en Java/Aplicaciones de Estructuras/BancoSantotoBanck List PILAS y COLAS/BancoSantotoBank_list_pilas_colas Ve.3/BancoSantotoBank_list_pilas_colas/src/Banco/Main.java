/*
Universidad Santo Tomas seccional Tunja
Facultad de Ingenieria de Sistemas
Asignatura de Estructura de datos
Ing.Luis Felipe Narvaez Gomez
*/
package Banco;

import javax.swing.JOptionPane;

public class Main
{
	private SantotoBanck santoto;
	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.santoto = new SantotoBanck();
		
		main.santoto.listaClientes();
		
		boolean estado = true;
		while(estado)
		{
			int teclado = 0;
			while(true)
			{
				try {
					teclado = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion \n"
							+ "[1] Mostrar los clientes en el Banco \n"
							+ "[2] Iniciar cajero Automatico \n "
							+ "\n\n[0] Salir del programa"));
					break;
				}catch(NumberFormatException e)
				{JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");				}
			}

			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Error de dato ingresado");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you later");
					estado = false;
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "A continuacion se mostraran los \n clientes actuales del banco en la terminal");
					main.santoto.mostrarClientes();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "A continuacion iniciara el cajero automatico \n tenga en cuenta la lista de clientes del banco  \n dada en la terminal");
					main.santoto.cajeroAutomaticoTwo();
					break;
			}
		}
		
	}

}
