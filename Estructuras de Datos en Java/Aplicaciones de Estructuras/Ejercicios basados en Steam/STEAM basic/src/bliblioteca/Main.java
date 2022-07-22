package bliblioteca;

import javax.swing.JOptionPane;//libreria de JOption

public class Main {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		boolean estado = true;
		
		while (estado)
		{
			String teclado;
			teclado = JOptionPane.showInputDialog("Ingrese la letra n , m o x. En caso de querer salir, escriba EXIT");
			
			
			switch(teclado)
			{
				case "n":
					JOptionPane.showMessageDialog(null, "Nombre: MasterChief Collection "+
														"\n Estado: Actualizado" +
														"\n Tiempo de Juego; XXXXh" + 
														"\n Descripcion: bla bla BLA"+
														"\n Numero de DLC´s: "+
														"\n Jugado por ultima vez");
					break;
					
				case"m":
					JOptionPane.showMessageDialog(null, 
							"Nombre: SuperMario 64 "+
							"\n Estado: Actualizado" +
							"\n Tiempo de Juego; XXXXh" + 
							"\n Descripcion: bla bla BLA"+
							"\n Numero de DLC´s: "+
							"\n Jugado por ultima vez");
					break;
					
				case"x":
					JOptionPane.showMessageDialog(null, 
							"Nombre: Quake "+
							"\n Estado: Actualizado" +
							"\n Tiempo de Juego; XXXXh" + 
							"\n Descripcion: bla bla BLA"+
							"\n Numero de DLC´s: "+
							"\n Jugado por ultima vez");
					break;
				
				case"exit":
					estado = false;
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Esto no es una variable valida");
				
			}
			
			
		}
		
		

	}

}
