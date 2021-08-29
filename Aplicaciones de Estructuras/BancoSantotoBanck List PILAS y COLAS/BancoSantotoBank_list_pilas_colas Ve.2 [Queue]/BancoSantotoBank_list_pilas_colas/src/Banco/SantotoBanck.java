/*
Universidad Santo Tomas seccional Tunja
Facultad de Ingenieria de Sistemas
Asignatura de Estructura de datos
Ing.Luis Felipe Narvaez Gomez
*/

package Banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

import javax.swing.JOptionPane;


public class SantotoBanck
{
	Queue<Cuenta> clientes_banco = new LinkedList<Cuenta>();
	Iterator<Cuenta> it_cliente;
	
	//--------------------Metodos--------------------------------------------------------------------------------------------------------
	
	public void a�adirClientes()
	{
		//clientes_banco = new Queue<Cuenta>();
		
		//public Cuenta (double numeroCliente , String nombre , int numCuenta , String clave , double saldo , String tipoCuenta)
		clientes_banco.add(new Cuenta ( 1 , "Juliana" , 1 , "#F171467816" , 55.99 , "Corriente" ));
		clientes_banco.add(new Cuenta ( 2 , "Maoly" , 1 , "#M13171455" , 75.99 , "Ahorros"));
		clientes_banco.add(new Cuenta ( 3 , "Fernanda" , 1, "#$%&THYUJIK", 88.99 , "Corriente"));
		clientes_banco.add(new Cuenta ( 4 , "Monica" , 1, "%$&/JHGFTYU12" , 45.99 , "Ahorros"));
		clientes_banco.add(new Cuenta ( 5 , "Natalia" , 1 , "%&YHNUJMIK456" , 35.99 , "Corriente"));
		clientes_banco.add(new Cuenta ( 6 , "Laura" , 1 , "SalvaMartha:v#Batman" , 23.99 ,"Ahorros"));
		clientes_banco.add(new Cuenta ( 7 , "Valentina" , 1 , "#AWSD141792" , 24.99 , "Corriente"));		
	}
	//................................................................................................................
	public void mostrarClientes()
	{
		it_cliente = clientes_banco.iterator();
		
		while(it_cliente.hasNext())
		{
			System.out.println(it_cliente.next());
		}
	}
	//................................................................................................................
	public void cajeroAutomaticoTwo()
	{
		mostrarClientes();
		
		it_cliente = clientes_banco.iterator();
		
		while (it_cliente.hasNext())
		{
			//int position = 0;
			
			JOptionPane.showMessageDialog(null, " El Cliente que se atendera sera  \n\n" + clientes_banco.peek().getNombre() 
					+ " Numero de cuenta: " +clientes_banco.peek().getNumCuenta() + " de " + clientes_banco.peek().getTipoCuenta() );
			
			boolean estate = true;
			while(estate)
			{
				JOptionPane.showMessageDialog(null, "Para seguir utilizando el cajero debe ingresar  \n "
						+ "el numero de cuenta de : " + clientes_banco.peek().getNombre() + " y la respectiva contrase�a" );
				
				int numAuxCuenta = 0;
				while(true)
				{
					try {numAuxCuenta = Integer.parseInt(JOptionPane.showInputDialog("Primero ingrese el numero de cuenta de " + clientes_banco.peek().getNombre() ));	break;}
					catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");	}
				}
				String passAuxcuenta = " ";
				while(true)
				{
					try {passAuxcuenta = JOptionPane.showInputDialog(" Ahora ingrese la contrase�a correspondiente de  " + clientes_banco.peek().getNombre() );	break;}
					catch(Exception f){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ f.getMessage() +"]");}
				}
				
				if (numAuxCuenta != clientes_banco.peek().getNumCuenta() || passAuxcuenta != clientes_banco.peek().getClave() )
				{
					JOptionPane.showMessageDialog(null, "Error en el numero de cuenta o la contrase�a");
				}
				if ( numAuxCuenta == clientes_banco.peek().getNumCuenta() && passAuxcuenta.equals( clientes_banco.peek().getClave() ) )
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
						stat = false;
						break;
					case 1:
						double retiro = 0;
						while(true)
						{
							try {retiro = Double.parseDouble(JOptionPane.showInputDialog("�Cuanto dinero desea retirar en su cuenta? \n\n"+ clientes_banco.peek().getNombre() + " usted tiene en su cuenta actualmente " + clientes_banco.peek().getSaldo() )); break;	}
							catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");				}
						}
						
						if (retiro > clientes_banco.peek().getSaldo() || retiro < 0)
						{
							JOptionPane.showMessageDialog(null, "Esto supera el valor actual de tu cuenta " + clientes_banco.peek().getNombre() );
							break; //break para terminar el caso
						}
						else
						{
							double saldo = clientes_banco.peek().getSaldo();
							saldo = saldo - retiro;
							clientes_banco.peek().setSaldo(saldo);
							JOptionPane.showMessageDialog(null, "Su transacion se a confirmado \n"
									+ clientes_banco.peek().getNombre() + " usted tiene en su cuenta actualmente " + clientes_banco.peek().getSaldo() );
						}
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Su contrase�a actual es:   "+ clientes_banco.peek().getClave());
						
						String cambioPass = JOptionPane.showInputDialog("Escriba la nueva contrase�a para su cuenta "+ clientes_banco.peek().getNombre() );
						
						clientes_banco.peek().setClave(cambioPass);
						JOptionPane.showMessageDialog(null, "Su contrase�a ahora es:   "+ clientes_banco.peek().getClave());
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "El cliente  |"+ clientes_banco.peek().getNombre() + "|  Tiene el siguiente saldo \n"
								+ "Cuenta de tipo  |" + clientes_banco.peek().getTipoCuenta() +"|  \n"
								+ "Saldo  :  "+clientes_banco.peek().getSaldo());
						break;
				}
			}
			
			//position = position + 1;
			
			JOptionPane.showMessageDialog(null, "Siguiente Cliente");
			
			
		}
		
	}
	
}
