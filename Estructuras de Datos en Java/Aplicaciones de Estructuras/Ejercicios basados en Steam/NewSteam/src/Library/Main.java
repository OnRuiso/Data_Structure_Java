package Library;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean estado = true;
		String teclado;
		
		while ( estado )
		{
			teclado = JOptionPane.showInputDialog(
					"Bienvenido a su Biblioteca de STEAM"
					+"\n \n Para ver los detalles de cada uno de los juegos listados introdusca la letra respectiva en el cuadro de Ingreso"
					+"\n \n [a] MasterChief Collection"
					+"\n [b] The Forest"
					+"\n [c] Quake III Arena"
					+"\n [d] Quake Champions"
					+"\n [e] For Honor"
					+"\n [f] Warframe"
					+"\n [g] Doom"
					+"\n [h] Doom Eternal"
					+"\n [i] Guears of war Ultimate Edition"
					+"\n [j] Guears of war 5"
					+"\n [k] Guears of war 4"
					+"\n \n Escriba exit para salir de la biblioteca de STEAM");
			
			if (teclado.equals("exit")) estado = false;
			//else Datos.juegos(teclado);
			else System.out.println("ALV");
		}
	}
}
