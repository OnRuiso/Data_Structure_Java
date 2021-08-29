package Folder;

import javax.swing.JOptionPane;

public class Main
{
	FileBrowser file = new FileBrowser();

	public static void main(String[] args)
	{
		Main m = new Main();
		m.file = new FileBrowser();
		
		m.file.initFolders();
		
		JOptionPane.showMessageDialog(null,"Computador Lenovo Y720 \n <Folders /(°^°)/ >");
		
		boolean estado = true;
		while (estado)
		{
			int teclado = 0;
			while(true)
			{
				try {
					teclado = Integer.parseInt(JOptionPane.showInputDialog("Computador Lenovo Y720. Seleccione una de las opciones: \n\n"
							+ "[0] Salir del Programa \n"
							+ "[1] Ver todos los archivos del PC \n"
							+ "[2] Ver Carpetas en la Unidad D \n"
							+ "[3] Ver Carpetas en la unidad C \n"));
					break;
				}catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");	}
			}
						
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Error en el dato");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you later");
					estado = false;
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "La lista de archivos carpetas la puede ver en la terminal");
					m.file.recorrer();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Las carpetas de la unidad D se pueden ver en la terminal");
					m.file.recorrerRight();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Las carpetas de la unidad E se pueden ver en la terminal");
					m.file.recorrerLeft();
					break;
			}
		}
		

	}

}
