/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 
 CODIGO MODIFICADO _ EJERCICIO EN CLASE _ 19-04-2021
 */
package Exercise_Uno;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		LinkedList<Integer> numeros = new LinkedList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		
		JOptionPane.showMessageDialog(null, "La lista la puedes ver en la Terminal: ");
		for (Integer n:numeros)
		{
			System.out.print(" | "+n);
		}
		
		JOptionPane.showMessageDialog(null, "La primera posicion tienen el numero: "+ numeros.getFirst());
		JOptionPane.showMessageDialog(null, "La ultima posicion tiene el numero: " + numeros.getLast());

		
		int newFirst = Integer.parseInt(JOptionPane.showInputDialog("Escribe el nuevo numero que ira en la primera posicion: "));
		numeros.addFirst(newFirst);
		JOptionPane.showMessageDialog(null, "La nueva lista la puedes ver en la Terminal: ");
		for (Integer n:numeros)
		{
			System.out.println(" | "+n);
		}
		
		int newLast = Integer.parseInt(JOptionPane.showInputDialog("Escribe el nuevo numero que ira en la ultima posicion: "));
		numeros.addLast(newLast);
		JOptionPane.showMessageDialog(null, "La nueva lista la puedes ver en la Terminal: ");
		for (Integer n:numeros)
		{
			System.out.print(" | "+n);
		}
		
		numeros.removeFirst();
		numeros.removeLast();
		JOptionPane.showMessageDialog(null, "La nueva lista la puedes ver en la Terminal sin ultimo ni primero: ");
		for (Integer n:numeros)
		{
			System.out.println(" | "+n);
		}
		

	}

}
