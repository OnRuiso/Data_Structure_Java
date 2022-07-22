/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 */
package Students;

public class Main {
	
	private Controller est;

	public static void main(String[] args) 
	{
		Main m = new Main();
		m.est = new Controller();
		
		Estudiante nat = new Estudiante();  Estudiante mon = new Estudiante();  Estudiante dar = new Estudiante();  Estudiante lau = new Estudiante();  Estudiante viv = new Estudiante();
		nat.setNombre("Natalia");           mon.setNombre("Monica");            dar.setNombre("Dara");              lau.setNombre("Laura");             viv.setNombre("Viviana");
		nat.setNota(50);                    mon.setNota(40);                    dar.setNota(30);                    lau.setNota(43);                    viv.setNota(47);
		
		
		Estudiante alumnos[] = {nat, mon, dar, lau, viv};
		m.est.setEstudiantesList(alumnos);
		
		m.est.Launch();
		

	}

}
