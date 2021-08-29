package Library;

import javax.swing.JOptionPane;

public class Datos 
{
	public static void juegos(String teclado)
	{
		switch(teclado)
		{
			case "a":
				JOptionPane.showMessageDialog(null, "Nombre: MasterChief Collection "+
													"\n Estado: Actualizado" +
													"\n Tiempo de Juego; XXXXh" + 
													"\n Descripcion: El emblemático viaje del Jefe Maestro incluye seis juegos creados para PC y recopilados en una sola experiencia. Ya seas un seguidor de toda la vida o descubras al Spartan 117 por primera vez, la colección Jefe Maestro te resultará la experiencia de juego definitiva de Halo."+
													"\n Numero de DLC´s: 6"+
													"\n Jugado por ultima vez: Ayer");
				break;
				
			case"b":
				JOptionPane.showMessageDialog(null, 
						"Nombre: The Forest "+
						"\n Estado: Instalar" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: As the lone survivor of a passenger jet crash, you find yourself in a mysterious forest battling to stay alive against a society of cannibalistic mutants. Build, explore, survive in this terrifying first person survival horror simulator."+
						"\n Numero de DLC´s: 1"+
						"\n Jugado por ultima vez: 1 week ago");
				break;
				
			case"c":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Quake III Arena"+
						"\n Estado: Instalar" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Bienvenido a la Arena, donde guerreros de élite son transformados en papilla. Abandonando cualquier atisbo de sentido común y cualquier rastro de duda, te adentras en un escenario de horrores y abismos oscuros."+
						"\n Numero de DLC´s: 1"+
						"\n Jugado por ultima vez: A year ago");
				break;
			
			case"d":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Quake Champions"+
						"\n Estado: Actualizado" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Quake® Champions es un shooter frenético de arena, un género que estableciera el Quake original hace 20 años. El juego, que combina la lúgubre mitología de Quake con el innovador multijugador de Quake III Arena, añade un toque moderno: los campeones, que poseen habilidades y atributos..."+
						"\n Numero de DLC´s: 1"+
						"\n Jugado por ultima vez: 1 day");
				break;
			case"e":
				JOptionPane.showMessageDialog(null, 
						"Nombre: For Honor "+
						"\n Estado: Actualizado" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Crea el camino de la destrucción en un campo de batalla intenso y realista en For Honor."+
						"\n Numero de DLC´s: 5"+
						"\n Jugado por ultima vez: 3 days");
				break;
				
			case"f":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Warframe "+
						"\n Estado: Actualizado" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Warframe es un juego de acción en línea cooperativo gratuito ambientado en un mundo de ciencia ficción en evolución. Uníos a vuestros amigos en cruzadas \"jugador contra enemigo\" a través del Sistema Solar y dominad el poder de los warframes. Jugad en solitario o luchad juntos contra los enemigos que ..."+
						"\n Numero de DLC´s: 7"+
						"\n Jugado por ultima vez: 2h"
						+"link: https://store.steampowered.com/app/230410/Warframe/");
				break;
			case"g":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Doom "+
						"\n Estado: Actualizado" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Ahora incluye los tres paquetes de contenido descargable premium (Unto the Evil-Hell Followed-Bloodfall), mapas, modos y armas, así como todas las actualizaciones de funcionalidades, como el modo Arcade, el modo Foto y la actualización 6.66, la más reciente, que trae más mejoras multijugador."+
						"\n Numero de DLC´s: actualizaciones constantes"+
						"\n Jugado por ultima vez: 1 day");
				break;
				
			case"h":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Doom Eternal "+
						"\n Estado: Instalar" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Los ejércitos del infierno han invadido la Tierra. Ponte en la piel del Slayer en una épica campaña para un jugador y cruza dimensiones para detener la destrucción definitiva de la humanidad. No le tienen miedo a nada... salvo a ti."+
						"\n Numero de DLC´s: 1"+
						"\n Jugado por ultima vez: 0h");
				break;
			case"i":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Guears of war Ultimate Edition "+
						"\n Estado: Actualizado" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Gears of War regresa en esta increible remasterización y modernizado para Windows 10 con resolución de hasta 4K y con la frecuencia de actualización desbloqueada. Gears of War: Ultimate Edition para Windows 10 está cargado con contenido, incluyendo 5 capítulos de campaña no incluidos en la versión de la Xbox 360."+
						"\n Numero de DLC´s: 1"+
						"\n Jugado por ultima vez: 6 years ago");
				break;
			case"j":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Guears of war 5 "+
						"\n Estado: Actualizado" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Asalta el bastión enemigo en la Operación 5, disponible ahora. Nuestra actualización más grande hasta la fecha contiene cinco mapas, siete personajes nuevos, un arma nueva y montones de recompensas nuevas."+
						"\n Numero de DLC´s: 1"+
						"\n Jugado por ultima vez: 4 month ago");
				break;
			case"k":
				JOptionPane.showMessageDialog(null, 
						"Nombre: Guears of war 4 "+
						"\n Estado: Actualizado" +
						"\n Tiempo de Juego; XXXXh" + 
						"\n Descripcion: Comienza una nueva saga para una de las franquicias de videojuegos más aclamadas de la historia. Compatible con Xbox Play Anywhere: puedes jugar en Xbox One y PC con Windows 10 sin costo adicional."+
						"\n Numero de DLC´s: 1"+
						"\n Jugado por ultima vez: 2 month ago ");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Esto no es una variable valida");
			
		}
	}
}
