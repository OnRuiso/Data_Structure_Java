package Bodega;

import javax.swing.JOptionPane;

public class Bodega
{
	private int almacen = 0;
	private int arroz = 0;        private double tempPesoArroz = 0;
	private int frijol = 0;       private double tempPesoFrijol = 0;
	private int lenteja = 0;      private double tempPesoLenteja = 0;
	private int garbanzo = 0;     private double tempPesoGarbanzo = 0;
	
	
	//...........................................................................................................................................
	public void recibirMerca(String produNombre , double produPeso )
	{
		JOptionPane.showMessageDialog(null, "Bienvenido a la bodega \n "
				+ "Ingrese el nombre del producto que desea entrar y su peso \n"
				+ " recuerde escribir con Mayuscula inicial y correcta ortografia");
		
		recibeDatos();
		
		
		if( (produNombre.equals("Arroz") || produNombre.equals("Frijol") || produNombre.equals("Lenteja") || produNombre.equals("Garbanzo")) && (produPeso < 100) )
		{
			almacen =  almacen +1;
			JOptionPane.showMessageDialog(null, "Nuevo Producto en el almacen, en total: "+ almacen);
			
			if(produNombre.equals("Arroz")) { arroz =+ 1; tempPesoArroz = tempPesoArroz + produPeso;}
			if(produNombre.equals("Frijol")) { frijol =+ 1; tempPesoFrijol = tempPesoFrijol + produPeso;}
			if(produNombre.equals("Lenteja")) { lenteja =+ 1; tempPesoLenteja = tempPesoLenteja + produPeso;}
			if(produNombre.equals("Garbanzo")) { garbanzo =+ 1; tempPesoGarbanzo = tempPesoGarbanzo + produPeso;}
			
			mostrarMercancia();
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "El producto no cumple con los requerimientos");
		}
	}
	//...........................................................................................................................................
	public void mostrarMercancia()
	{
		JOptionPane.showMessageDialog(null, 
				"Cantidad de Arroz: "+arroz+" bolsas ; con un peso acumulado de:"+tempPesoArroz+" \n"
				+ "Cantidad de Frijol: "+frijol+ "bolsas ; con un peso acumulado de:"+tempPesoFrijol+"\n"
				+ "Cantidad de Lenteja: "+lenteja+" bolsas ; con un peso acumulado de:"+tempPesoLenteja+"\n"
				+ "Cantidad de Garbanzo:"+garbanzo+ "bolsas ; con un peso acumulado de:"+tempPesoGarbanzo);
	}
	//...........................................................................................................................................
	public void recibeDatos()
	{
		String produNombre = "";
		while(true)
		{
			try { produNombre = JOptionPane.showInputDialog("Nombre del Producto a Ingresar");		break; }
			catch(Exception e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");	}
		}
		
		double produPeso = 0;
		while(true)
		{
			try {produPeso = Double.parseDouble(JOptionPane.showInputDialog("Peso del producto en Kilogramos (Kg)"));	break; }
			catch(NumberFormatException e){JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo \n Error: "+"["+ e.getMessage() +"]");	}
		}
		
		recibirMerca(produNombre,produPeso);
	}
}
