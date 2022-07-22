/*
 Universidad Santo Tomas seccional Tunja
 Facultad de Ingenieria de Sistemas
 Estructura de Datos
 Ing. Luis Felipe Narvaez Gomez
 2312660
 2021- 1
 
 CODIGO MODIFICADO _ EJERCICIO EN CLASE _ 19-04-2021
 */
package Stack_Exercise1;

public class Main
{
	private Controller unu;

	public static void main(String[] args)
	{
		Main m = new Main();
		
		m.unu = new Controller();
		
		m.unu.initPila();
		m.unu.mostrarPila();
		
		m.unu.entrarFicha();
		m.unu.sacarFicha();
	}

}
