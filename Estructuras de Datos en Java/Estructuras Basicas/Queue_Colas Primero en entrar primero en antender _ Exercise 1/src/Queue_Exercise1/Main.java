/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 
 CODIGO MODIFICADO _ EJERCICIO EN CLASE _ 19-04-2021
 */
package Queue_Exercise1;

import javax.swing.JOptionPane;

public class Main
{
	private Controller owo;
	
	public static void main(String[] args)
	{
		Main m = new Main();
		m.owo = new Controller();
		//add añadir
		//peek muestra el primero
		//poll sacar
		//size tamaño
		
		//Queue<Cliente> cola = new LinkedList<Cliente>;
		m.owo.initCola();
		JOptionPane.showMessageDialog(null, "Los clientes para este dia son: ");
		m.owo.mostrarCola();
		JOptionPane.showMessageDialog(null, "El primer cliente que esta haciendo la fila es: ");
		m.owo.mostrarPrimero();
		
		for(int i = 0; i<10 ; i++)
		{
			m.owo.atenderCliente();
			m.owo.tamañoCola();
		}
		
		JOptionPane.showMessageDialog(null, "See you later");
		
		
		
		

	}

}
