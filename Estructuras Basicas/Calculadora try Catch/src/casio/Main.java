/*
 Facultad: Ingenieria de Sistemas
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Materia: Estructura de datos 
 Grupo: CONSSF
 Ejericicio: Calculadora de dos variables con Excepciones
*/
package casio;

import javax.swing.JOptionPane;

//import java.io.FileNotFoundException; //Libreria para que funcione la excepcion ----Lanza una excepción cuando el fichero no se encuentra.
import java.io.PrintWriter; //Libreria para trabajar con esta linea generadora de archivos


public class Main 
{

	Numero number1 = new Numero(0);
	Numero number2 = new Numero(0);
	
	Numero resultados[] = new Numero[6];
	
	//Metodo main  ................................................................................................................................................
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 
		// ................................................................................................................................................
		 
		Main m = new Main();  // este objeto es de la clase Main, funciona entre puente de Main y main , para que la segunda pueda cojer los de la primera
		// se debe tener encuenta que para llmar ahora estos objetos de Main , en main se deben pedir como m.NombreObjeto
		//por ejemplo si se quiere pedir el valor del objeto seria m.resultados[0].getNumber();
		//por ejemplo si se quiere cambiar el valor del ovjeto seria m.resultados[0].setNumber();
		
		// ................................................................................................................................................

		for(int i = 0;i<6;i++) //crea un objeto en cada una de las posiciones del vector , esto para que mas adelante puedan ser llamados o sobre escritos
            m.resultados[i] = new Numero();
		
		// ................................................................................................................................................
		
		//Ingreso de par de variable
		
		while(true)//ciclo necesario para que en caso de ingresar un dato malo vuelva a preguntar hasta que el usuario ingrese algo valido
		{
			try {
				JOptionPane.showInternalMessageDialog(null, "Bienvenido a tu caculadora CASIO");
				float Hagstag1 = Float.parseFloat( JOptionPane.showInputDialog("Escribe tu primer variable: ") );
				m.number1.setNumber(Hagstag1);
				float Hagstag2 = Float.parseFloat( JOptionPane.showInputDialog("Escribe tu segunda variable: ") );
				m.number2.setNumber(Hagstag2);
				
				break;//para salir del while cuando ya se halla ingresado numero
				
			}catch(NumberFormatException e) //para meter solo numeros no datos alfanumericos
			{
				JOptionPane.showInternalMessageDialog(null, "Este no es un numero, intentelo de nuevo: "+"["+ e.getMessage() +"]");
			}
		}
		
		
		
		
		// ................................................................................................................................................
		
		boolean estado = true;
		while(estado)
		{
			try 
			{
				
				int teclado = Integer.parseInt( JOptionPane.showInputDialog(null, "AHora selecciona la operacion que quieres hacer: \n"
													+ "[1] Operacion Suma \n"
													+ "[2] Operacion resta \n"
													+ "[3] Operacion Division \n"
													+ "[4] Operacion Multiplicacion \n"
													+ "[5] Operacion Residuo \n"
													+ "[6] Para ver Todos los resultados hasta el momento \n \n"
													+ "[7] Genere Un archivo con sus resultados \n \n"
													+ "[0] EXIT program") );
				
				switch(teclado)
				{
					case 1:
						float suma = m.number1.getNumber() + m.number2.getNumber();
						try 
						{
							m.resultados[0].setNumber(suma);
							JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + m.resultados[0].getNumber());
						}catch(ArrayIndexOutOfBoundsException h) //Error con los vectores en sus posiciones
						{
							JOptionPane.showMessageDialog(null, "Error en la posicion del vector, revisa el codigo: " + h.getMessage());
						}
						break;
						
					case 2:
						float resta = m.number1.getNumber() - m.number2.getNumber();
						try {
							m.resultados[1].setNumber(resta);
							JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + m.resultados[1].getNumber());
						}catch(ArrayIndexOutOfBoundsException h) //Error con los vectores en sus posiciones
						{
							JOptionPane.showMessageDialog(null, "Error en la posicion del vector, revisa el codigo: " + h.getMessage());
						}

						break;
						
					case 3:
						m.operacionDivision(); //esta llamando el metodo que contiene el proceso de division
						break;
						
					case 4:
						try {
							float Multiplicacion = m.number1.getNumber() * m.number2.getNumber();
							m.resultados[3].setNumber(Multiplicacion);
							JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + m.resultados[3].getNumber());
						}catch(ArrayIndexOutOfBoundsException h) //Error con los vectores en sus posiciones
						{
							JOptionPane.showMessageDialog(null, "Error en la posicion del vector, revisa el codigo: " + h.getMessage());
						}

