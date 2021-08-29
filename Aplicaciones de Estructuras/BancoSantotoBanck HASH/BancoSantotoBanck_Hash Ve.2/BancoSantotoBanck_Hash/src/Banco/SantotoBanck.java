/*
Universidad Santo Tomas seccional Tunja
Facultad de Ingenieria de Sistemas
Asignatura de Estructura de datos
Ing.Luis Felipe Narvaez Gomez
*/

package Banco;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class SantotoBanck
{	
	private List<Cliente> gente;
	private List<Cuenta> cuenta;

	
	Queue<Cliente> clientes_banco = new LinkedList<Cliente>();
	Queue<Cuenta> clientes_cuenta = new LinkedList<Cuenta>();
	
	Hashtable<Integer, Cliente> user_banco = new Hashtable<Integer, Cliente>(); //new
	Hashtable<Integer, Cuenta> user_cuenta = new Hashtable<Integer, Cuenta>(); //new
	
	Iterator<Cliente> it_cliente;
	Iterator<Cuenta> it_cuenta;

	
	public Queue<Cliente> getClientes_banco() {		return clientes_banco;	}
	public void setClientes_banco(Queue<Cliente> clientes_banco) {		this.clientes_banco = clientes_banco;	}
	
	public Queue<Cuenta> getClientes_cuenta() {		return clientes_cuenta;	}
	public void setClientes_cuenta(Queue<Cuenta> clientes_cuenta) {		this.clientes_cuenta = clientes_cuenta;	}	
	
	//--------------------Metodos--------------------------------------------------------------------------------------------------------

	public void listaClientes()
	{
	
		gente = new ArrayList<Cliente>();
		cuenta = new ArrayList <Cuenta>();
		
		cuenta.add(new Cuenta (1 , "#F171467816" , 55.99 , "Corriente") );
		gente.add(new Cliente (  1, "Juliana", 1049011) );
		user_banco.put(1049011, gente.get(0)); //new
		user_cuenta.put(1049011, cuenta.get(0)); //new
		
		cuenta.add(new Cuenta (1 , "#M13171455" , 75.99 , "Ahorros") );
		gente.add(new Cliente ( 2 , "Maoly",1049012) );
		user_banco.put(1049012, gente.get(1));//new
		user_cuenta.put(1049012, cuenta.get(1));//new
		
		cuenta.add(new Cuenta (1, "#$%&THYUJIK", 88.99 , "Corriente") );
		gente.add(new Cliente ( 3 , "Fernanda",1049013) );
		user_banco.put(1049013, gente.get(2));//new
		user_cuenta.put(1049013, cuenta.get(2));//new
		
		cuenta.add(new Cuenta (1, "%$&/JHGFTYU12" , 45.99 , "Ahorros") );
		gente.add(new Cliente ( 4 , "Monica",1049014) );
		user_banco.put(1049014, gente.get(3));//new
		user_cuenta.put(1049014, cuenta.get(3));//new
		
		cuenta.add(new Cuenta (1 , "%&YHNUJMIK456" , 35.99 , "Corriente") );
		gente.add(new Cliente ( 5 , "Natalia",1049015) );
		user_banco.put(1049015, gente.get(4));//new
		user_cuenta.put(1049015, cuenta.get(4));//new
		
		cuenta.add(new Cuenta (1 , "SalvaMartha:v#Batman" , 23.99 ,"Ahorros") );
		gente.add(new Cliente ( 6 , "Laura",1049016) );
		user_banco.put(1049016, gente.get(5));//new
		user_cuenta.put(1049016, cuenta.get(5));//new
		
		cuenta.add(new Cuenta (1 , "#AWSD141792" , 24.99 , "Corriente") );
		gente.add(new Cliente ( 7 , "Valentina",1049017) );
		user_banco.put(1049017, gente.get(6));//new
		user_cuenta.put(1049017, cuenta.get(6));//new
		
		
		clientes_banco.addAll(gente);
		clientes_cuenta.addAll(cuenta);
	}
	//................................................................................................................
	public void mostrarClientes()
	{
		it_cliente = clientes_banco.iterator();
		it_cuenta = clientes_cuenta.iterator();
		
		while(it_cliente.hasNext() && it_cuenta.hasNext())
		{
			System.out.println(it_cliente.next() +" "+ it_cuenta.next());
		}
	}
	//................................................................................................................
	public void mostrar()
	{
		for(int i = 0; i < gente.size() ; i++)
		{
			System.out.println(gente.get(i).toString());
		}
	}
	//................................................................................................................
	public void especificaCuenta() //new
	{
		int id_cedula = 0;
		while(true)
		{
			try {id_cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente que desea ver"));		break;}
			catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");	}
		}
		
		if(user_banco.containsKey(id_cedula) && user_cuenta.containsKey(id_cedula))
		{
			JOptionPane.showMessageDialog(null, "El cliente es el siguiente: \n"
					+ user_banco.get(id_cedula)+ "\n" + user_cuenta.get(id_cedula));
		}else {
			JOptionPane.showMessageDialog(null, "Este Cliente no existe");
		}
		
	}
	//................................................................................................................
	public void especDeleteCuenta()
	{
		int id_cedula = 0;
		while(true)
		{
			try {id_cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente que desea ver"));		break;}
			catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");	}
		}
		
		if(user_banco.containsKey(id_cedula) && user_cuenta.containsKey(id_cedula))
		{
			JOptionPane.showMessageDialog(null, "El cliente es el siguiente: \n"
					+ user_banco.get(id_cedula)+ "\n" + user_cuenta.get(id_cedula));
			
			
			double clientePos = user_banco.get(id_cedula).getNumeroCliente();
			double clienteNum = clientePos - 1; 
			System.out.println("La posicion que se eleminara es: "+clienteNum);
			cuenta.remove(clienteNum);
			gente.remove(clienteNum);
			
			clientes_banco.remove(clienteNum); //no utilizo poll porque eliminaria el que este en la cola
			clientes_cuenta.remove(clienteNum);
			
			user_banco.remove(id_cedula);
			user_cuenta.remove(id_cedula);
			
			JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado correctamente");
		}else {
			JOptionPane.showMessageDialog(null, "Este Cliente no existe");
		}
	}
	//................................................................................................................
	public void cajeroAutomaticoTwo()
	{
		JOptionPane.showMessageDialog(null, "Los clientes llegaron en el mismo orden que estan listados \n Estos se ven en la terminal");
		mostrarClientes();
		
		it_cliente = clientes_banco.iterator();
		
		
		while (it_cliente.hasNext())
		{
			//int position = 0;
			
			JOptionPane.showMessageDialog(null, " El Cliente que se atendera sera  \n\n" + clientes_banco.peek().getNombre() 
					+ "Numero de cuenta: " + clientes_cuenta.peek().getNumCuenta() + "de" + clientes_cuenta.peek().getTipoCuenta()  );
			
			boolean estate = true;
			while(estate)
			{
				JOptionPane.showMessageDialog(null, "Para seguir utilizando el cajero debe ingresar  \n "
						+ "el numero de cuenta de : " + clientes_banco.peek().getNombre() + " y la respectiva contraseña" );
				
				int numAuxCuenta = 0;
				while(true)
				{
					try {numAuxCuenta = Integer.parseInt(JOptionPane.showInputDialog("Primero ingrese el numero de cuenta de " + clientes_banco.peek().getNombre() ));	break;}
					catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");	}
				}
				String passAuxcuenta = " ";
				while(true)
				{
					try {passAuxcuenta = JOptionPane.showInputDialog(" Ahora ingrese la contraseña correspondiente de  " + clientes_banco.peek().getNombre() );	break;}
					catch(Exception f){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ f.getMessage() +"]");}
				}
				
				if (numAuxCuenta != clientes_cuenta.peek().getNumCuenta() || passAuxcuenta != clientes_cuenta.peek().getClave() )
				{
					JOptionPane.showMessageDialog(null, "Error en el numero de cuenta o la contraseña");
				}
				if ( numAuxCuenta == clientes_cuenta.peek().getNumCuenta() && passAuxcuenta.equals( clientes_cuenta.peek().getClave() ) )
				{
					JOptionPane.showMessageDialog(null, "Credenciales validas para " + clientes_banco.peek().getNombre());
					estate = false;
				}
			}
			
			boolean stat = true;
			while(stat)
			{
				int keyboard  = 0;
				while(true)
				{
					try {
						keyboard = Integer.parseInt(JOptionPane.showInputDialog("El cliente  |"+ clientes_banco.peek().getNombre() + "|  seleccione que operacion deasea hacer \n"
								+ "[1] Restirar Dinero de su cuenta \n"
								+ "[2] Cambiar la clave de su cuenta \n"
								+ "[3] Ver el Saldo de su cuenta \n"
								+ "\n\n [0] Terminar sesion" ));
						break;
					}catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");}
				}
				
				switch(keyboard)
				{
					default:
						JOptionPane.showMessageDialog(null, "Error de dato ingresado");
						break;
					case 0:
						JOptionPane.showMessageDialog(null, "See you later " + clientes_banco.peek().getNombre());
						clientes_banco.poll();
						clientes_cuenta.poll();
						stat = false;
						break;
					case 1:
						double retiro = 0;
						while(true)
						{
							try {retiro = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto dinero desea retirar en su cuenta? \n\n"+ clientes_banco.peek().getNombre() + " usted tiene en su cuenta actualmente " + clientes_cuenta.peek().getSaldo() )); break;	}
							catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");				}
						}
						
						if (retiro > clientes_cuenta.peek().getSaldo() || retiro < 0)
						{
							JOptionPane.showMessageDialog(null, "Esto supera el valor actual de tu cuenta " + clientes_banco.peek().getNombre() );
							break; //break para terminar el caso
						}
						else
						{
							double saldo = clientes_cuenta.peek().getSaldo();
							saldo = saldo - retiro;
							clientes_cuenta.peek().setSaldo(saldo);
							JOptionPane.showMessageDialog(null, "Su transacion se a confirmado \n"
									+ clientes_banco.peek().getNombre() + " usted tiene en su cuenta actualmente " + clientes_cuenta.peek().getSaldo() );
						}
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Su contraseña actual es:   "+ clientes_cuenta.peek().getClave());
						
						String cambioPass = JOptionPane.showInputDialog("Escriba la nueva contraseña para su cuenta "+ clientes_banco.peek().getNombre() );
						
						clientes_cuenta.peek().setClave(cambioPass);
						JOptionPane.showMessageDialog(null, "Su contraseña ahora es:   "+ clientes_cuenta.peek().getClave());
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "El cliente  |"+ clientes_banco.peek().getNombre() + "|  Tiene el siguiente saldo \n"
								+ "Cuenta de tipo  |" + clientes_cuenta.peek().getTipoCuenta() +"|  \n"
								+ "Saldo  :  "+clientes_cuenta.peek().getSaldo());
						break;
				}
			}
			
			//position = position + 1;
			
			JOptionPane.showMessageDialog(null, "Siguiente Cliente");
			
			
		}
		
	}
	
}
