

/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 Ejercicio: Quiz Practico - Panaderia
 */
package quiz1;

import javax.swing.JOptionPane;

import controller.Panaderia;
import model.Cliente;
import model.Pan;//new


public class Inicio 
{

   private Panaderia tienda;

    public static void main(String[] args)
    {
    	Inicio m = new Inicio();
    	
    	m.tienda = new Panaderia(); //objeto para llamar metodos o cosas de la clase Panaderia     //new
    	
    	//Pan pancito = new Pan(); //objeto para trabajar con los atributos de la clase Pan
        
        // añadir panes
        // vender pan: registrar cada cliente que va llegando y decirle el total
        
        //corregir errores (sintaxis y de lógica)
        
        //agregar try/catch correcta y realizar la guía de error para que no se dañe el programa
        
    	

    	
    	
    	//-............................ DESPENSA ......................................................... //new
    	
        //[1] Pan de trigo 
    	Pan panTrigo = new Pan();
    	panTrigo.setTipo("Pan de Trigo");
    	panTrigo.setPrecio(2000);
    	
    	//String pancitoTrigo = panTrigo.getTipo()+" "+" $ "+panTrigo.getPrecio(); 
    	//p.setDespensa(panTrigo); 
    	//p.despensa[0] = panTrigo;
        
        //[2] Pan de centeno
    	Pan panCenteno = new Pan();
    	panCenteno.setTipo("Pan de Centeno");
    	panCenteno.setPrecio(3000);
        
        //[3] Pan Frances
    	Pan panUlala = new Pan();
    	panUlala.setTipo("Pan Frances");
    	panUlala.setPrecio(4000);
                
        //[4] Pan de Mantequilla
    	Pan panMant = new Pan();
    	panMant.setTipo("Pan de Mantequilla");
    	panMant.setPrecio(8000);
        
        //[5] Pan Blanco
    	Pan panWhite = new Pan();
    	panWhite.setTipo("Pan Blanco");
    	panWhite.setPrecio(1000);
        
        //[6] Pan de Molde
    	Pan panMolde = new Pan();
    	panMolde.setTipo("Pan de Molde");
    	panMolde.setPrecio(2000);
        
        //[7] Pan Mogollas
    	Pan panMogo = new Pan();
    	panMogo.setTipo("Pan de Mogollas");
    	panMogo.setPrecio(3000);
        
    	//[8] Pan Relleno
    	Pan panNaruto = new Pan();
    	panNaruto.setTipo("Pan de Relleno");
    	panNaruto.setPrecio(10000);
        
    	//[9] Pan de Avena
    	Pan panAvena= new Pan();
    	panAvena.setTipo("Pan de Avena");
    	panAvena.setPrecio(4500);
        
    	//[10] Pan intergral
    	Pan panInt = new Pan();
    	panInt.setTipo("Pan Integral y Derivativo");
    	panInt.setPrecio(2000);
        
        //[11] Pan Vegano
    	Pan panVeg = new Pan();
    	panVeg.setTipo("Pan Vegano");
    	panVeg.setPrecio(5000);
    	
    	//[12] Pan con Arequipe :3
    	Pan panAre = new Pan();
    	panAre.setTipo("Pan con Arequipe");
    	panAre.setPrecio(15000);

    	
    	
    	try
    	{
    		Pan vector[] = {panTrigo , panCenteno , panUlala , panMant , panAre , panAvena , panInt , panMogo , panMolde, panNaruto , panVeg , panWhite};
    		m.tienda.setDespensa(vector);
    	}catch(ArrayIndexOutOfBoundsException h) //Error con los vectores en sus posiciones
		{
			JOptionPane.showMessageDialog(null, "Error en la posicion del vector, revisa el codigo: " + h.getMessage());
		}
    	
    	
    	
    	//-............................ MENU DE VENTA ......................................................... //new
    	m.tienda.venderPan(); //Mostar el Menu de Venta de pan
    }
    
}