						break;
						
					case 5:
						try
						{
							float Residuo = m.number1.getNumber() % m.number2.getNumber();
							m.resultados[4].setNumber(Residuo);
							JOptionPane.showMessageDialog(null, "El resultado del residuo es: " + m.resultados[4].getNumber());
						}catch(ArrayIndexOutOfBoundsException h) //Error con los vectores en sus posiciones
						{
							JOptionPane.showMessageDialog(null, "Error en la posicion del vector, revisa el codigo: " + h.getMessage());
						}

						break;
						
					case 6:
						try
						{
							JOptionPane.showMessageDialog(null, "Suma :" + m.resultados[0].getNumber()+"Resta: " + m.resultados[1].getNumber()+"Division: " + m.resultados[2].getNumber()+"Multiplicacion: " + m.resultados[3].getNumber() +"Residuo: " + m.resultados[4].getNumber());
						}catch(ArrayIndexOutOfBoundsException h) //Error con los vectores en sus posiciones
						{
							JOptionPane.showMessageDialog(null, "Error en la posicion del vector, revisa el codigo: " + h.getMessage());
						}
						
						break;
						
					case 7:
						m.generateTxt();
						break;
							
					case 0:
						estado = false;
						break;
				}
			}catch(NumberFormatException e) //Lanza una excepcion cuando se proceda un numero pero este es un dato afanumerico
			{
				JOptionPane.showInternalMessageDialog(null, "Este no es un numero , no mame señor, intentelo de nuevo: "+"["+ e.getMessage() +"]");
			}
					
		}
		
	}

	
	//METODOS QUE IRAN EN LOS CASOS ................................................................................................................................................
	
	public void operacionDivision()
	{
		try {
			float Division = number1.getNumber() / number2.getNumber();
			try
			{
				resultados[2].setNumber(Division);
				JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultados[2].getNumber());
			}catch(NumberFormatException e) //Lanza una excepcion cuando se proceda un numero pero este es un dato afanumerico
			{
				JOptionPane.showInternalMessageDialog(null, "Este no es un numero , no mame señor, intentelo de nuevo: "+"["+ e.getMessage() +"]");
			}
			
			
		}catch(ArithmeticException f)//Excepcion matematica cuando se divide por cero
		{
			JOptionPane.showMessageDialog(null, "Ha sucedido el siguiente error: " + f.getMessage());
		}
	}
	
	
	
	public void generateTxt()
	{
		try {
            PrintWriter writer = new PrintWriter("D:/ruiso/ESTUDIOS/Ingenieria de Sistemas/MATERIAS/SEMESTRE I/Estructuras de Datos/Eclipse Folder/Calculadora try Catch/src/casio/Resultados.txt", "UTF-8");
            
            writer.println("Resultado Operaciones CASIO \n");
            writer.println("Resultado Operacion Suma: "+ number1.getNumber() +" entre "+ number2.getNumber() +"da "+resultados[0].getNumber());
            writer.println("Resultado Operacion Resta: "+ number1.getNumber() +" entre "+ number2.getNumber() +"da "+resultados[1].getNumber());
            writer.println("Resultado Operacion Division: "+ number1.getNumber() +" entre "+ number2.getNumber() +"da "+resultados[2].getNumber());
            writer.println("Resultado Operacion Multiplicacion: "+ number1.getNumber() +" entre "+ number2.getNumber() +"da "+resultados[3].getNumber());
            writer.println("Resultado Operacion Residuo: "+ number1.getNumber() +" entre "+ number2.getNumber() +"da "+resultados[4].getNumber());
            
            writer.close();
        } catch (Exception g) //iba a utilizar FileNotFoundException g   , pero no esta compagenado con PrintWriter
		{
            g.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: "+ g.getMessage() );
        }
	}
	
	
	
	
	
	

}
