package Main;

import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Launch 
{
	Icon imgIcono = new ImageIcon(getClass().getResource("/Main/imgMainII.png"));
	Icon imgEncabezado = new ImageIcon(getClass().getResource("/Main/imagenMainII.png"));
	
	private Matrix one;
	
	
	public void inicioPrograma()
	{
		
		Launch granMatriz = new Launch();
		granMatriz.one = new Matrix();
		
		//granMatriz.one.iniMatriz();
		
		JOptionPane.showMessageDialog(null, 
						"Welcome \n\n"
						+ "Curso de Domestica: \n"
						+ "<html><h1 align='center'><b> Tatuaje para principiantes </b></h1></html> \n"
						+ "Un curso de Polilla Tattoo, Tatuadora y diseñadora digital\n\n"
						+ "Pulse en [Ok] para ver las notas de los alumnos","Curso de Domestica"
						,JOptionPane.INFORMATION_MESSAGE,imgIcono);
		
		int teclado = Integer.parseInt(JOptionPane.showInputDialog(imgEncabezado + 
						 "Curso de Domestica: \n"
						+ "<html><h1 align='center'><b> Tatuaje para principiantes </b></h1></html> \n"
						+ "Un curso de Polilla Tattoo, Tatuadora y diseñadora digital\n\n"
						+ "[1] Lista de Estudiantes Inscritos \n"
						+ "[2] Añadir Nuevo Estudiante \n"
						+ "[3] Lista de Asignaturas \n"
						+ "[4] Lista de Calificaciones \n"
						+ "[5] Lista de las Mejores Calificaciones \n"
						+ "[6] Lista de las Peores Calificaciones \n"
						+ "[7] Editar Calificaciones \n"
						+ "[8] Imprimir Calificaciones \n\n"
						+ "Para salir del sistema Escriba[0]"));
		
		boolean estado = true;
		
		//while(estado)
		//{
			switch(teclado)
			{
				case 1:
					granMatriz.one.mostrarEstudiantes();
					break;
					
				case 2:
					break;
					
				case 3:
					granMatriz.one.mostrarPlanilla();
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					break;
					
				case 7:
					break;
					
				case 8:
					break;
					
				case 0:
					estado=false;
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Error de dato ingresado, intente nuevamente");
					break;
					
				
			}
		//}
		
	}
}
