/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 */
package Students;

import javax.swing.JOptionPane;

public class Controller
{
	private Estudiante estudiantesList[];
	
	public Controller()
	{
		
	}
	
	public Controller(Estudiante estudiantesList)
	{
		this.estudiantesList = new Estudiante[5];
	}

	public Estudiante[] getEstudiantesList() {		return estudiantesList;	}
	public void setEstudiantesList(Estudiante[] estudiantesList) {		this.estudiantesList = estudiantesList;	}
	
	public void Launch()
	{

		
		boolean estado = true;
		while(estado)
		{
			int teclado = Integer.parseInt(JOptionPane.showInputDialog("Selecciona tu metodo de ordenamiento de las notas de los estudiantes: \n"
					+ "[0] Salir del sistema \n"
					+ "[1] Ordenamiento por Burbuja \n"
					+ "[2] Ordenamiento por Seleccion \n"
					+ "[3] Ordenamiento por Insercion \n"));
			
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Error en el dato ingresado");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you later");
					estado = false;
					break;
				case 1:
					metodoBurbuja();
					break;
				case 2:
					metodoSeleccion();
					break;
				case 3:
					metodoInsercionDirecta();
					break;
			}
		}
	}

	
	public void metodoBurbuja()
	{
		int pasos = 0;
		
		for (int i=0 ; i < estudiantesList.length - 1 ; i++ )
		{
			for (int j = i+1 ; j < estudiantesList.length ; j++)
			{
				if(estudiantesList[i].getNota() < estudiantesList[j].getNota())
				{
					Estudiante a = estudiantesList[i];
										
					estudiantesList[i]= estudiantesList[j];
					estudiantesList[j] = a;
					pasos = pasos + 1;
				}
			}

		}
		for (int i=0 ; i < estudiantesList.length ; i++ )
		{
			System.out.println("En orden el vector es:"+ estudiantesList[i].getNombre()+" "+estudiantesList[i].getNota());
			//System.out.println("La cantidad de pasos para este metodo con tan solo 5 datos en el vector fue de: " + pasos);
		}
		JOptionPane.showMessageDialog(null,"La cantidad de pasos necesaria para este metodo con tan solo 5 elementos es de: " + pasos);
	}
	
	public void metodoSeleccion()
	{
		int i, j, menor, pos, pasos = 0;
		Estudiante tmp;
		
        for (i = 0; i < estudiantesList.length - 1; i++) 
        {
        	menor = estudiantesList[i].getNota();                                        
            pos = i;
            
            for (j = i + 1; j < estudiantesList.length; j++)
            {
            	if (estudiantesList[j].getNota() < menor) 
            	{
            		menor = estudiantesList[j].getNota();             
                    pos = j;
                }
            }
            
            if (pos != i)
            {
            	tmp = estudiantesList[i];
            	estudiantesList[i] = estudiantesList[pos];
            	estudiantesList[pos] = tmp;
            	pasos = pasos + 1;
            }

        }
        for (int x=0 ; x < estudiantesList.length ; x++ )
		{
			System.out.println("En orden el vector es:"+ estudiantesList[x].getNombre()+" "+estudiantesList[x].getNota());
			//System.out.println("La cantidad de pasos para este metodo con tan solo 5 datos en el vector fue de: " + pasos);	
		}
        
        JOptionPane.showMessageDialog(null,"La cantidad de pasos necesaria para este metodo con tan solo 5 elementos es de: " + pasos);
	}
	
	
	public void metodoInsercionDirecta()
	{
		int arreglo [] = {estudiantesList[0].getNota(),estudiantesList[1].getNota(),estudiantesList[2].getNota(),estudiantesList[3].getNota(),estudiantesList[4].getNota()};
		int pos,aux,pasos=0;
		
		for (int i=0 ; i<arreglo.length ; i++ )
		{
			pos = i;
			aux = arreglo[i];
			
			while((pos>0)&&(arreglo[pos-1])>aux)
			{
				arreglo[pos] = arreglo[pos-1];
				pos--;
				pasos = pasos +1;
			}
			arreglo[pos]=aux;
		}
		for (int x=0 ; x < arreglo.length ; x++ )
		{
			System.out.println("En orden el vector es: " + arreglo[x]);
			//System.out.println("La cantidad de pasos para este metodo con tan solo 5 datos en el vector fue de: " + pasos);	
		}
        
        JOptionPane.showMessageDialog(null,"La cantidad de pasos necesaria para este metodo con tan solo 5 elementos es de: " + pasos);
	}
	
}
