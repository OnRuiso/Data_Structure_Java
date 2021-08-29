/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 */

package Notas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Planilla
{
	private Estudiante totalEstudiantes[];
	private Asignatura totalCalificaciones[];
	Icon imgIcono = new ImageIcon(getClass().getResource("/Notas/imgMainII.png"));
	
	public Planilla() {	}
	
	public Planilla(Estudiante totalEstudiante , Asignatura totalCalificaciones)
	{
		this.totalEstudiantes = new Estudiante[10];
		this.totalCalificaciones = new Asignatura[10];
	}

	public Estudiante[] getTotalEstudiantes() {		return totalEstudiantes;	}
	public void setTotalEstudiantes(Estudiante[] totalEstudiantes) {		this.totalEstudiantes = totalEstudiantes;	}
	
	public Asignatura[] getTotalCalificaciones() {		return totalCalificaciones;	}
	public void setTotalCalificaciones(Asignatura[] totalCalificaciones) {		this.totalCalificaciones = totalCalificaciones;	}
	
	//##%%<!--  Metodo Principal -------------------------------------------------------------------------------------------------------------
	
	
	public void launch()
	{
		JOptionPane.showMessageDialog(null,
				" - Curso de Domestika -\n"
        		+"<html><h1 align='center'><b>Tatuaje para principiantes</b></h1></html>"
        		+ "\n Un curso de Polilla Tattoo, Tatuadora y diseñadora digital \n \n "
        		+ "Facultad: Ingenieria de Sistemas \n "
        		+ "Materia: Estructura de Datos \n "
        		+ "Estudiante: Luis Felipe Narvaez Gomez \n "
        		+ "Cod: 2312660 \n "
        		+ "Periodo: 2021-1"
        		,"Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
		
		boolean estado = true;
		
		while(estado)
		{
			String teclado = JOptionPane.showInputDialog(" - Curso de Domestika -\n"
	        		+"<html><h1 align='center'><b>Tatuaje para principiantes</b></h1></html>"
	        		+ "\n Un curso de Polilla Tattoo, Tatuadora y diseñadora digital \n \n "
	        		+ "Planilla de Calificaciones \n"
	        		+ "Escriba el numero de la opcion que desea ver: \n"
	        		+ "[0] Salir del Sistema\n"
	        		+ "[1] Ver Lista de Estudiantes Inscritos\n"
	        		+ "[2] Ver Planilla de calificaciones \n"
	        		+ "[3] Ver el Promedio de notas \n"
	        		+ "[4] Nota mas Alta y mas Baja obtenida \n");
			
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null,"Error de Entrada, vuelevo a intentar","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
					break;
					
				case "0":
					JOptionPane.showMessageDialog(null,"¡Nos vemos a la proxima!","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
					estado = false;
					break;
					
				case "1":
					JOptionPane.showMessageDialog(null,"Lista de Estudiantes Inscritos en el Curso","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
					nombreEstudiantes();
					break;
					
				case "2":
					JOptionPane.showMessageDialog(null,"Planilla de calificaciones","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
					planillaGeneral();
					break;
				case "3":
					JOptionPane.showMessageDialog(null,"Planilla de calificaciones \n PROMEDIOS","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
					promedio();
					break;
				case "4":
					JOptionPane.showMessageDialog(null,"Planilla de calificaciones \n Nota mas ALTA obtenida \n Nota mas BAJA obtenida","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
					notaAltaBaja();
					break;
				
			}
		}
		
		
	}
	
	//##%%<!--  INICIALIZAR DATOS -------------------------------------------------------------------------------------------------------------
	public void nombreEstudiantes()
	{
		/*for(int i = 0; i < totalEstudiantes.length;i++)
		{
			totalEstudiantes[i].getNombre();
		}*/
			
		JOptionPane.showMessageDialog(null,
				totalEstudiantes[0].getId()+"). "+totalEstudiantes[0].getNombre()+"\n"+totalEstudiantes[1].getId()+"). "+totalEstudiantes[1].getNombre()+"\n"+
				totalEstudiantes[2].getId()+"). "+totalEstudiantes[2].getNombre()+"\n"+totalEstudiantes[3].getId()+"). "+totalEstudiantes[3].getNombre()+"\n"+
				totalEstudiantes[4].getId()+"). "+totalEstudiantes[4].getNombre()+"\n"+totalEstudiantes[5].getId()+"). "+totalEstudiantes[5].getNombre()+"\n"+
				totalEstudiantes[6].getId()+"). "+totalEstudiantes[6].getNombre()+"\n"+totalEstudiantes[7].getId()+"). "+totalEstudiantes[7].getNombre()+"\n"+
				totalEstudiantes[8].getId()+"). "+totalEstudiantes[8].getNombre()+"\n"+totalEstudiantes[9].getId()+"). "+totalEstudiantes[9].getNombre()+"\n"
				,"Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
	}
	
	public void planillaGeneral()
	{
		String tecla = JOptionPane.showInputDialog("Selecciona el Estudiante del que quieras ver las calificaciones: \n"
				+ "[1] "+totalEstudiantes[0].getNombre()+"\n"
				+ "[2] "+totalEstudiantes[1].getNombre()+"\n"
				+ "[3] "+totalEstudiantes[2].getNombre()+"\n"
				+ "[4] "+totalEstudiantes[3].getNombre()+"\n"
				+ "[5] "+totalEstudiantes[4].getNombre()+"\n"
				+ "[6] "+totalEstudiantes[5].getNombre()+"\n"
				+ "[7] "+totalEstudiantes[6].getNombre()+"\n"
				+ "[8] "+totalEstudiantes[7].getNombre()+"\n"
				+ "[9] "+totalEstudiantes[8].getNombre()+"\n"
				+ "[10] "+totalEstudiantes[9].getNombre()+"\n"
				);
		
		int ident = Integer.parseInt(tecla);
		int nit = ident-1;
		
		if(nit < 0 | nit > 9)
		{
			JOptionPane.showMessageDialog(null,"Numero incorrecto buelbe a intentar","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
		}
		if (nit<9 && nit >= 0)
		{
			JOptionPane.showMessageDialog(null,
					"Estudiante: "+totalEstudiantes[nit].getNombre()+"\n"
					+"U1: Introducción= "+totalCalificaciones[nit].getNotaU1()+"\n"
					+"U2: Comenzando a tatuar, historia, estilos, materiales y consejos= "+totalCalificaciones[nit].getNotaU2()+"\n"
					+"U3: Preparación del diseño y mesa de tatuaje= "+totalCalificaciones[nit].getNotaU3()+"\n"
					+"U4: Comenzando a tatuar, técnicas, relleno y líneas= "+totalCalificaciones[nit].getNotaU4()+"\n"
					+"Proyecto final= "+totalCalificaciones[nit].getNotaU5()+"\n\n"
					,"Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
			
			nit = 0;
		}

	}
	
	public void promedio()
	{
		String tecla = JOptionPane.showInputDialog("Selecciona el Estudiante del que quieras ver las calificaciones: \n"
				+ "[1] "+totalEstudiantes[0].getNombre()+"\n"
				+ "[2] "+totalEstudiantes[1].getNombre()+"\n"
				+ "[3] "+totalEstudiantes[2].getNombre()+"\n"
				+ "[4] "+totalEstudiantes[3].getNombre()+"\n"
				+ "[5] "+totalEstudiantes[4].getNombre()+"\n"
				+ "[6] "+totalEstudiantes[5].getNombre()+"\n"
				+ "[7] "+totalEstudiantes[6].getNombre()+"\n"
				+ "[8] "+totalEstudiantes[7].getNombre()+"\n"
				+ "[9] "+totalEstudiantes[8].getNombre()+"\n"
				+ "[10] "+totalEstudiantes[9].getNombre()+"\n"
				);
		
		int ident = Integer.parseInt(tecla);
		int nit = ident-1;
		
		if(nit < 0 | nit > 9)
		{
			JOptionPane.showMessageDialog(null,"Numero incorrecto buelbe a intentar","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
		}
		if (nit<9 && nit >= 0)
		{
			int matNotas[] = {totalCalificaciones[nit].getNotaU1(),totalCalificaciones[nit].getNotaU2(),totalCalificaciones[nit].getNotaU3(),totalCalificaciones[nit].getNotaU4(),totalCalificaciones[nit].getNotaU5()};
			int tempNotas = 0 ;
			
			for(int i=0 ; i < matNotas.length ; i++)
			{
			 tempNotas = tempNotas + matNotas[i];
			}
						
			int promedio = tempNotas / matNotas.length ;
			JOptionPane.showMessageDialog(null, "Estudiante "+totalEstudiantes[nit].getNombre()+" tiene una calificacion Promedio de: \n"
												+"<html><h1 align='center'><b>"+promedio+"</b></h1></html>"
												,"Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
		}
		
	}
	
	public void notaAltaBaja()
	{
		String tecla = JOptionPane.showInputDialog("Selecciona el Estudiante del que quieras ver las calificaciones: \n"
				+ "[1] "+totalEstudiantes[0].getNombre()+"\n"
				+ "[2] "+totalEstudiantes[1].getNombre()+"\n"
				+ "[3] "+totalEstudiantes[2].getNombre()+"\n"
				+ "[4] "+totalEstudiantes[3].getNombre()+"\n"
				+ "[5] "+totalEstudiantes[4].getNombre()+"\n"
				+ "[6] "+totalEstudiantes[5].getNombre()+"\n"
				+ "[7] "+totalEstudiantes[6].getNombre()+"\n"
				+ "[8] "+totalEstudiantes[7].getNombre()+"\n"
				+ "[9] "+totalEstudiantes[8].getNombre()+"\n"
				+ "[10] "+totalEstudiantes[9].getNombre()+"\n"
				);
		
		int ident = Integer.parseInt(tecla);
		int nit = ident-1;
		
		if(nit < 0 | nit > 9)
		{
			JOptionPane.showMessageDialog(null,"Numero incorrecto buelbe a intentar","Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
		}
		if (nit<9 && nit >= 0)
		{
			int matNotas[] = {totalCalificaciones[nit].getNotaU1(),totalCalificaciones[nit].getNotaU2(),totalCalificaciones[nit].getNotaU3(),totalCalificaciones[nit].getNotaU4(),totalCalificaciones[nit].getNotaU5()};
			int tempNotasM = 0 ;
			int tempNotasN = 99 ;
			
			for(int i=0 ; i < matNotas.length ; i++)
			{
				if(matNotas[i]>tempNotasM)
					tempNotasM = matNotas[i];
			}
			for(int i=0 ; i < matNotas.length ; i++)
			{
				if(matNotas[i]<tempNotasN)
					tempNotasN = matNotas[i];
			}			
			
			
			
			
			JOptionPane.showMessageDialog(null, "Estudiante "+totalEstudiantes[nit].getNombre()+" tiene una calificacion Promedio de: \n"
												+"Nota Mayor alcanzada \n"
												+"<html><h1 align='center'><b>"+tempNotasM+"</b></h1></html>"
												+"Nota Menor alcanzada \n"
												+"<html><h1 align='center'><b>"+tempNotasN+"</b></h1></html>"
												,"Curso de Domestica",JOptionPane.INFORMATION_MESSAGE,imgIcono);
		}
	}
	
	
	

	
	
	

}
