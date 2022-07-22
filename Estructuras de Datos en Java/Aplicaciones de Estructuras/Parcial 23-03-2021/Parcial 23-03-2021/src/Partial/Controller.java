/*
 PARCIAL 23-03-2021
 
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */

package Partial;

import javax.swing.JOptionPane;

public class Controller
{
	private Pet petSick[];
	
	public Controller()
	{
		
	}
	public Controller(Pet petSick)
	{
		this.petSick = new Pet[100];
	}
	public Pet[] getPetSick() {		return petSick;	}
	public void setPetSick(Pet[] petSick) {		this.petSick = petSick;	}
	
	int flag = 0;
	//##----------------------------------------------------METODOS PRINCIPALES--------------------------------------------------------------------------
	
	public void Launcher()
	{
		boolean estado = true;
		
		while(estado)
		{
			int teclado = Integer.parseInt(JOptionPane.showInputDialog("CENTRO VETENRINARIO \n\n"
														+ "Escriba el numero de la opcion que desea Utilizar \n"
														+ "[1] Resgitro de Nuevo Paciente \n"
														+ "[2] Orden del Triage \n"
														+ "[3] Busqueda por Nombre \n\n"
														+ "[0] Salir del Sistema"));
			
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null,"Error en dato ingresado : ["+ teclado + "]  vuelvelo a intentar /(._.)/");
					break;
				case 0:
					JOptionPane.showMessageDialog(null,"See you later");
					estado = false;
					break;
				case 1:
					Registro();
					break;
				case 2:
					Triage();
					break;
				case 3:
					Search();
					break;
			}
		}
	}
	
	//##----------------------------------------------------METODOS SECUNDARIOS---------------------------------------------------------------------------
	public void Registro()
	{
		flag = flag + 1;
		
		Pet lomito = new Pet();
		
		lomito.setId(flag);
		System.out.println("Mascota ingresada: "+ lomito.getId());
		
		if(lomito.getId() > 100) {
			JOptionPane.showMessageDialog(null, "Numero Maximo de Pacientes Ingresados");
		}
		else
		{
			String dato1 = JOptionPane.showInputDialog("Nombre del Paciente: ");
			lomito.setNombre(dato1);
			
			int especie = Integer.parseInt(JOptionPane.showInputDialog("¿De que especie es el Paciente?\n"
					+ "[1] Perro (Canis lupus familiaris) \n"
					+ "[2] Gato (Felis catus) \n"
					+ "[3] Ave (Suliformes y Phaethontiformes)"));
			switch(especie)
			{
				default:
					JOptionPane.showMessageDialog(null,"Error en dato ingresado : ["+ especie + "]  vuelvelo a intentar /(._.)/");
					break;
				case 1:
					lomito.setTipo("Perro (Canis lupus familiaris)");
					break;
				case 2:
					lomito.setTipo("Gato (Felis catus)");
					break;
				case 3:
					lomito.setTipo("Ave (Suliformes y Phaethontiformes)");
					break;
			}
		
			String dato2 = JOptionPane.showInputDialog("Sintomas que presenta el Paciente: ");
			lomito.setEnfermedad(dato2);
			
			boolean stat = true;
			while(stat)
			{
				int dato3 = Integer.parseInt(JOptionPane.showInputDialog("¿Que triage necesita este paciente? \n |1|2|3|4|5|"));
				if( dato3 < 1 || dato3 > 5)
				{
					JOptionPane.showMessageDialog(null, "Esto no corresponde a un valor de Triague valido");
				}
				else
				{
					lomito.setTriage(dato3); stat=false;
				}
			}
			
			ordenTriage();
		}
		
	}
	public void Triage()
	{
		for(int i=0 ; i < petSick.length ; i++)
		{
			System.out.println(petSick[i].getNombre() + " Con Triage de: "+ petSick[i].getTriage());
		}
		JOptionPane.showMessageDialog(null, "Ver la consola");
	}
	public void Search()
	{
		String key = JOptionPane.showInputDialog("¿Que Paciente desea buscar?");
		
		for(int i = 0 ; i < petSick.length ; i++)
		{
			if (key == petSick[i].getNombre())
			{
				JOptionPane.showMessageDialog(null, petSick[i].getId() + petSick[i].getNombre() + petSick[i].getTipo() + petSick[i].getEnfermedad() + petSick[i].getTriage());
			}
		}
		
	}
	//##----------------------------------------------------METODOS secundarios de los SECUNDARIOS---------------------------------------------------------------------------
	public void ordenTriage()
	{
		for (int i=0 ; i < petSick.length - 1 ; i++ )
		{
			for (int j = i+1 ; j < petSick.length ; j++)
			{
				if( petSick[i].getTriage() < petSick[j].getTriage() )
				{
					Pet a = petSick[i];
										
					petSick[i]= petSick[j];
					petSick[j] = a;
				}
			}
		}
	}
	//##-----------------------------------------------------Metodos Auxiliares Nivel CERO----------------------------------------------------------------------
	public void initPetSick()
	{
		for( int i = 0 ; i < 100 ; i++)
		{
			petSick[i] = new Pet();
		}
	}
	
}
