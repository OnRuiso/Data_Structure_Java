package Bodega;

import javax.swing.JOptionPane;

public class Main
{
	private Bodega oxo;
	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.oxo = new Bodega();
		
		boolean estado = true;
		while(estado)
		{
			int teclado = 0;
			while(true)
			{
				try {
					teclado = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea hacer? \n"
							+ "[1] 	Recibir Mercancia \n"
							+ "[2] Ver mercancia existente \n"
							+ "\n[0] Salir del sistema"));
					break;
				}catch(NumberFormatException e)
				{JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");				}
			}
			
			switch(teclado)
			{
				default:
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you later");
					estado = false;
					break;
				case 1:
					main.oxo.recibeDatos();
					break;
				case 2:
					main.oxo.mostrarMercancia();
					break;
			}
		}

	}

}
