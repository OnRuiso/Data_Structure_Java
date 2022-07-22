/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing.Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */
package Ukelele;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Tienda
{
	List<Cliente> clientes; 
	
	public Tienda()
	{
		this.clientes = clientes;
	}
	
	public List<Cliente> getClientes() {		return clientes;	}
	public void setClientes(List<Cliente> clientes) {		this.clientes = clientes;	}

	public void Launch()
	{
		boolean estado = true;
		
		while(estado)
		{
			int teclado = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion: \n"
																		+ "[1] Para ver los clientes \n"
																		+ "[2] Para Almacenar un nuevo Cliente \n"
																		+ "[3] Para editar algun cliente [Aun no]\n"
																		+ "[4] Para Borrar un Cliente [Aun no]\n"
																		+ "[0] Salir /n"));
			
			switch (teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Esa no es una variable compa, intentelo denuevo");
					break;
				case 0:
					estado = false;
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Mira la terminal del IDE Compa");
					mostrarDatos();
					break;
				case 2:
					addDatos();
					break;
				case 3:
					break;
				case 4:
					break;
			}
		}
	}
	//----------------------------------------- Metodos Compa, metodos ----------------------------------------------
	public void datosIniciales()
	{
		clientes = new ArrayList<Cliente>();
		
		clientes.add( new Cliente ( 1 , 1049000111 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000222 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000333 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000444 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000555 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000666 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000777 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000888 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049000999 , "Amelia" , true ) );
		clientes.add( new Cliente ( 1 , 1049111000 , "Amelia" , true ) );
	}
	
	public void mostrarDatos()
	{
		System.out.println("El tamaño de la lista es: " + clientes.size() );
		
		for(int i=0 ; i<clientes.size() ; i++)
		{
			System.out.println("cliente: " + clientes.get(i) );
		}
	}
	
	public void addDatos()
	{
		JOptionPane.showMessageDialog(null, "Escribe ahora 5 nuevos clientes Compa");
		
		for(int i=0 ; i<2 ;	i++)
		{
			int num = Integer.parseInt(JOptionPane.showInputDialog("Numero del cliente: "));
			int cc = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cedula Compa: "));
			String name = JOptionPane.showInputDialog("Escribe el nombre Compa: ");
			boolean onoff = Boolean.parseBoolean(JOptionPane.showInputDialog("Si es Mujer escribe 'true' si es hombre escribe 'false' , sin errores compa por favor :'v "));
			
			clientes.add( new Cliente ( num , cc , name , onoff ) );
			
			JOptionPane.showMessageDialog(null, "Siguiente");
		}
	}
}
