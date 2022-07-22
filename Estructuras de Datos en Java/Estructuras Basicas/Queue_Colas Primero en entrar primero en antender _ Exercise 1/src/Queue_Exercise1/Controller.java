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

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Controller
{
	Queue <Cliente> cola = new LinkedList<Cliente>();
	
	public void initCola()
	{
		cola.add(new Cliente("Maoly Vanessa" , 17));
		cola.add(new Cliente("Maria Fernanda" , 27));
		cola.add(new Cliente("Paula" , 37));
		cola.add(new Cliente("Michelle" , 47));
		cola.add(new Cliente("Manuela" , 57));
		cola.add(new Cliente("Juliana" , 67));
		cola.add(new Cliente("Dara" , 77));
		cola.add(new Cliente("Daniela" , 87));
		cola.add(new Cliente("Laura" , 97));
		cola.add(new Cliente("Jaidith" , 107));
	}
	
	public void mostrarCola()
	{
		System.out.println(cola.toString());
	}
	
	public void mostrarPrimero()
	{
		JOptionPane.showMessageDialog(null,cola.peek().toString());
	}
	
	public void atenderCliente()
	{
		JOptionPane.showMessageDialog(null, "Se atendera a la persona: " + cola.peek().toString());
		mostrarCola();
		cola.poll();
	}
	public void tamañoCola()
	{
		JOptionPane.showMessageDialog(null, "Aun quedan: " + cola.size() + " clientes por atender");
	}
	
}
