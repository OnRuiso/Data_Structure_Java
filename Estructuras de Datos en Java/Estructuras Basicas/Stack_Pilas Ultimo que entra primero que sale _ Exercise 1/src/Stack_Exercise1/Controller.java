/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 
 CODIGO MODIFICADO _ EJERCICIO EN CLASE _ 19-04-2021
 */
package Stack_Exercise1;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Controller
{	
	
	Stack pila = new Stack();
	
	public void mostrarPila()
	{
		for(int i = 0; i < pila.size() ; i++)
		{
			System.out.println(pila.get(i));
		}
	}
	
	public void entrarFicha()
	{
		Ficha tokeng = new Ficha();
		
		JOptionPane.showMessageDialog(null, "Aqui podras insertar una nueva Ficha");
		int numgeneral = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero quieres que tenga tu ficha?: "));
		tokeng.setNumero(numgeneral);
		String colorgeneral = JOptionPane.showInputDialog("¿Que color queires que tenga tu ficha?");
		tokeng.setColor(colorgeneral);
		
		pila.push(tokeng);
		
		JOptionPane.showMessageDialog(null, "Puedes ver la Pila de objetos en la Terminal");
		mostrarPila();
	}
	
	public void sacarFicha()
	{
		JOptionPane.showMessageDialog(null,"Eliminaras el ultimo objeto ingresado");
		pila.pop();
		
		JOptionPane.showMessageDialog(null, "Puedes ver la Pila de objetos en la Terminal");
		mostrarPila();
	}
	public void tamañoPila()
	{
		//size
	}
	public void initPila()
	{
		Ficha token1 = new Ficha();				Ficha token4 = new Ficha();
		token1.setColor("Rojo");				token4.setColor("Cyan");
		token1.setNumero(1);					token4.setNumero(4);
		
		Ficha token2 = new Ficha();				Ficha token5 = new Ficha();
		token2.setColor("Verde");				token5.setColor("Magenta");
		token2.setNumero(2);					token5.setNumero(5);
		
		Ficha token3 = new Ficha();				Ficha token6 = new Ficha();
		token3.setColor("Azul");				token6.setColor("Yellow");
		token3.setNumero(3);					token6.setNumero(6);
		
		pila.push(token1);
		pila.push(token2);
		pila.push(token3);
		pila.push(token4);
		pila.push(token5);
		pila.push(token6);
	}
}
