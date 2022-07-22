
/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 Ejercicio: Quiz Practico - Panaderia
 */
package controller;


import java.io.PrintWriter;

import javax.swing.JOptionPane;


import model.Cliente;
import model.Pan;

/**
 *
 * @author yolima
 */
public class Panaderia
{
    
    private Cliente clientes[];
    private Pan despensa[]; //new
    private int clienteactual;

    public Panaderia() {    }

    public Cliente[] getClientes()    {        return clientes;    }
    public void setClientes(Cliente[] clientes)     {        this.clientes = clientes;    }
    
    
    public Pan[] getDespensa() {		return despensa;	}//new
	public void setDespensa(Pan[] despensa) {		this.despensa = despensa;	}//new
	
	
	public int getClienteactual() {		return clienteactual;	} //new
	public void setClienteactual(int clienteactual) {		this.clienteactual = clienteactual;	} //new
	
    
    // ......................................... METODO PARA VENDER PAN ...............................................................................................
    
	public void venderPan()
    {			
		//......................................................................................................
		
		int numeroPanes = 0;
		                
        int [] numPan = new int[12];//new
        for(int i = 0;i<12;i++) //crea un objeto en cada una de las posiciones del vector , esto para que mas adelante puedan ser llamados o sobre escritos //new
            numPan[i] = 0;
        
        //......................................................................................................
		
        JOptionPane.showMessageDialog(null,"QUIZ PRACTICO "
        		+ "\n PANADERIA PANE RICCO \n \n "
        		+ "Facultad: Ingenieria de Sistemas \n "
        		+ "Materia: Estructura de Datos \n "
        		+ "Estudiante: Luis Felipe Narvaez Gomez \n "
        		+ "Cod: 2312660 \n "
        		+ "Periodo: 2021-1");//new
        
        Cliente cliente = new Cliente();//new
        String clienteValor = JOptionPane.showInputDialog(" Digite el Nombre del Cliente por favor: ");//new
        try {
        	cliente.setNombre(clienteValor);//new
        }catch(ArrayIndexOutOfBoundsException h) //Error con los vectores en sus posiciones
		{
			JOptionPane.showMessageDialog(null, "Error en la posicion del vector, revisa el codigo: " + h.getMessage());
		}
        
        
        
		JOptionPane.showMessageDialog(null,"Panes a la venta:");//new
        
        for(int i = 0; i < despensa.length;i++)
        //JOptionPane.showMessageDialog(null, (despensa[i].getTipo() + " Valor unitario: " + despensa[i].getPrecio() ));//new cambio
        System.out.println(despensa[i].getTipo() + " Valor unitario: " + despensa[i].getPrecio());
        
        //JOptionPane.showMessageDialog(null, "Cuantos panes desea comprar de cada tipo?:");//new
        System.out.println("Cuantos panes desea comprar de cada tipo?:");
        
        
      //......................................................................................................
        boolean estado = true;//new
        
        while(estado)//new
        {
        	int totalCompra = (despensa[0].getPrecio()*numPan[0])
        			+ (despensa[1].getPrecio()*numPan[1]) 
        			+ (despensa[2].getPrecio()*numPan[2]) 
        			+ (despensa[3].getPrecio()*numPan[3]) 
        			+ (despensa[4].getPrecio()*numPan[4]) 
        			+(despensa[5].getPrecio()*numPan[5]) 
        			+ (despensa[6].getPrecio()*numPan[6]) 
        			+ (despensa[7].getPrecio()*numPan[7]) 
        			+ (despensa[8].getPrecio()*numPan[8]) 
        			+ (despensa[9].getPrecio()*numPan[9]) 
        			+ (despensa[10].getPrecio()*numPan[10])
        			+ (despensa[11].getPrecio()*numPan[11]) ;//new
        	
        	int teclado = 0;//inicializo el teclado . _. //new
        	while(true)
        	{
        		try
        		{
        			teclado = Integer.parseInt(JOptionPane.showInputDialog( "CLIENTE: "+cliente.getNombre()
        			+"\n \n ¿Cuantos Panes desea comprar? "
            		+ "\n \n [1] "+despensa[0].getTipo()+"...........................Cant:  "+numPan[0]+".....Unidad:  "+despensa[0].getPrecio()+".....subTotal: "+despensa[0].getPrecio()*numPan[0]
            		+ "\n [2] "+despensa[1].getTipo()+".....................Cant:  "+numPan[1]+".....Unidad:  "+despensa[1].getPrecio()+".....subTotal: "+despensa[1].getPrecio()*numPan[1]
            		+ "\n [3] "+despensa[2].getTipo()+"...........................Cant:  "+numPan[2]+".....Unidad:  "+despensa[2].getPrecio()+".....subTotal: "+despensa[2].getPrecio()*numPan[2]
            		+ "\n [4] "+despensa[3].getTipo()+"...............Cant:  "+numPan[3]+".....Unidad:  "+despensa[3].getPrecio()+".....subTotal: "+despensa[3].getPrecio()*numPan[3]
            		+ "\n [5] "+despensa[4].getTipo()+".................Cant:  "+numPan[4]+".....Unidad:  "+despensa[4].getPrecio()+".....subTotal: "+despensa[4].getPrecio()*numPan[4]
            		+ "\n [6] "+despensa[5].getTipo()+".........................Cant:  "+numPan[5]+".....Unidad:  "+despensa[5].getPrecio()+".....subTotal: "+despensa[5].getPrecio()*numPan[5]
            		+ "\n [7] "+despensa[6].getTipo()+".....Cant:  "+numPan[6]+".....Unidad:  "+despensa[6].getPrecio()+".....subTotal: "+despensa[6].getPrecio()*numPan[6]
            		+ "\n [8] "+despensa[7].getTipo()+"...................Cant:  "+numPan[7]+".....Unidad:  "+despensa[7].getPrecio()+".....subTotal: "+despensa[7].getPrecio()*numPan[7]
            		+ "\n [9] "+despensa[8].getTipo()+".........................Cant:  "+numPan[8]+".....Unidad:  "+despensa[8].getPrecio()+".....subTotal: "+despensa[8].getPrecio()*numPan[8]
            		+ "\n [10] "+despensa[9].getTipo()+"....................Cant:  "+numPan[9]+".....Unidad:  "+despensa[9].getPrecio()+".....subTotal: "+despensa[9].getPrecio()*numPan[9]
            		+ "\n [11] "+despensa[10].getTipo()+".........................Cant:  "+numPan[10]+".....Unidad:  "+despensa[10].getPrecio()+".....subTotal: "+despensa[10].getPrecio()*numPan[10]
            		+ "\n [12] "+despensa[11].getTipo()+"..........................Cant:  "+numPan[11]+".....Unidad:  "+despensa[11].getPrecio()+".....subTotal: "+despensa[11].getPrecio()*numPan[11]
            		+"\n \n TOTAL DE PANES COMPRADOS: " + numeroPanes + " TOTAL A PAGAR:  "+totalCompra
            		+"\n  \n [13] Imprime tu recibo de compra \n (Recuerde que cada cliente tendra un recibo de compra diferente) \n pdta: ver archivos txt distintos en la ruta de impresion del archivo"
            		+"\n  \n [14] CAMBIAR DE CLIENTE"
            		+"\n "));//new
        			
        			break;
        		}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
    			{
    				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+"["+ e.getMessage() +"]");
    			}
        	}
        	
        	
        	
        	switch(teclado)
        	{
        		case 1:
      		 // .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			
        			while(true)
        			{
        				try
        				{
        					int tecla1 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla1)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
        			
				// .....................................................................................................................................................................
        			break;
        			
        		case 2:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			
        			while(true)
        			{
        				try 
        				{
        					int tecla2 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla2)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 3:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			
        			while(true)
        			{
        				try
        				{
        					int tecla3 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla3)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 4:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla4 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla4)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
				// .....................................................................................................................................................................

        			break;
        			
        		case 5:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla5 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla5)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 6:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla6 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla6)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 7:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla7 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla7)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 8:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla8 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla8)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 9:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla9 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla9)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 10:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla10 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla10)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 11:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla11 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla11)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 12:
        			// .....................................................................................................................................................................
        			JOptionPane.showMessageDialog(null, "PAN: "+despensa[teclado-1].getTipo());
        			while(true)
        			{
        				try
        				{
        					int tecla12 = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres Agregar o Quitar panes de tu Canasta? \n \n [1]  Agregar Panes \n  [2] Quitar Panes "));
                			
        					switch(tecla12)
        	        			{
        	        				case 1:
        	        					int key = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes?"));
        	        					numPan[teclado-1] += key;
        	        					numeroPanes += key;
        	        					JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        	        					break;
        	        					
        	        				case 2:
        	        					//.....primera evaluacion
        	        					if(numPan[teclado-1] <= 0)
        	        					{  					
        	        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        	        						numPan[teclado-1] = 0;
        	        					}
        	        					else
        	        					{
        	        						JOptionPane.showMessageDialog(null, "Actualmente el numero de panes es de: "+numPan[teclado-1]);        					
        	        						//....continua
        	        						int key1 = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Panes desea quitar?"));
        		        					int reservaKey = numPan[teclado-1];
        		        					numPan[teclado-1] -= key1;
        		        					if(numPan[teclado-1] < 0) //....segunda evaluacion
        		        					{
        		        						JOptionPane.showMessageDialog(null, "Lo sentimos pero no puede descontar mas panes");
        		        						numPan[teclado-1] = reservaKey;
        		        						reservaKey = 0;
        		        					}else {
        		        						JOptionPane.showMessageDialog(null, "Ok , tu pedido es de "+numPan[teclado-1]+" panes de "+despensa[teclado-1].getTipo());
        		        						reservaKey = 0;
        		        						numeroPanes -= key1;
        		        					}
        	        					}	
        	        					
        	        					break;
        	        					
        	        				default:
        	                			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        	                			break;
        	        			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			
				// .....................................................................................................................................................................

        			break;
        			
        		case 13://Imprimir Recibo de Compra
        			String nombreRecibo = "ReciboPanaderia"+cliente.getNombre();
        			try {
        	            PrintWriter writer = new PrintWriter("D:/ruiso/ESTUDIOS/Ingenieria de Sistemas/MATERIAS/SEMESTRE I/Estructuras de Datos/Eclipse Folder/Quiz Panaderia/src/"+nombreRecibo+".txt", "UTF-8");
        	            
        	            writer.println("______________________________________________________");
        	            writer.println("FACTURA CLIENTE : "+cliente.getNombre());
        	            writer.println("______________________________________________________ \n \n");
        	            writer.println("[1] "+despensa[0].getTipo()+"...........................Cant:  "+numPan[0]+".....Unidad:  "+despensa[0].getPrecio()+".....subTotal: "+despensa[0].getPrecio()*numPan[0]);
        	            writer.println("[2] "+despensa[1].getTipo()+".....................Cant:  "+numPan[1]+".....Unidad:  "+despensa[1].getPrecio()+".....subTotal: "+despensa[1].getPrecio()*numPan[1]);
        	            writer.println("[3] "+despensa[2].getTipo()+"...........................Cant:  "+numPan[2]+".....Unidad:  "+despensa[2].getPrecio()+".....subTotal: "+despensa[2].getPrecio()*numPan[2]);
        	            writer.println( "[4] "+despensa[3].getTipo()+"...............Cant:  "+numPan[3]+".....Unidad:  "+despensa[3].getPrecio()+".....subTotal: "+despensa[3].getPrecio()*numPan[3]);
        	            writer.println("[5] "+despensa[4].getTipo()+".................Cant:  "+numPan[4]+".....Unidad:  "+despensa[4].getPrecio()+".....subTotal: "+despensa[4].getPrecio()*numPan[4]);
        	            writer.println("[6] "+despensa[5].getTipo()+".........................Cant:  "+numPan[5]+".....Unidad:  "+despensa[5].getPrecio()+".....subTotal: "+despensa[5].getPrecio()*numPan[5]);
        	            writer.println("[7] "+despensa[6].getTipo()+".....Cant:  "+numPan[6]+".....Unidad:  "+despensa[6].getPrecio()+".....subTotal: "+despensa[6].getPrecio()*numPan[6]);
        	            writer.println("[8] "+despensa[7].getTipo()+"...................Cant:  "+numPan[7]+".....Unidad:  "+despensa[7].getPrecio()+".....subTotal: "+despensa[7].getPrecio()*numPan[7]);
        	            writer.println("[9] "+despensa[8].getTipo()+".........................Cant:  "+numPan[8]+".....Unidad:  "+despensa[8].getPrecio()+".....subTotal: "+despensa[8].getPrecio()*numPan[8]);
        	            writer.println("[10] "+despensa[9].getTipo()+"....................Cant:  "+numPan[9]+".....Unidad:  "+despensa[9].getPrecio()+".....subTotal: "+despensa[9].getPrecio()*numPan[9]);
        	            writer.println("[11] "+despensa[10].getTipo()+".........................Cant:  "+numPan[10]+".....Unidad:  "+despensa[10].getPrecio()+".....subTotal: "+despensa[10].getPrecio()*numPan[10]);
        	            writer.println("[12] "+despensa[11].getTipo()+"..........................Cant:  "+numPan[11]+".....Unidad:  "+despensa[11].getPrecio()+".....subTotal: "+despensa[11].getPrecio()*numPan[11]);
        	            writer.println("\n \n TOTAL DE PANES COMPRADOS: " + numeroPanes + " TOTAL A PAGAR:  "+totalCompra);
        	            writer.println("______________________________________________________");
        	            writer.println("¡QUE TENGA UN BUEN DIA!");
        	            writer.println("______________________________________________________");
        	            
        	            writer.close();
        	            
        	            cliente.setCanasta(despensa); //guardara lo concerniente a la despensa segun este cliente
        	            
        	        } catch (Exception g) //iba a utilizar FileNotFoundException g   , pero no esta compagenado con PrintWriter
        			{
        	            g.printStackTrace();
        	            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: "+ g.getMessage() );
        	        }
        			
        			break;
        			
        		case 0://Salir del programa
        			JOptionPane.showMessageDialog(null, "See you next time");
        			estado = false;
        			break;
        			
        		case 14://Nuevo Cliente
        			JOptionPane.showMessageDialog(null, "Recuerde que si cambia de cliente se reiniciara la canasta de compra y se imprimira un recibo distindo ¿Esta de acuerdo?");
        			
        			while(true)
        			{
        				try
        				{
                			int teclaCliente = Integer.parseInt(JOptionPane.showInputDialog("[1] Deseo cambiar de cliente y reiniciar la factura \n [2] NO cambiare de cliente"));
                			
                			switch(teclaCliente)
                			{
        	        			case 1:
        	        				String clienteValor2 = JOptionPane.showInputDialog(" Digite el Nombre del Cliente por favor: ");//new
        	        		        cliente.setNombre(clienteValor2);//new
        	        		        
        	        		        for(int i=0; i<numPan.length; i++)
        	        		        {
        	        		        	numPan[i] = 0;
        	        		        }
        	        		        numeroPanes = 0;
        	        		        totalCompra = 0;
        	        				break;
        	        			case 2:
        	        				JOptionPane.showMessageDialog(null, "seguiras trabajando con el cliente: "+ cliente.getNombre());
        	        				break;
                				default:
                					JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
                					break;
                					
                			}
        					break;
        				}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
            			{
            				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+" [ "+ e.getMessage() +" ] ");
            			}
        			}
        			

        			break;
        		
        		default:
        			JOptionPane.showMessageDialog(null, "Comando Incorrecto, vuelvelo a intentar");
        			break;
        	}
        }
        
        
        
        
        /*
        for(int i = 0; i < despensa.length;i++)
        {
        	 JOptionPane.showMessageDialog(null,despensa[i].getTipo());//new
             int numCanasta = 0;
             
             for(int j = 0; j < numeroPanes;j++)
             {
             clientes[clienteactual].getCanasta()[numCanasta] = despensa[i];
             numCanasta++;
             }
        }
       */

    } 
	
	// .....................................................................METODOS ........................................................................
	public void menuPanes()
	{
				
	}
	
	
	public void generateTxt()
	{
		
	}
}
