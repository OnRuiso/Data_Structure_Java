package SantotoBank;

import javax.swing.JOptionPane;

public class Controller
{
	private Usuario clienteInfo[];
	private int clienteactual;
	private int modificadorCuenta;
	
	public Controller()
	{
		this.clienteactual = 0;
		this.clienteInfo = new Usuario[5];
		this.modificadorCuenta = 0;
		inicialited();
	}
	
	public Controller(Usuario clienteInfo , int clienteactual , int modificadorCuenta)
	{
		this.clienteInfo = new Usuario[5];
		this.clienteactual = 0;
		this.modificadorCuenta = 0;
		inicialited();
	}
		
	public Usuario[] getClienteInfo() {		return clienteInfo;	}
	public void setClienteInfo(Usuario[] clienteInfo) {		this.clienteInfo = clienteInfo;	}
	
	public int getClienteactual() {		return clienteactual;	}
	public void setClienteactual(int clienteactual) {		this.clienteactual = clienteactual;	}

	public int getModificadorCuenta() {		return modificadorCuenta;	}
	public void setModificadorCuenta(int modificadorCuenta) {		this.modificadorCuenta = modificadorCuenta;	}
	

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
					+ "[5] Cuenta con mayor saldo en cuenta de Ahorros \n"
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
				case 3:
					modificarUser();
					break;
				case 4:
					mayorSaldo();
					break;
				case 5:
					mayorAhorro();
					break;
				
			}
		}
	}
	//#----------------------------------------------------------------METODOS PRINCIPALES PARA LAUNCH------------------------------------------------------------------------
	public void Registro()
	{
		int aux = 0;
		Usuario valor = new Usuario();
				
		String dato1 = JOptionPane.showInputDialog("Nombre del usuario (solo su nombre por favor): ");
		valor.setNombre(dato1);
		
		String dato2 = JOptionPane.showInputDialog("Apellido del usuario (solo su apellido por favor): ");
		valor.setApellido(dato2);
		
		char dato3 = JOptionPane.showInputDialog("¿Desea agregar una cuenta en este momento? [y/n]: ").charAt(0);
		
		
		if(dato3 == 'y')
		{
			int cuentas = 0;
			
			boolean estat = true;
			while (estat)
			{
				char key = JOptionPane.showInputDialog("¿Que tipo de cuenta quieres? \n [A] Cuenta de Ahorro \n [B] Cuenta corriente \n [C] Cancelar operacion").charAt(0);
				
				if(valor.getNumCuentas() == 3)
				{ 
					char salida = JOptionPane.showInputDialog("Numero excedido de cuentas \n Usted ya tiene el numero maximo de cuentas a utilizar, a continuacion escriba 'C' para cancelar la operacion").charAt(0);
					switch(salida)
					{
						default:
							JOptionPane.showMessageDialog(null, "Dato Incorrecto");
							break;
						case 'C':
							estat = false;
							break;
					}
				}
				else
				{
					switch(key)
					{
						default:
							JOptionPane.showMessageDialog(null, "Error en el dato ingresado");
							break;
						case 'C':
							JOptionPane.showMessageDialog(null, "Cancelado ingreso de cuentas nuevas");
							estat = false;
							break;
							
						case 'A':
							double saldoTemp = Double.parseDouble(JOptionPane.showInputDialog("Usuario : [" + clienteactual + "] Que saldo registra?: "));
							
							valor.getTipo()[aux] ="Cuenta de Ahorro";
							valor.getSaldo()[aux] = saldoTemp;
							cuentas = cuentas + 1;
							valor.setNumCuentas(cuentas);                    //numero de cuentas existentes
							valor.getNumeroCuenta()[aux]= cuentas; //numero de la cuenta
							aux = aux + 1;             
							break;
							
						case 'B':
							
							double saldoTemp2 = Double.parseDouble(JOptionPane.showInputDialog("Usuario : [" + clienteactual + "] Que saldo registra?: "));
							
							valor.getTipo()[aux] ="Cuenta Corriente";
							valor.getSaldo()[aux] = saldoTemp2;
							cuentas = cuentas + 1;
							valor.setNumCuentas(cuentas);                    //numero de cuentas existentes
							valor.getNumeroCuenta()[aux]= cuentas; //numero de la cuenta
							aux = aux + 1;         
							break;
					}
				}
				
				
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "No se registro ninguna cuenta nueva");
		}
		
		
		
		valor.setNumero(clienteactual);
		
		clienteInfo[clienteactual] = valor;
		clienteactual++;
		
	}
	//#----------------------------------------------------------------------------------------------------------------------------------------
	public void List()
	{
		for(int i=0 ; i < clienteInfo.length ; i++)
		{
			JOptionPane.showMessageDialog(null, "ID: "+ clienteInfo[i].getNumero() +"\n"
											+ "Nombre: "+ clienteInfo[i].getNombre() +"\n"
											+ "Apellido: "+ clienteInfo[i].getApellido() +"\n"
											+ "Cuenta "+clienteInfo[i].getNumeroCuenta()[0]+": " + clienteInfo[i].getTipo()[0]  + clienteInfo[i].getSaldo()[0] + "\n"
											+ "Cuenta "+clienteInfo[i].getNumeroCuenta()[1]+": " + clienteInfo[i].getTipo()[1]  + clienteInfo[i].getSaldo()[1] + "\n"
											+ "Cuenta "+clienteInfo[i].getNumeroCuenta()[2]+": " + clienteInfo[i].getTipo()[2]  + clienteInfo[i].getSaldo()[2] + "\n");
		}
	}
	//#----------------------------------------------------------------------------------------------------------------------------------------
	public void modificarUser()
	{
		boolean verdad = true;
		while(verdad)
		{
			int tecla = Integer.parseInt(JOptionPane.showInputDialog(" los Usuarios registrados son: \n\n"
					+ "[0] Cancelar Edicion de cuentas \n"
					+ "[1] "+clienteInfo[0].getApellido()+ " "+clienteInfo[0].getNombre()+"\n"
					+ "[2] "+clienteInfo[1].getApellido()+ " "+clienteInfo[1].getNombre()+"\n"
					+ "[3] "+clienteInfo[2].getApellido()+ " "+clienteInfo[2].getNombre()+"\n"
					+ "[4] "+clienteInfo[3].getApellido()+ " "+clienteInfo[3].getNombre()+"\n"
					+ "[5] "+clienteInfo[4].getApellido()+ " "+clienteInfo[4].getNombre()+"\n\n"
					+ "¿A quien desea EDITAR?"));

			switch(tecla)
			{
				default:
				JOptionPane.showMessageDialog(null, "Error en el dato ingresado");
				break;
				case 0:
				JOptionPane.showMessageDialog(null, "Cancelado ingreso de cuentas nuevas");
				verdad = false;
				break;
				case 1:
					setModificadorCuenta(0);
					casosModificador();
					setModificadorCuenta(0);
					break;
				case 2:
					setModificadorCuenta(1);
					casosModificador();
					setModificadorCuenta(0);
					break;
				case 3:
					setModificadorCuenta(2);
					casosModificador();
					setModificadorCuenta(0);
					break;
				case 4:
					setModificadorCuenta(3);
					casosModificador();
					setModificadorCuenta(0);
					break;
				case 5:
					setModificadorCuenta(4);
					casosModificador();
					setModificadorCuenta(0);
					break;
			}
		}
	}
	//#----------------------------------------------------------------------------------------------------------------------------------------
	public void mayorSaldo()
	{
		int cuentaX = Integer.parseInt(JOptionPane.showInputDialog("¿De que cuenta quieres averiguar el saldo mayor? \n"
																+ "[1] "+clienteInfo[0].getApellido()+ " "+clienteInfo[0].getNombre()+"\n"
																+ "[2] "+clienteInfo[1].getApellido()+ " "+clienteInfo[1].getNombre()+"\n"
																+ "[3] "+clienteInfo[2].getApellido()+ " "+clienteInfo[2].getNombre()+"\n"
																+ "[4] "+clienteInfo[3].getApellido()+ " "+clienteInfo[3].getNombre()+"\n"
																+ "[5] "+clienteInfo[4].getApellido()+ " "+clienteInfo[4].getNombre()+"\n\n"));
		int cuenta = cuentaX - 1;
		
		double saldos[] = {clienteInfo[cuenta].getSaldo()[0] , clienteInfo[cuenta].getSaldo()[1] , clienteInfo[cuenta].getSaldo()[2]};
		
		double mayori = 0;
		
		for(int i = 0 ; i < saldos.length ; i++)
		{
			if(saldos[i] > mayori)
				mayori = saldos[i];
		}
		System.out.println("Entero mayor es: "+mayori);
		JOptionPane.showMessageDialog(null, "La cuenta de Mayor Saldo es: "+ mayori);
		
	}
	//#----------------------------------------------------------------------------------------------------------------------------------------
	public void mayorAhorro()
	{
		int cuentaX = Integer.parseInt(JOptionPane.showInputDialog("¿De que cuenta quieres averiguar el saldo mayor? \n"
				+ "[1] "+clienteInfo[0].getApellido()+ " "+clienteInfo[0].getNombre()+"\n"
				+ "[2] "+clienteInfo[1].getApellido()+ " "+clienteInfo[1].getNombre()+"\n"
				+ "[3] "+clienteInfo[2].getApellido()+ " "+clienteInfo[2].getNombre()+"\n"
				+ "[4] "+clienteInfo[3].getApellido()+ " "+clienteInfo[3].getNombre()+"\n"
				+ "[5] "+clienteInfo[4].getApellido()+ " "+clienteInfo[4].getNombre()+"\n\n"));
		
		int cuenta = cuentaX - 1;
		
		double saldoOne = clienteInfo[cuenta].getSaldo()[0];
		double saldoTwo = clienteInfo[cuenta].getSaldo()[1];
		double saldoThree = clienteInfo[cuenta].getSaldo()[2];
		
		if(clienteInfo[cuenta].getTipo()[0].equals("Cuenta Corriente"))		{			saldoOne = 0;		}
		if(clienteInfo[cuenta].getTipo()[1].equals("Cuenta Corriente"))		{			saldoTwo = 0;		}
		if(clienteInfo[cuenta].getTipo()[2].equals("Cuenta Corriente"))		{			saldoThree = 0;		}
		// Cuenta de Ahorro
		
		double saldos[] = { saldoOne , saldoTwo , saldoThree };
		
		
		double mayori = 0;
		
		for(int i = 0 ; i < saldos.length ; i++)
		{
		if(saldos[i] > mayori)
		mayori = saldos[i];
		}
		System.out.println("Entero mayor es: "+mayori);
		if(mayori == 0) {JOptionPane.showMessageDialog(null,"La cuenta no tiene una cuenta Mayor de Ahorro");}
		else {
			JOptionPane.showMessageDialog(null, "La cuenta de Mayor Saldo en modalidad de Cuenta de Ahorro es: "+ mayori +" de la Persona: "+clienteInfo[cuenta].getApellido()+ " "+clienteInfo[cuenta].getNombre());
		}
		
	}
	//#----------------------------------------------------------------------------------------------------------------------------------------
	public void mayorCorriente()
	{
		int cuentaX = Integer.parseInt(JOptionPane.showInputDialog("¿De que cuenta quieres averiguar el saldo mayor? \n"
				+ "[1] "+clienteInfo[0].getApellido()+ " "+clienteInfo[0].getNombre()+"\n"
				+ "[2] "+clienteInfo[1].getApellido()+ " "+clienteInfo[1].getNombre()+"\n"
				+ "[3] "+clienteInfo[2].getApellido()+ " "+clienteInfo[2].getNombre()+"\n"
				+ "[4] "+clienteInfo[3].getApellido()+ " "+clienteInfo[3].getNombre()+"\n"
				+ "[5] "+clienteInfo[4].getApellido()+ " "+clienteInfo[4].getNombre()+"\n\n"));
		
		int cuenta = cuentaX - 1;
		
		double saldoOne = clienteInfo[cuenta].getSaldo()[0];
		double saldoTwo = clienteInfo[cuenta].getSaldo()[1];
		double saldoThree = clienteInfo[cuenta].getSaldo()[2];
		
		if(clienteInfo[cuenta].getTipo()[0].equals("Cuenta de Ahorro"))		{			saldoOne = 0;		}
		if(clienteInfo[cuenta].getTipo()[1].equals("Cuenta de Ahorro"))		{			saldoTwo = 0;		}
		if(clienteInfo[cuenta].getTipo()[2].equals("Cuenta de Ahorro"))		{			saldoThree = 0;		}
		// Cuenta de Ahorro
		
		double saldos[] = { saldoOne , saldoTwo , saldoThree };
		
		
		double mayori = 0;
		
		for(int i = 0 ; i < saldos.length ; i++)
		{
		if(saldos[i] > mayori)
		mayori = saldos[i];
		}
		System.out.println("Entero mayor es: "+mayori);
		if(mayori == 0) {JOptionPane.showMessageDialog(null,"La cuenta no tiene una cuenta Mayor de Ahorro");}
		else {
			JOptionPane.showMessageDialog(null, "La cuenta de Mayor Saldo en modalidad de Cuenta Corriente es: "+ mayori +" de la Persona: "+clienteInfo[cuenta].getApellido()+ " "+clienteInfo[cuenta].getNombre());
		}
	}
	//----------------------------------------------------------METODOS SECUNDARIOS---------------------------------------------------------------------------------------------------------------------
	
	public void inicialited()
	{
		for(int i=0; i < 5; i++)
		{
			clienteInfo[i] = new Usuario();
		}
	}
	//#----------------------------------------------------------------------------------------------------------------------------------------
	public void casosModificador()
	{
		int miMood  =getModificadorCuenta();
		
		String nuevoNombre = JOptionPane.showInputDialog("Nuevo Nombre del Usuario : ");
		clienteInfo[miMood].setNombre(nuevoNombre);
		String nuevoApellido = JOptionPane.showInputDialog("Nuevo Apellido del Usuario : ");
		clienteInfo[miMood].setApellido(nuevoApellido);
		
		boolean gg = true;
		while(gg)
		{
			int keyes = Integer.parseInt(JOptionPane.showInputDialog("Estas son las cuentas del Usuario "+clienteInfo[0].getNombre()+ " "+clienteInfo[0].getApellido()+"\n"
					+ "[1] Cuenta "+clienteInfo[miMood].getNumeroCuenta()[0]+": " + clienteInfo[miMood].getTipo()[0]  + clienteInfo[miMood].getSaldo()[0] + "\n"
					+ "[2] Cuenta "+clienteInfo[miMood].getNumeroCuenta()[1]+": " + clienteInfo[miMood].getTipo()[1]  + clienteInfo[miMood].getSaldo()[1] + "\n"
					+ "[3] Cuenta "+clienteInfo[miMood].getNumeroCuenta()[2]+": " + clienteInfo[miMood].getTipo()[2]  + clienteInfo[miMood].getSaldo()[2] + "\n"
					+ "[0] Cancelar Edicion de Cuentas"
					+ "\n\n ¿Cual desea Cambiar?"));
			
			switch(keyes)
			{
				default:
					JOptionPane.showMessageDialog(null, "Error de entrada de dato, vuelvelo a intentar");
					break;
				case 0:
					gg = false;
					break;
				case 1:
					String tokenTipoOne = JOptionPane.showInputDialog("Si es Cuenta de Ahorro , escribe 'Cuenta de Ahorro' \n Si es Cuenta Corriente escribe 'Cuenta Corriente' ");
					clienteInfo[miMood].getTipo()[0] = tokenTipoOne;
					double tokenSaldoOne = Double.parseDouble(JOptionPane.showInputDialog("Escribe acontinuacion el saldo de la cuenta: "));
					clienteInfo[miMood].getSaldo()[0] = tokenSaldoOne;
					break;
				case 2:
					String tokenTipoTwo = JOptionPane.showInputDialog("Si es Cuenta de Ahorro , escribe 'Cuenta de Ahorro' \n Si es Cuenta Corriente escribe 'Cuenta Corriente' ");
					clienteInfo[miMood].getTipo()[1] = tokenTipoTwo;
					double tokenSaldoTwo = Double.parseDouble(JOptionPane.showInputDialog("Escribe acontinuacion el saldo de la cuenta: "));
					clienteInfo[miMood].getSaldo()[1] = tokenSaldoTwo;
					break;
				case 3:
					String tokenTipoThree = JOptionPane.showInputDialog("Si es Cuenta de Ahorro , escribe 'Cuenta de Ahorro' \n Si es Cuenta Corriente escribe 'Cuenta Corriente' ");
					clienteInfo[miMood].getTipo()[2] = tokenTipoThree;
					double tokenSaldoThree = Double.parseDouble(JOptionPane.showInputDialog("Escribe acontinuacion el saldo de la cuenta: "));
					clienteInfo[miMood].getSaldo()[2] = tokenSaldoThree;
					break;
			}
			
		}
		
	}
}
