/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */
package compraventa;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main
{	
	private CompraVenta uwu;

	public static void main(String[] args)
	{
		Main m = new Main();
		m = new Main();
		m.uwu = new CompraVenta();
		
		m.uwu.dateInit();
		
		
		
		//------------------------------------------------------------------------------------------------------------------------------------
		
		JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
											+ "VENTA DE VEHICULOS  <br> "
											+ "PARTICULARES Y PUBLICOS <br> "
											+ "LFNG "
											+ "</b></h1></html> \n\n",null,JOptionPane.INFORMATION_MESSAGE, m.uwu.getImgIcono());

		boolean estado = true;
		
		while (estado)
		{
			int teclado = 0; //inicializacion del teclado (. _.)
			while(true)
			{
				try {
					teclado = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, seleccione una opcion \n\n"
							+ "[1] Registrar un Vehiculo \n"
							+ "[2] Vender un vehiculo \n"
							+ "[3] Mostrar Vehiculos Particulares \n"
							+ "[4] Mostrar Vehiculos Publicos \n"
							+ "[5] Buscar Vehiculos segun el Precio \n"
							+ "[6] Buscar Vehiculos segun el Modelo \n"
							+ "[7] Mostrar Vehiculos ordenados por Modelo \n"
							+ "[8] Mostrar Vehiculos ordenados por Precio \n\n"
							+ "[0] Salir del Programa \n\n\n"
							+ "Notas de Version: \n"
							+ "Habilitado para errores de capa8 [70% o 100% creo] \n"));
					break;
				}catch(NumberFormatException e)	{JOptionPane.showInternalMessageDialog(null, "<html><h1 align='center'><b>"
					+"Este no es un numero, intentelo de nuevo <br> Error"+"["+ e.getMessage() +"]"+"</b></h1></html> \n\\n"
						,null,JOptionPane.INFORMATION_MESSAGE, m.uwu.getImgIcono());}
			}		
		
		switch(teclado)
			{
			default:
				JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b>"
												+ "Esto no es dato valido , vuelvelo a intentar /(._.)/"
												+ "</b></h1></html> \n\\n",null,JOptionPane.INFORMATION_MESSAGE, m.uwu.getImgIcono());
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> See you Later </b></h1></html>"
						,null,JOptionPane.INFORMATION_MESSAGE, m.uwu.getImgIcono());
				estado = false;
				break;
			case 1:
				m.uwu.ResgistrarVehiculo();
				break;
			case 2:
				m.uwu.VenderVehiculo();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
						+ "La lista de Vehiculos Particulares Disponibles <br> puede observarse en la Terminal "
						+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, m.uwu.getImgIcono());
				m.uwu.MostrarParticulares();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "<html><h1 align='center'><b> "
						+ "La lista de Vehiculos Publicos Disponibles <br> puede observarse en la Terminal "
						+ "</b></h1></html>",null,JOptionPane.INFORMATION_MESSAGE, m.uwu.getImgIcono());
				m.uwu.MostrarPublico();
				break;
			case 5:
				m.uwu.BuscarPrecio();
				break;
			case 6:
				m.uwu.BuscarModelo();
				break;
			case 7:
				m.uwu.OrdenarModelo();
				break;
			case 8:
				m.uwu.OrdenarPrecio();
				break;
			}
		
		}
		//------------------------------------------------------------------------------------------------------------------------------------
		
	}

}
