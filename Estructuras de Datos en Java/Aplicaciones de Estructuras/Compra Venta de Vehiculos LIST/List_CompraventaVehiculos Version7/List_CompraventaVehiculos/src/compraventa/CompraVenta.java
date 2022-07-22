package compraventa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CompraVenta
{
	private Icon imgIcono = new ImageIcon(getClass().getResource("/compraventa/logo.jpg"));
	
	List<Particular> carrosParticularDisponibles;
	List<Publico> carrosPublicoDisponibles;
	List<Vehiculo> carrosVendidos;
	
	public CompraVenta()
	{
		this.carrosParticularDisponibles = carrosParticularDisponibles;
		this.carrosPublicoDisponibles = carrosPublicoDisponibles;
		this.carrosVendidos = carrosVendidos;
		this.imgIcono = imgIcono;
	}

	public List<Particular> getCarrosParticularDisponibles() {		return carrosParticularDisponibles;	}
	public void setCarrosParticularDisponibles(List<Particular> carrosParticularDisponibles) {		this.carrosParticularDisponibles = carrosParticularDisponibles;	}

	public List<Publico> getCarrosPublicoDisponibles() {		return carrosPublicoDisponibles;	}
	public void setCarrosPublicoDisponibles(List<Publico> carrosPublicoDisponibles) {		this.carrosPublicoDisponibles = carrosPublicoDisponibles;	}

	public List<Vehiculo> getCarrosVendidos() {		return carrosVendidos;	}
	public void setCarrosVendidos(List<Vehiculo> carrosVendidos) {		this.carrosVendidos = carrosVendidos;	}
	
	public Icon getImgIcono() {		return imgIcono;	}
	public void setImgIcono(Icon imgIcono) {		this.imgIcono = imgIcono;	}
	
	//--------------------------------------------------------- METODOS ---------------------------------------------------------------------------------
	
	public void ResgistrarVehiculo()
	{
		JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
				+ "Resgitro de Vehiculos <br> Publicos o Particulares en el sistema"
				+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
		
		boolean esta1 = true;
		while (esta1)
		{
			int Keyboard = 0;
			while(true)
			{
				try {
					Keyboard = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de Vehiculo quieres Registrar? \n "
							+ "Escribe en la parte inferior el numero correspondiente a cada tipo de Vehiculo. \n\n"
							+ "[1] Vehiculo Particular \n"
							+ "[2] Vehiculo Publico \n"
							+ "[0] Cancelar Registro de Vehiculos"));
					break;
				}catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"
					+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\\n"
						,null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
			
			switch(Keyboard)
			{
				default:
					JOptionPane.showMessageDialog(null, " <html><h1 align='center'><b>"
													+ "Esto no es dato valido , vuelvelo a intentar /(._.)/"
													+ "</b></h1></html> \\n\\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Registro de Vehiculos <br> Cancelado "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					esta1 = false;
					break;
					
				case 1:
					//(int numPuertas, String color, String tipoMotor    ,     int id, double valor , String tipoCombustible , int modelo , String estado)
					int key0 , key3 , key6 = 0; double key4 = 0;
					while(true)	{
						try {key0 = Integer.parseInt(JOptionPane.showInputDialog("Numero de Puertas que tiene el Vehiculo Particular: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}
					while(true) {
						try {key3 = Integer.parseInt(JOptionPane.showInputDialog("Id Personalizao del Vehiculo Particular: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}
					while(true) {
						try {key6 = Integer.parseInt(JOptionPane.showInputDialog("Modelo (año) del Vehiculo Particular: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"
								+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}
					while(true) {
						try {key4 = Double.parseDouble(JOptionPane.showInputDialog("Valor del Vahiculo Particular: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}
					
					String key1 = JOptionPane.showInputDialog("Color del Vehiculo Particular: ");
					String key2 = JOptionPane.showInputDialog("Tipo de Motor que tiene el Vehiculo Particular: ");
					String key5 = JOptionPane.showInputDialog("Tipo de combustible que utiliza el Vehiculo Particular: ");
					String key7 = JOptionPane.showInputDialog("Estado del Vehiculo Particular (usado o nuevo): ");
					
					carrosParticularDisponibles.add(new Particular( key0 , key1 , key2 , key3 , key4 , key5 , key6 , key7) );
					break;
					
				case 2:
					//(int capacidad, String tipo, boolean cupo   ,  int id, double valor , String tipoCombustible , int modelo , String estado)
					int key10 , key13, key16 = 0; double key14 = 0;
					while(true)	{
						try {key10 = Integer.parseInt(JOptionPane.showInputDialog("Capacidad que tiene el Vehiculo Publico: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}
					while(true)	{
						try {key13 = Integer.parseInt(JOptionPane.showInputDialog("Id Personalizao del Vehiculo Publico: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}
					while(true)	{
						try {key14 = Double.parseDouble(JOptionPane.showInputDialog("Valor del Vahiculo Publico: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}
					while(true)	{
						try {key16 = Integer.parseInt(JOptionPane.showInputDialog("Modelo (año) del Vehiculo Publico: "));break;}
						catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
					}

					String key11 = JOptionPane.showInputDialog("Tipo de Vehiculo Publico: ");
					String key15 = JOptionPane.showInputDialog("Tipo de combustible que utiliza el Vehiculo Publico: ");
					String key17 = JOptionPane.showInputDialog("Estado del Vehiculo Publico (usado o nuevo): ");
					
					boolean keyEspecial = false;
					boolean modern = true;
					while(modern)
					{
						char aux = JOptionPane.showInputDialog("El Vehiculo Publico tiene cupo: \n\n [t] Si tiene Cupo \n [f] No tiene cupo").charAt(0);
						switch(aux)
						{
							case 't':
								keyEspecial = true;
								modern = false;
								break;
							case 'f':
								keyEspecial = false;
								modern = false;
								break;
							default:
								break;
						}
						
					}boolean key12 = keyEspecial;
					
					carrosPublicoDisponibles.add(new Publico( key10 , key11 , key12 , key13 , key14 , key15 , key16 , key17 ));
					break;
			}
			
		}
		
	}
	
	public void VenderVehiculo()
	{
		JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
				+ "Venta de Vehiculos Particulares o Vehiculos Publicos <br> Existentes en el sistema"
				+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
		
		boolean pete = true;
		while(pete)
		{
			int flag = 0;
			while(true) {
				try {
					flag = Integer.parseInt(JOptionPane.showInputDialog("¿Que Vehiculo vas a vender?: \n"
																		+ " [1] Vehiculo Particular \n"
																		+ " [2] Vehiculo Publico \n"
																		+ " [0] Cancelar Venta"));
					break;
				}catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
			
			switch(flag)
			{
				default:
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Venta de Vehiculos <br> Cancelada "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					pete = false;
					break;
					
				case 1:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
							+ " Escribe el ID del Vehiculo Particular que quieres vender <br> estos se mostraran acontinuacion en la terminal "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					
					MostrarParticulares();
					if(carrosParticularDisponibles.size() == 0)
					{
						JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+" No quedan Vehiculos para la venta "+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					}
					if(carrosParticularDisponibles.size() > 0)
					{
						int auxpos = 0;
						while(true) {
							try {auxpos = Integer.parseInt(JOptionPane.showInputDialog(" Que Vehiculo quieres vender "));break;}
							catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
						}				
						int pos = auxpos - 1;
						
						while(true) {
							if (pos > carrosParticularDisponibles.size() || pos < 0) {
								JOptionPane.showMessageDialog(null, "Este Vehiculo no Existe");
								break;
							}
							else {
								carrosVendidos.add(carrosParticularDisponibles.get(pos));
								carrosParticularDisponibles.remove(pos);
								MostrarVendidos();
								break;
							}
						}
					}
					
					
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
							+ " Escribe el ID del Vehiculo Publico que quieres vender <br> estos se mostraran acontinuacion en la terminal "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					
					MostrarPublico();
					if(carrosPublicoDisponibles.size() == 0)
					{
						JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+" No quedan Vehiculos para la venta "+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					}
					if(carrosPublicoDisponibles.size() > 0)
					{
						int aux1pos = 0;
						while(true) {
							try {aux1pos = Integer.parseInt(JOptionPane.showInputDialog(" Que Vehiculo quieres vender ")); break;}
							catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
						}
						int pos1 = aux1pos - 1;
						
						while(true) {
							if (pos1 > carrosPublicoDisponibles.size() || pos1 < 0) {
								JOptionPane.showMessageDialog(null, "Este Vehiculo no Existe");
								break;
							}
							else {
								carrosVendidos.add(carrosPublicoDisponibles.get(pos1));
								carrosPublicoDisponibles.remove(pos1);
								MostrarVendidos();
								break;
							}
						}
					}
									
					break;
			}
			
		}
		
	}
	
	public void MostrarParticulares()
	{		
		System.out.println("El tamaño de la lista es: " + carrosParticularDisponibles.size() );
		
		for(int i=0 ; i<carrosParticularDisponibles.size() ; i++)
		{
			System.out.println("Vehiculo Particular " + carrosParticularDisponibles.get(i).toString() );
		}
	}
	
	public void MostrarPublico()
	{		
		System.out.println("El tamaño de la lista es: " + carrosPublicoDisponibles.size() );
		
		for(int i=0 ; i < carrosPublicoDisponibles.size() ; i++)
		{
			System.out.println("Vehiculo Publico " + carrosPublicoDisponibles.get(i).toString() );
		}
	}
	
	public void MostrarVendidos()
	{
		System.out.println("El tamaño de la lista es: " + carrosVendidos.size() );
		
		for(int i=0 ; i < carrosVendidos.size() ; i++)
		{
			System.out.println("Vehiculo Vendidos " + carrosVendidos.get(i).toString() );
		}
	}
	
	public void BuscarPrecio()
	{
		//public Particular(int numPuertas, String color, String tipoMotor    ,     int id, double valor , String tipoCombustible , int modelo , String estado)
		//public Publico(int capacidad, String tipo, boolean cupo   ,  int id, double valor , String tipoCombustible , int modelo , String estado)
		
		JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
				+ " Buscar Vehiculos Publicos o Particulares <br> segun el rango de precio que estas dispuesto a pagar "
				+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
		
		boolean esta2 = true;
		while(esta2)
		{
			double preciomax = 0;
			while(true)
			{
				try {preciomax = Double.parseDouble(JOptionPane.showInputDialog("¿Que es lo maximo que desea pagar por el Coche?")); break;}
				catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
			
			int board = 0;
			while(true){
				try {
					board = Integer.parseInt(JOptionPane.showInputDialog("Ahora, que tipo de vehiculo vas a buscar: \n\n"
							+ "[1] Vehiculo Particular \n"
							+ "[2] Vehiculo Publico \n"
							+ "[0] Cancelar Busqueda"));
					break;
				}
				catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
					
			switch(board)
			{
				default:
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Busqueda de Vehiculos <br> Cancelada "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					esta2 = false;
					break;
					
				case 1:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Los Vehiculos Particulares Segun <br> tu rango de precio puedes verlos en la Terminal "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					
					for(int i=0 ; i<carrosParticularDisponibles.size() ; i++)
					{
						if(carrosParticularDisponibles.get(i).getValor() <= preciomax )
						{
							System.out.println("Vehiculo Particular " + carrosParticularDisponibles.get(i).toString() ); //revisar sentencia
						}
					}
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Los Vehiculos Publicos Segun <br> tu rango de precio puedes verlos en la Terminal "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					
					for(int i=0 ; i<carrosPublicoDisponibles.size() ; i++)
					{
						if(carrosPublicoDisponibles.get(i).getValor() <= preciomax )
						{
							System.out.println("Vehiculo Particular " + carrosPublicoDisponibles.get(i).toString() ); //revisar sentencia
						}
					}
					break;
			}
		}
		
	}
	
	public void BuscarModelo()
	{
		//public Particular(int numPuertas, String color, String tipoMotor    ,     int id, double valor , String tipoCombustible , int modelo , String estado)
		//public Publico(int capacidad, String tipo, boolean cupo   ,  int id, double valor , String tipoCombustible , int modelo , String estado)
		
		JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
				+ " Buscar Vehiculos Publicos o Particulares <br> segun el modelo"
				+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
		
		boolean esta3 = true;
		while(esta3)
		{
			int modelomax = 0;
			while(true) {
				try {modelomax = Integer.parseInt(JOptionPane.showInputDialog("¿Que año de fabricacion maximo quiere ver?")); break;}
				catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
			
			int board = 0;
			while(true) {
				try {
					board = Integer.parseInt(JOptionPane.showInputDialog("Ahora, que tipo de vehiculo vas a buscar: \n\n"
							+ "[1] Vehiculo Particular \n"
							+ "[2] Vehiculo Publico \n"
							+ "[0] Cancelar Busqueda"));
					break;
				}
				catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
					
			switch(board)
			{
				default:
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Busqueda de Vehiculos <br> Cancelada "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					esta3 = false;
					break;
					
				case 1:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Los Vehiculos Particulares Segun <br> tu modelo favorito los puedes ver en la Terminal "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					
					for(int i=0 ; i<carrosParticularDisponibles.size() ; i++)
					{
						if(carrosParticularDisponibles.get(i).getModelo() <= modelomax )
						{
							System.out.println("Vehiculo Particular " + carrosParticularDisponibles.get(i).toString() ); //revisar sentencia
						}
					}
					break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Los Vehiculos Publicos Segun <br> tu modelo favorito los puedes ver en la Terminal "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					
					for(int i=0 ; i<carrosPublicoDisponibles.size() ; i++)
					{
						if(carrosPublicoDisponibles.get(i).getModelo() <= modelomax )
						{
							System.out.println("Vehiculo Publico " + carrosPublicoDisponibles.get(i).toString() ); //revisar sentencia
						}
					}
					break;
			}
		}
		
	}
	
	public void OrdenarModelo()
	{
		JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
				+ " Ordenar Vehiculos Publicos o Particulares <br> segun el modelo"
				+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
		
		boolean esta4 = true;
		while(esta4)
		{
			int board1 = 0;
			while(true) {
				try {
					board1 = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de vehiculos quieres ver ordenados por Modelo: \n\n"
							+ "[1] Vehiculo Particular \n"
							+ "[2] Vehiculo Publico \n"
							+ "[0] Cancelar Busqueda"));
					break;
				}
				catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
			
			switch(board1)
			{
				default:
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Orden de Vehiculos <br> Cancelado "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					esta4 = false;
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
							+ " Puedes ver los vehiculos Particulares <br> ordenados por modelo en la <br> Terminal"
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					Collections.sort(carrosParticularDisponibles,new OrdenModelo());
					MostrarParticulares();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
							+ " Puedes ver los vehiculos Publicos <br> ordenados por modelo en la <br> Terminal"
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					Collections.sort(carrosPublicoDisponibles,new OrdenModelo());
					MostrarPublico();
					break;
			}
		}

	}
	
	public void OrdenarPrecio()
	{
		JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
				+ " Ordenar Vehiculos Publicos o Particulares <br> segun su precio (En Rupias :v)"
				+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
		
		boolean esta5 = true;
		while(esta5)
		{
			int board2 = 0;
			while(true) {
				try {
					board2 = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de vehiculos quieres ver ordenados por su Valor: \n\n"
							+ "[1] Vehiculo Particular \n"
							+ "[2] Vehiculo Publico \n"
							+ "[0] Cancelar Busqueda"));
					break;
				}
				catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);}
			}
			
			switch(board2)
			{
				default:
					break;
					
				case 0:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
							+ "Orden de Vehiculos <br> Cancelado "
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					esta5 = false;
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
							+ " Puedes ver los vehiculos Particulares <br> ordenados por modelo en la <br> Terminal"
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					Collections.sort(carrosParticularDisponibles,new OrdenPrecio());
					MostrarParticulares();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
							+ " Puedes ver los vehiculos Publicos <br> ordenados por modelo en la <br> Terminal"
							+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, imgIcono);
					Collections.sort(carrosPublicoDisponibles,new OrdenPrecio());
					MostrarPublico();
					break;
			}
		}
		
	}
	
	public void dateInit()
	{
		carrosParticularDisponibles = new ArrayList<Particular>();
		
		//(int numPuertas, String color, String tipoMotor    ,     int id, double valor , String tipoCombustible , int modelo , String estado)
		carrosParticularDisponibles.add(new Particular ( 4 , "verde" , "Automatico" , 1 , 500000000.0 , "ACPM" , 2016 , "nuevo" ) );
		carrosParticularDisponibles.add(new Particular ( 4 , "amarillo" , "Automatico" , 2 , 200000000.0 , "Gas" , 2017 , "nuevo" ) );
		carrosParticularDisponibles.add(new Particular ( 4 , "rojo" , "Mecanico" , 3 , 100000000.0 , "Gasolina" , 2018 , "usado" ) );
		
		carrosPublicoDisponibles = new ArrayList<Publico>();
		
		//(int capacidad, String tipo, boolean cupo   ,  int id, double valor , String tipoCombustible , int modelo , String estado)
		carrosPublicoDisponibles.add(new Publico( 80, "camioneta", true, 1, 4000000000.0, "Gasolina", 2014, "nuevo") );
		carrosPublicoDisponibles.add(new Publico( 200, "Bus Intercontinental", true, 2, 12000000000.0, "Gasolina", 2015, "nuevo" ));
		carrosPublicoDisponibles.add(new Publico( 75, "Bus", true, 3, 2000000000.0, "Gasolina", 2016, "nuevo" ));
		
		
		carrosVendidos = new ArrayList<Vehiculo>();
		
		//(int id, double valor , String tipoCombustible , int modelo , String estado)
		carrosVendidos.add(new Vehiculo( 1, 4000000.0, "ACPM", 2014, "usado" ) );
		carrosVendidos.add(new Vehiculo( 2, 2000000.0, "Gasolina", 2011, "usado") );
		carrosVendidos.add(new Vehiculo( 3, 1000000.0, "Electrico", 2011, "usado") );
		
		//Se podria crear una lista que almacene todos los vahiculos no vendidos utilizando adall de cada uno
	}
}
