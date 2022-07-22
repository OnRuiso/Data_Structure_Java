package Clase_Matematicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Controller
{
	List <Estudiante> estudiantes_chingones;
	Iterator<Estudiante> it_alumnos;
	
	public Controller()
	{
		this.estudiantes_chingones = estudiantes_chingones;
	}
		
	public List<Estudiante> getEstudiantes_chingones() {		return estudiantes_chingones;	}
	public void setEstudiantes_chingones(List<Estudiante> estudiantes_chingones) {		this.estudiantes_chingones = estudiantes_chingones;	}
	
	// -----------------------------------------METODOS ESPECIALIZADOS-------------------------------------
	
	public void initAlumnos()
	{
		estudiantes_chingones = new ArrayList<Estudiante>();
		
		estudiantes_chingones.add(new Estudiante ( "Juliana" , 13 , "Female"));
		estudiantes_chingones.add(new Estudiante ( "Daniela" , 23 , "Female"));
		estudiantes_chingones.add(new Estudiante ( "Jaidith" , 33 , "Female"));
		estudiantes_chingones.add(new Estudiante ( "Maria Jose" , 43 , "Female"));
		estudiantes_chingones.add(new Estudiante ( "Maria Fernanda" , 53 , "Female"));
		estudiantes_chingones.add(new Estudiante (  "Paula" , 63 , "Female"));
		estudiantes_chingones.add(new Estudiante (  "Michelle" , 73 , "Female"));
		estudiantes_chingones.add(new Estudiante (  "Angelica Viviana" , 83 , "Female"));
		estudiantes_chingones.add(new Estudiante (  "Dara" , 93 , "Female"));
		estudiantes_chingones.add(new Estudiante (  "Maoly Vanessa" , 103 , "Female"));
		estudiantes_chingones.add(new Estudiante (  "Natalia" ,  113 , "Female"));
	}
	//---------------------------------------------------------------------------------------------------------
	public void recorrerForNormal()
	{
		for (int i = 0 ; i < estudiantes_chingones.size() ; i++)
		{
			System.out.println(estudiantes_chingones.get(i).toString());
		}
	}
	//---------------------------------------------------------------------------------------------------------
	public void recorrerForEach()
	{
		for(Estudiante alumno: estudiantes_chingones)
		{
			System.out.println(alumno);
		}
	}
	//---------------------------------------------------------------------------------------------------------
	public void recorrerIteratorNext()
	{
		it_alumnos = estudiantes_chingones.iterator();
		
		System.out.println(it_alumnos.next());
	}
	//---------------------------------------------------------------------------------------------------------
	public void recorrerIteratorHasNext()
	{
		it_alumnos = estudiantes_chingones.iterator();
		
		System.out.println(it_alumnos.hasNext());
	}
	//---------------------------------------------------------------------------------------------------------
	public void fusionNextHasnextIterator()
	{
		it_alumnos = estudiantes_chingones.iterator();
		
		while(it_alumnos.hasNext())
		{
			System.out.println(it_alumnos.next());
		}
	}
	//---------------------------------------------------------------------------------------------------------
	public void deleteForEach()
	{
		try
		{
			int estDelete1 = 0;
			while(true)	{
				try {	estDelete1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe la posicion del estudiante que quieres eliminar: "));		break;	}
				catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]");}
			}
			
			int estDelete = estDelete1 - 1;
			
			for(Estudiante alumno: estudiantes_chingones)
			{
				estudiantes_chingones.remove(estDelete);
			}
		}
		catch(Exception f)
		{
			JOptionPane.showInternalMessageDialog(null, "El Error es el siguiente"+"["+ f.getMessage() +"] \n"
					+ "Este metodo falla por For Each ya que estamos recorriendo y modificando la lista a la vez. \n"
					+ " Es aquí donde los iteradores pueden venir a rescatarnos.");
		}
		
	}
	//---------------------------------------------------------------------------------------------------------
	public void deleteIterator()
	{
		it_alumnos = estudiantes_chingones.iterator();
		String str = " ";
		
		int posDelete1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe la posicion del estudiante que quieres eliminar: "));
		int posDelete = posDelete1 - 1;
		/*
		while(it_alumnos.hasNext())	
		{
					
			it_alumnos.remove(posDelete);
		}
		*/
		fusionNextHasnextIterator();
	}
	//---------------------------------------------------------------------------------------------------------
}
