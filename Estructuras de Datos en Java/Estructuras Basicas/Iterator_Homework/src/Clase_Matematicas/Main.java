package Clase_Matematicas;

import java.util.List;

import javax.swing.JOptionPane;

public class Main
{
	private Controller control;
	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.control = new Controller();
		
		main.control.initAlumnos();
		
		JOptionPane.showMessageDialog(null, "Comprobacion de metodos de recorrido de Listas");
		
		boolean estado = true;
		while(estado)
		{	
			int teclado = 0;
			while(true)
			{
				try
				{
					teclado = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la clase de Maternidad de Gallinas \n "
							+ "Aqui podra observar o eliminar los estudintes actuales inscritos en el curso. \n\n"
							+ "(NOTA: Cada muestra de los estudiantes o eliminacion \n de los mismos utilizara un metodo distinto ) \n\n"
							+ "[1] Mostrar Todos los estudiantes Inscritos ( For Normal 'i' ) \n"
							+ "[2] Mostrar Todos los estudiantes Inscritos ( For Each ) \n"
							+ "[3] Mostrar Todos los estudiantes Inscritos ( Iterator 'next' ) \n"
							+ "[4] Mostrar Todos los estudiantes Inscritos ( Iterator 'hasnext') \n"
							+ "[5] Mostrar Todos los estudiantes Inscritos ( Iterator 'next + hasnext') \n"
							+ "[6] Eliminar un estudiante Inscrito ( For Each ) \n"
							+ "[7] Eliminar un estudiante Inscrito ( Iterator ) \n"
							+ "\n\n [0] Salir del Programa" ));
					break;
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");
				}
			}			
			
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Esta no es una opcion, intentalo de nuevo");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you later");
					estado = false;
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "La Lista de Estudiantes puede observarse en la Terminal");
					main.control.recorrerForNormal();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "La Lista de Estudiantes puede observarse en la Terminal");
					main.control.recorrerForEach();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "La Lista de Estudiantes puede observarse en la Terminal");
					main.control.recorrerIteratorNext();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "La Lista de Estudiantes puede observarse en la Terminal");
					main.control.recorrerIteratorHasNext();
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "La Lista de Estudiantes puede observarse en la Terminal");
					main.control.fusionNextHasnextIterator();
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "La Lista de Estudiantes puede observarse en la Terminal");
					main.control.fusionNextHasnextIterator();
					main.control.deleteForEach();
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "La Lista de Estudiantes puede observarse en la Terminal");
					main.control.fusionNextHasnextIterator();
					main.control.deleteIterator();
					break;
			}
		}
	}

}
