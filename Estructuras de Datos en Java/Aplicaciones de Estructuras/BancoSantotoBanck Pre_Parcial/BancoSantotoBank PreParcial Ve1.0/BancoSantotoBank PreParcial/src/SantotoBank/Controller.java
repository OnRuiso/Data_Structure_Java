package SantotoBank;

import javax.swing.JOptionPane;

public class Controller
{
	private Usuario clienteInfo[];
	private int clienteactual;
	
	public Controller() {this.clienteactual = 0;}
	
	public Controller(Usuario clienteInfo , int clienteactual)
	{
		this.clienteInfo = new Usuario[5];
		this.clienteactual = 0;
	}
			
	public Usuario[] getClienteInfo() {		return clienteInfo;	}
	public void setClienteInfo(Usuario[] clienteInfo) {		this.clienteInfo = clienteInfo;	}

	
	//#----------------------------------------------------------------------------------------------------------------------------------------

	public void Launch()
	{
		boolean estado = true;
		
		while(estado)
		{
			int teclado = Integer.parseInt(JOptionPane.showInputDialog("SANTOTO BANCK \n\n"
					+ "Selecciones una de las opciones que desea utilizar: \n"
					+ "[1] Registrar nuevo Usuario \n"
					+ "[2] Ver usuarios Inscritos (organizados) \n"
					+ "[3] Modificar una cuenta de Usuario \n"
					+ "[4] Cuenta con mayor saldo \n"
					+ "[5] Cuenta con menor salgo en cuenta de Ahorros \n"
					+ "[6] Cuenta con mayor saldo en cuenta Corriente \n\n"
					+ "[0] Salir del sistema"));
			
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
					Registro();
					break;
				case 2:
					List();
					break;
			}
		}
	}
	//#----------------------------------------------------------------------------------------------------------------------------------------
	public void Registro()
	{
		Usuario valor = new Usuario();
				
		String dato1 = JOptionPane.showInputDialog("Nombre del usuario (solo su nombre por favor): ");
		valor.setNombre(dato1);
		
		String dato2 = JOptionPane.showInputDialog("Apellido del usuario (solo su apellido por favor): ");
		valor.setApellido(dato2);
		
		valor.setNumero(clienteactual);
		
		clienteInfo[clienteactual] = valor;
		clienteactual++;
		
	}
	public void List()
	{
		for(int i=0 ; i < clienteInfo.length ; i++)
		{
			JOptionPane.showMessageDialog(null, "ID: "+ clienteInfo[i].getNumero() +"\n"
											+ "Nombre: "+ clienteInfo[i].getNombre() +"\n"
											+ "Apellido: "+ clienteInfo[i].getApellido());
		}
	}
	public void TipoCuenta()
	{
		
	}

}
