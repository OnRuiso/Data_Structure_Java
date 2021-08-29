//TALLER 1. BIBLIOTECA DE STEAM SENCILLA.
//Estudiante: Luis Felipe Narvaez Gomez
//Codigo:2312660
//Clase de Estructura de Datos

package steamII;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		//INFORMACION  ................................................................................................................................................
		String nombres[] = new String[2];
		//String nombres[] = {"Halo","God of War"};
		nombres[0]="Halo: The Master Chief Collection";
		nombres[1]="God of War";
		
		//halo.precio = 4000; //solo cuando el atributo es publico CARAJO
		//halo.setDescripcion("Bicho verde mata aliens"); //cuando esta protegido por "private" se modifica el valor del atributo del objeto mediante SET

		
		//LLamado   ................................................................................................................................................
		
		Juego halo = new Juego(nombres[0],
				"El emblemático viaje del Jefe Maestro incluye seis juegos creados para PC "
				+ "\n y recopilados en una sola experiencia. Ya seas un seguidor de toda la "
				+ "\n vida o descubras al Spartan 117 por primera vez, la colección Jefe Maestro "
				+ "\n te resultará la experiencia de juego definitiva de Halo.", 89900 , 6); //objeto escrito de manera tradicional
		Juego godOfWar = new Juego(nombres[1],
				"la venganza de Kratos contra los dioses del Olimpo ha quedado atrás y "
				+ "\n ahora vive como un hombre en las tierras de los dioses y monstruos nórdicos. "
				+ "\n Será en este mundo hostil y sin piedad donde deberá luchar para sobrevivir... y "
				+ "\n donde deberá enseñar a su hijo a hacer lo mismo. Esta sorprendente recreación de God of War "
				+ "\n deconstruye los elementos centrales que definían la serie (un combate satisfactorio, "
				+ "\n una escala impresionante y una historia atrapante) y los combina de un modo totalmente nuevo.", 72000 , 1);
		
		
		//Arreglo de todos mis juegos
		Juego juegos[] = new Juego[13];
		juegos[0]=halo;
		juegos[1]=godOfWar;
		juegos[2]= new Juego("Warframe",
				"se desarrolla en un futuro post-apocalíptico luego del colapso de la civilización Orokin, "
				+ "\n donde tendremos que construir a lo largo de nuestra aventura varias cosas y subir "
				+ "\n de reputación con varios grupos para ganar recompensas, el jugador desempeña el "
				+ "\n papel de un niño perteneciente a los Tenno, un grupo de niños que fueron mutados "
				+ "\n y adquirieron habilidades especiales al ser expuestos a la energía presente en el "
				+ "\n Vacío, un espacio sub-dimensional usado por los Orokin para transportarse, que "
				+ "\n controla unas armaduras llamados Warframes. Los objetivos del jugador incluyen "
				+ "\n el descubrir los eventos que resultaron en el colapso de los Orokin y el origen "
				+ "\n de los Tenno, coleccionar armamento, herramientas, mascotas y mods.", 0 , 10); //objeto escrito adentro y directamente en mi arreglo
		juegos[3]= new Juego("The Forest" ,
				"El juego es de tipo mundo abierto, donde hay diversas misiones, las cuales no cambian "
				+ "\n la línea principal del juego. El objetivo que tiene el jugador es sobrevivir y "
				+ "\n rescatar a su hijo desaparecido, después de que el avión en el que viajaban "
				+ "\n se estrellara en una isla llena de nativos mutantes y caníbales.", 31000 , 1);
		juegos[4]= new Juego("Doom",
				"Los jugadores toman el papel de un marine espacial sin nombre mientras lucha contra "
				+ "\n las fuerzas demoníacas del infierno que han sido desatadas por la Unión "
				+ "\n Aerospace Corporation en un planeta colonizado en el futuro, Marte. "
				+ "\n La jugabilidad vuelve a un ritmo más rápido con más niveles abiertos, "
				+ "\n más cerca de los primeros dos juegos que el enfoque más lento de terror "
				+ "\n de supervivencia de Doom 3. También cuenta con recorrido de entorno, mejoras "
				+ "\n de personaje y la capacidad de realizar ejecuciones conocidas como "
				+ "\n muertes gloriosas. El juego también es compatible con un componente multijugador "
				+ "\n en línea y un editor de niveles conocido como SnapMap, desarrollado conjuntamente "
				+ "\n con Certain Affinity y Escalation Studios, respectivamente.",49900,3);
		juegos[5]= new Juego("Quake Champions",
				"Quake Champions es un videojuego desarrollado por id Software y publicado por Bethesda "
				+ "\n Softworks. Forma parte de la serie Quake. Quake Champions fue publicado principalmente "
				+ "\n en Microsoft Windows. Quake Champions sería la primera entrada principal en la serie "
				+ "\n Quake serie desde 2005 con Quake 4",0,7);
		juegos[6]= new Juego("Crash Bandicoot", 
				"La serie trata de Crash Bandicoot, un marsupial evolucionado por el científico loco Neo Cortex, "
				+ "\n quien tenía intenciones viles de controlarlo mentalmente para dirigir su ejército de "
				+ "\n animales mutantes. La historia se desarrolla en unas islas ficticias al sur de Australia,"
				+ "\n por lo que su fauna y entorno se apegan a esta región. Inicialmente, la misión de "
				+ "\n Crash Bandicoot era rescatar a su novia Tawna de Neo Cortex, pero luego se transformó "
				+ "\n en impedir los planes del científico una y otra vez."
				+ " \n Originalmente, el personaje fue creado con el propósito de ser la mascota de Sony en su primera "
				+ "\n consola, PlayStation. Sin embargo, esta vinculación nunca se hizo oficial cuando la serie "
				+ "\n comenzó a gozar de un éxito arrollador, a pesar de que la propia Sony estuvo involucrada "
				+ "\n estrechamente con sus tres secuelas." , 146900 , 4);
		juegos[7]= new Juego("Outlast",
				"El protagonista del juego, a diferencia de muchos protagonistas de juegos de temática Horror de supervivencia, "
				+ "\n es incapaz de combatir; en su lugar, el personaje es capaz de desplazarse, escalar u ocultarse en lugares "
				+ "\n de su entorno para así poder eludir a los enemigos. Para desplazarse por el entorno, el personaje es capaz "
				+ "\n de escalar lugares altos, evitar obstáculos, arrastrarse, y deslizarse en espacios estrechos usando el parkour. "
				+ "\n La resistencia del personaje es limitada y se puede recuperar progresivamente de las heridas si permanece un "
				+ "\n determinado tiempo quieto, sin ser atacado. Originalmente los realizadores del juego habían desarrollado a "
				+ "\n una asistente femenina para ayudar a Upshur en diferentes situaciones pero la idea fue desechada ya que los "
				+ "\n realizadores sentían que eso podría disminuir el estrés provocado por la incapacidad del personaje para "
				+ "\n defenderse. Además, el protagonista puede sobrevivir a situaciones de peligro escondiéndose en el interior "
				+ "\n de las taquillas, debajo de las camas o al cerrar las puertas de ciertas habitaciones."
				+ "\n Dado que la mayoría del manicomio es oscuro, se debe usar la cámara para ver en la oscuridad, todo esto "
				+ "\n gracias a la función de la visión nocturna. Sin embargo, el uso excesivo de la visión nocturna consumirá "
				+ "\n la batería. Para ello se necesitará buscar baterías que se encontrarán en diferentes lugares del manicomio "
				+ "\n a fin de lograr pasar por diferentes escenarios."
				+ "\n La mayor parte de los enemigos en el juego son variantes o pacientes del manicomio que presentan mutaciones "
				+ "\n y comportamientos agresivos respecto al resto de internos del asilo; otros, en cambio, se encargan de brindar "
				+ "\n ayuda o consejos a Miles Upshur. Esta cualidad fue agregada para hacer de los personajes más \"realistas\" "
				+ "\n dado que no todos los pacientes de un psiquiátrico son de naturaleza violenta.", 31000 ,4);
		juegos[8]= new Juego("Dead Space",
				"You are Isaac Clarke, an engineer on the spacecraft USG Ishimura. You're not a warrior. You're not a soldier. "
				+ "\n You are, however, the last line of defense for the remaining living crew.",156668 ,4);
		juegos[9]= new Juego("Guitar Hero III",
				"Guitar Hero III: Legends of Rock es un videojuego de música y el tercer título de la serie Guitar Hero",987654321,5);
		
		juegos[10]= new Juego("","",0,0);//quedan utilizando inicialmente el segundo contructor pero CREO cambiaran al primero una vez ingrese por set valores
		juegos[11]= new Juego("","",0,0);
		juegos[12]= new Juego("","",0,0);
		
		
		

		//IMPRESION POR PANTALLA  ................................................................................................................................................
		
		System.out.println(halo.getDescripcion());
		
		boolean estado = true;
		String teclaNombre1 = null;//Inicializada aqui pero modificado su valor mas adelante, la pongo aqui para inicializar con el menu de ingreso.
		String teclaNombre2 = null;
		String teclaNombre3= null;
		
		while(estado)
		{
			String teclado = JOptionPane.showInputDialog(
					"Taller 1. Est.Luis Felipe Narvaez Gomez Cod.2312660"
					+"\n \n Bienvenido a su Biblioteca de STEAM"
							+"\n \n Para ver los detalles de cada uno de los juegos listados introdusca su letra respectiva en el cuadro de Ingreso"
							+"\n \n [a] Halo MasterChief Collection"
							+"\n [b] God Of War"
							+"\n [c] Warframe"
							+"\n [d] The Forest"
							+"\n [e] Doom"
							+"\n [f] Quake"
							+"\n [g] Crash Bandicoot"
							+"\n [h] Outlast"
							+"\n [i] Dead space"
							+"\n [j] Guitar Hero III"
							+"\n [k] "+teclaNombre1+" ..........[SLOT 1]"
							+"\n [l] "+teclaNombre2+" ..........[SLOT 2]"
							+"\n [m] "+teclaNombre3+" ..........[SLOT 3]"
							+"\n \n  Puedes Ingresar la Informacion de 3 Nuevos Juegos si lo deseas"
							+"\n [x] New Game 1   ["+teclaNombre1+"]"
							+"\n [y] New Game 2   ["+teclaNombre2+"]"
							+"\n [z] New Game 3   ["+teclaNombre3+"]"
							+"\n \n Escriba exit para salir de la biblioteca de STEAM"
					); 
			
			
			switch(teclado)
			{
				case "a":
					JOptionPane.showMessageDialog(null, juegos[0].getNombre() + " \n Descripcion: " + juegos[0].getDescripcion() + " \n Precio: " + juegos[0].getPrecio() + " \n DLC´s: " + juegos[0].getDlc());
					break;
				case "b":
					JOptionPane.showMessageDialog(null, juegos[1].getNombre() + " \n Descripcion: " + juegos[1].getDescripcion() + " \n Precio: " + juegos[1].getPrecio() + " \n DLC´s: " + juegos[1].getDlc());
					break;
				case "c":
					JOptionPane.showMessageDialog(null, juegos[2].getNombre() + " \n Descripcion: " + juegos[2].getDescripcion() + " \n Precio: " + juegos[2].getPrecio() + " \n DLC´s: " + juegos[2].getDlc());
					break;
					
				case "d":
					JOptionPane.showMessageDialog(null, juegos[3].getNombre() + " \n Descripcion: " + juegos[3].getDescripcion() + " \n Precio: " + juegos[3].getPrecio() + " \n DLC´s: " + juegos[3].getDlc());
					break;
					
				case "e":
					JOptionPane.showMessageDialog(null, juegos[4].getNombre() + " \n Descripcion: " + juegos[4].getDescripcion() + " \n Precio: " + juegos[4].getPrecio() + " \n DLC´s: " + juegos[4].getDlc());
					break;
					
				case "f":
					JOptionPane.showMessageDialog(null, juegos[5].getNombre() + " \n Descripcion: " + juegos[5].getDescripcion() + " \n Precio: " + juegos[5].getPrecio() + " \n DLC´s: " + juegos[5].getDlc());
					break;
					
				case "g":
					JOptionPane.showMessageDialog(null, juegos[6].getNombre() + " \n Descripcion: " + juegos[6].getDescripcion() + " \n Precio: " + juegos[6].getPrecio() + " \n DLC´s: " + juegos[6].getDlc());
					break;
					
				case "h":
					JOptionPane.showMessageDialog(null, juegos[7].getNombre() + " \n Descripcion: " + juegos[7].getDescripcion() + " \n Precio: " + juegos[7].getPrecio() + " \n DLC´s: " + juegos[7].getDlc());
					break;
					
				case "i":
					JOptionPane.showMessageDialog(null, juegos[8].getNombre() + " \n Descripcion: " + juegos[8].getDescripcion() + " \n Precio: " + juegos[8].getPrecio() + " \n DLC´s: " + juegos[8].getDlc());
					break;
					
				case "j":
					JOptionPane.showMessageDialog(null, juegos[9].getNombre() + " \n Descripcion: " + juegos[9].getDescripcion() + " \n Precio: " + juegos[9].getPrecio() + " \n DLC´s: " + juegos[9].getDlc());
					break;
					
					//Mis casos especiales de juegos ingresados por usuario
					
				case "k":
					JOptionPane.showMessageDialog(null, juegos[10].getNombre() + " \n Descripcion: " + juegos[10].getDescripcion() + " \n Precio: " + juegos[10].getPrecio() + " \n DLC´s: " + juegos[10].getDlc());
					break;
					
				case "l":
					JOptionPane.showMessageDialog(null, juegos[11].getNombre() + " \n Descripcion: " + juegos[11].getDescripcion() + " \n Precio: " + juegos[11].getPrecio() + " \n DLC´s: " + juegos[11].getDlc());
					break;
					
				case "m":
					JOptionPane.showMessageDialog(null, juegos[12].getNombre() + " \n Descripcion: " + juegos[12].getDescripcion() + " \n Precio: " + juegos[12].getPrecio() + " \n DLC´s: " + juegos[12].getDlc());
					break;
					
				case "x":
					JOptionPane.showMessageDialog(null, "Acontinuacion Ingresara o Modificara la informacion del Primer Slot. \n Ingrese adecuadamente los Datos del Juego");
					
					String teclaNombre11 = JOptionPane.showInputDialog("Ingrese el Nombre del Juego");
					juegos[10].setNombre(teclaNombre11);
					teclaNombre1 = teclaNombre11;
					
					String teclaDescripcion1 = JOptionPane.showInputDialog("Ingrese la descripcion del Juego");
					juegos[10].setDescripcion(teclaDescripcion1);
					
					double teclaPrecio1 = Double.parseDouble(   JOptionPane.showInputDialog("Ingrese el valor comercial del Juego")   );
					juegos[10].setPrecio(teclaPrecio1);
					
					int teclaDLC1 = Integer.parseInt( JOptionPane.showInputDialog("Ingresa el numero de DLC")  );
					juegos[10].setDlc(teclaDLC1);

					break;
					
				case "y":
					JOptionPane.showMessageDialog(null, "Acontinuacion Ingresara o Modificara la informacion del Segundo Slot. \n Ingrese adecuadamente los Datos del Juego");
					
					String teclaNombre22 = JOptionPane.showInputDialog("Ingrese el Nombre del Juego");
					juegos[11].setNombre(teclaNombre22);
					teclaNombre2 = teclaNombre22;
					
					String teclaDescripcion2 = JOptionPane.showInputDialog("Ingrese la descripcion del Juego");
					juegos[11].setDescripcion(teclaDescripcion2);
					
					double teclaPrecio2 = Double.parseDouble(   JOptionPane.showInputDialog("Ingrese el valor comercial del Juego")   );
					juegos[11].setPrecio(teclaPrecio2);
					
					int teclaDLC2 = Integer.parseInt( JOptionPane.showInputDialog("Ingresa el numero de DLC")  );
					juegos[11].setDlc(teclaDLC2);
					
					break;
					
				case "z":
					JOptionPane.showMessageDialog(null, "Acontinuacion Ingresara o Modificara la informacion del Tercer Slot. \n Ingrese adecuadamente los Datos del Juego");
					
					String teclaNombre33 = JOptionPane.showInputDialog("Ingrese el Nombre del Juego");
					juegos[12].setNombre(teclaNombre33);
					teclaNombre3 = teclaNombre33;
					
					String teclaDescripcion3 = JOptionPane.showInputDialog("Ingrese la descripcion del Juego");
					juegos[12].setDescripcion(teclaDescripcion3);
					
					double teclaPrecio3 = Double.parseDouble(   JOptionPane.showInputDialog("Ingrese el valor comercial del Juego")   );
					juegos[12].setPrecio(teclaPrecio3);
					
					int teclaDLC3 = Integer.parseInt( JOptionPane.showInputDialog("Ingresa el numero de DLC")  );
					juegos[12].setDlc(teclaDLC3);

					break;
				
				case "exit":
					estado= false;
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "No valido");
					break;	
			}

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
