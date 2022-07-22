/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Controller
{
	List<Instrument> guitarras; 
	
	public Controller()
	{
		this.guitarras = guitarras;
	}

	public List<Instrument> getGuitarras() {	return guitarras; }
	public void setGuitarras(List<Instrument> guitarras) {		this.guitarras = guitarras;	}

	//------------------------------------------------------------------------------------------------------
	
	public void Launch()
	{
		//faltan try catch para errores de acceso , si es num es num no estring , tambien para tamaños de listas y revisar texto en los metodos
		
		JOptionPane.showMessageDialog(null, "Metodos y Funciones Array List en Java \n\n"
											+ "Este programa despliega una serie de opciones en las que podra \n utilizar los diferentes metodos/Funciones de ArrayList de Java \n\n"
											+ "El Ejercicio Pone en contexto una tienda de Intrumentos musicales , surtidora \n de la marca Fender , concretamente los diferentes modelos de Guitarras electricas.");
		
		boolean estado = true;
		
		while(estado)
		{
			int teclado = Integer.parseInt(JOptionPane.showInputDialog("Tienda de Guitarras electricas de FENDER, seeccione una opcion: \n"
																		+ "[1] | Metodo add | \n"
																		+ "[2] | Metodo remove | \n"
																		+ "[3] | Metodo clear | \n"
																		+ "[4] | Metodo size | \n"
																		+ "[5] | Metodo get | \n"
																		+ "[6] | Metodo iterator [°_°] | \n"
																		+ "[7] | Metodo isEmpty | \n"
																		+ "[8] | Metodo indexOf | \n"
																		+ "[9] | Metodo set [°_°] | \n"
																		+ "[10] | Metodo addAll [°^°] | \n\n"
																		+ "[0] Salir del Programa"));
			
			mostrarDatos();
			
			switch(teclado)
			{
				default:
					JOptionPane.showMessageDialog(null, "Esto no es dato valido , vuelvelo a intentar (._.)");
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "See you Later");
					estado = false;
					break;
					
				case 1:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: ADD \n"
														+ "Este metodo añade un elemento al ArrayList, lo añade al final de la lista");
					MetodoAdd();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: REMOVE \n"
														+ "Este metodo borra un elemento del ArrayList");
					MetodoRemove();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: CLEAR \n"
														+ "Este metodo limpia el ArrayList de elementos");
					MetodoClear();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: SIZE \n"
														+ "Este metodo devuelve el número de elementos");
					MetodoSize();
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: GET \n"
														+ "");
					MetodoGet();
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: ITERATOR \n"
														+ "");
					MetodoIterator();
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: IS EMPTY \n"
														+ "");
					MetodoIsEmpty();
					break;
				case 8:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: INDEXOF \n"
														+ "");
					MetodoIndexOf();
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: SET [°_°] \n"
														+ "");
					MetodoSet();
					break;
				case 10:
					JOptionPane.showMessageDialog(null, "Este es el Metodo/Funcion: ADD ALL \n"
														+ "");
					MetodoAddAll();
					break;
			}
		}
	}
	
	// ----------------------- Metodos ---------------------------------------------------
	
	public void dateInit()
	{
		guitarras = new ArrayList<Instrument>();
		
		// nombre , nomodelo , modelo
		// String , float , String
		
		guitarras.add(new Instrument ( "AMERICAN ULTRA STRATOCASTER" , 0118012790.0 , "Stratocaster" ) );
		guitarras.add(new Instrument ( "AMERICAN PERFORMER TELECASTER" , 0115110372.0 , "Telecaster" ) );
		guitarras.add(new Instrument ( "PLAYER JAZZMASTER" , 0146903534.0 , "Jazzmaster" ) );
		guitarras.add(new Instrument ( "KURT COBAIN JAGUAR" , 0143001700.0 , "Jaguar" ) );
		guitarras.add(new Instrument ( "SPECIAL EDITION BLACKTOP JAZZMASTER HH STRIPE" ,  0140205506.0 , "Jazzmaster HH Stripe" ) );
		guitarras.add(new Instrument ( "BEN GIBBARD MUSTANG" , 0141332321.0 , "Mustang" ) );
		guitarras.add(new Instrument ( "CORONADO GUITAR" , 0243000500.0 , "Other" ) );
		guitarras.add(new Instrument ( "DUO-SONIC" , 0144012589.0 , "Duo Sonic" ) );
		guitarras.add(new Instrument ( "PLAYER LEAD III" , 0144313577.0 , "Lead" ) );
		guitarras.add(new Instrument ( "CLASSIC VIBE '70S STRATOCASTER" , 0374020506.0 , "Squier Electric Guitars" ) );
		
		
	}
	
	public void MetodoAdd()
	{
		JOptionPane.showMessageDialog(null, "Con este metodo podras añadir un nuevo elemento \n en la lista, este se agrgara al final de la \n lista ya previamente creada \n"
				+ "Necesitaras los siguientes datos: \n"
				+ "1). Nombre de la Guitarra \n"
				+ "2). Numero de identificacion del producto \n"
				+ "3). Nombre del modelo del Instrumento");
		
		String key0 = JOptionPane.showInputDialog("Escribe el nombre de la Guitarra");
		float key1 = Float.parseFloat(JOptionPane.showInputDialog("Escribe el numero de referecia de la guitarra"));
		String key2 = JOptionPane.showInputDialog("Escribe el modelo de la guitarra");
		
		guitarras.add(new Instrument( key0 , key1 , key2 ) );
		
		mostrarDatos();
	}
	
	public void MetodoRemove()
	{
		JOptionPane.showMessageDialog(null, "Con este metodo podras Eliminar un elemento de la lista \n mira la terminal para ver que elemento quieres eliminar \n");
		
		int pos = Integer.parseInt(JOptionPane.showInputDialog("¿Que Instrumento Musical desea eliminar?"));
		int position = pos - 1;
		guitarras.remove(position);
		JOptionPane.showMessageDialog(null, "Checa nuevamente la terminal");
		mostrarDatos();
	}
	
	public void MetodoClear()
	{
		JOptionPane.showMessageDialog(null, "Con este metodo podras Borrar toda la lista \n para fines de este ejemplo, borrara todos los articulos de la tienda");
		guitarras.clear();
		mostrarDatos();
	}
	
	public void MetodoSize()
	{
		JOptionPane.showMessageDialog(null, "Con este metodo podras Eliminar ver la cantidad  \n de elementos que hay en la lista, para este "
				+ "\n Ejemplo se traducira a la cantidad de guitarras en \n la tienda de musica. \n"
				+ "(Nota: Se debe tener encuenta que el metodo Size, cuenta tambien los espacios en Null de elementos borrados) \n\n"
				+ "La cantidad de Guitarras en la tienda es de : " + guitarras.size());
		
		mostrarDatos();
	}
	public void MetodoGet()
	{
		mostrarDatos();
		JOptionPane.showMessageDialog(null, "Con este metodo podras Buscar un elemento especifico de la lista \n"
				+ " Asegurate de ver el numeor del instrumento del que quieres ver su informacion");
		int key = Integer.parseInt(JOptionPane.showInputDialog("¿Que Instrumento Musical desea eliminar?"));
		JOptionPane.showMessageDialog(null, "El Intrumento buscado es: \n" + guitarras.get(key).getNombre() +"\n" + guitarras.get(key).getNomodelo()+"\n" + guitarras.get(key).getModelo());
		//Necesita trycatch de tamaño de lista
	}
	public void MetodoIterator()
	{
		JOptionPane.showMessageDialog(null, "Con este metodo podemos recorrer de forma mas fiel el ArrayList");
		/*
		Iterator<Instrument> it = guitarras.iterator();
        int num;
        while (it.hasNext()){
            num = it.next();
            System.out.println(num);
          */  
		mostrarDatos();
	}
	public void MetodoIsEmpty()
	{
		JOptionPane.showMessageDialog(null, "Con este metodo podremos saber que posiciones estan en Null o vacias, \n a efectos practicos del ejemplo es saber los articulos que se han vendido ");
		System.out.println(guitarras.isEmpty());
		JOptionPane.showMessageDialog(null, "Las posiciones son: " + guitarras.isEmpty());
		mostrarDatos();
	}
	public void MetodoIndexOf()
	{
		JOptionPane.showMessageDialog(null, "Con este metodo podemos saber la posicion en la lista de las guitarras");
		
		int pos = Integer.parseInt(JOptionPane.showInputDialog("¿Que Instrumento Musical desea ver su posicion en la lista?"));
		int position = pos - 1;
		JOptionPane.showMessageDialog(null, "La posicion es: " + guitarras.indexOf(position));
		
		mostrarDatos();
	}
	public void MetodoSet()
	{
		mostrarDatos();
	}
	public void MetodoAddAll()
	{
		/*
		JOptionPane.showMessageDialog(null, "Con este metodo nos permite añadir toda \n una nueva lista a la que ya estavamos  trabajando, \n para este ejercicio seria como añadir mas inventario a \n los articulos como de un pedido");
		
		Vector<Instruments> newguitarras;
		
		newguitarras = new Vector<Instrument>();
		
		// nombre , nomodelo , modelo
		// String , float , String
		
		newguitarras.add(new Instrument ( "NEW AMERICAN ULTRA STRATOCASTER" , 0118012790.0 , "Stratocaster" ) );
		newguitarras.add(new Instrument ( "NEW AMERICAN PERFORMER TELECASTER" , 0115110372.0 , "Telecaster" ) );
		newguitarras.add(new Instrument ( "NEW PLAYER JAZZMASTER" , 0146903534.0 , "Jazzmaster" ) );
		
		guitarras.addAll(newguitarras);
		
		JOptionPane.showMessageDialog(null, "Checa nuevamente la terminal");
		
		mostrarDatos();
		*/
	}
	
	public void mostrarDatos()
	{
		JOptionPane.showMessageDialog(null, "Puedes ver la lista en la terminal del IDE");
		System.out.println("El tamaño de la lista es: " + guitarras.size() );
		
		for(int i=0 ; i<guitarras.size() ; i++)
		{
			System.out.println("Instrumento: " + guitarras.get(i).toString() );
		}
	}
}

