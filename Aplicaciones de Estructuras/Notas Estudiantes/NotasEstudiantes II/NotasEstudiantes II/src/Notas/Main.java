/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 */

package Notas;

public class Main
{
	private Planilla est;//variable puente entre clase Main y clase Estudiante
	private Asignatura mat;//variable puente entre clase Main y clase Asignatura

	public static void main(String[] args)
	{
		Main m = new Main(); //variable puente entre clase Main y su subclase principal  main
		m.est = new Planilla(); // llave que nos permitira usar las variables o metodos de clase Estudiante
		m.mat = new Asignatura(); // llave que nos permitira usar las variables o metodos de clase Asignatura

		//##%%<!--  INICIALIZAR DATOS -------------------------------------------------------------------------------------------------------------
		
		//[1] Estudiante                            //[2] Estudiante                        //[3] Estudiante                         //[4] Estudiante
		Estudiante katherine = new Estudiante();    Estudiante paula = new Estudiante();    Estudiante maria = new Estudiante();     Estudiante maoly = new Estudiante();
		katherine.setNombre("Katherine");           paula.setNombre("Paula");               maria.setNombre("Maria Jose");           maoly.setNombre("Maoly");
		katherine.setId(1);                         paula.setId(2);                         maria.setId(3);                          maoly.setId(4);
		Asignatura katheNota = new Asignatura();    Asignatura pauN = new Asignatura();     Asignatura majoN = new Asignatura();     Asignatura maoN = new Asignatura();
		katheNota.setNotaU1(50); 					pauN.setNotaU1(50);                     majoN.setNotaU1(50);                     maoN.setNotaU1(50);
		katheNota.setNotaU2(49); 					pauN.setNotaU2(49);                     majoN.setNotaU2(49);                     maoN.setNotaU2(47);
		katheNota.setNotaU3(48); 					pauN.setNotaU3(48);                     majoN.setNotaU3(48);                     maoN.setNotaU3(48);
		katheNota.setNotaU4(47); 					pauN.setNotaU4(47);                     majoN.setNotaU4(47);                     maoN.setNotaU4(46);
		katheNota.setNotaU5(46); 					pauN.setNotaU5(46);                     majoN.setNotaU5(46);                     maoN.setNotaU5(49);
		
		//[5] Estudiante                            //[6] Estudiante                        //[7] Estudiante                         //[8] Estudiante
		Estudiante angelica = new Estudiante();     Estudiante fernanda = new Estudiante(); Estudiante manu = new Estudiante();      Estudiante sofia = new Estudiante();
		angelica.setNombre("Angelica");             fernanda.setNombre("Maria Fernanda");   manu.setNombre("Manuela");               sofia.setNombre("Sofia");
		angelica.setId(5);                          fernanda.setId(6);                      manu.setId(7);                           sofia.setId(8);
		Asignatura angeN = new Asignatura();        Asignatura ferN = new Asignatura();     Asignatura manuN = new Asignatura();     Asignatura sofiN = new Asignatura();
		angeN.setNotaU1(50);                        ferN.setNotaU1(49);                     manuN.setNotaU1(48);                     sofiN.setNotaU1(47);
		angeN.setNotaU2(49);                        ferN.setNotaU2(50);                     manuN.setNotaU2(49);                     sofiN.setNotaU2(44);
		angeN.setNotaU3(46);                        ferN.setNotaU3(48);                     manuN.setNotaU3(45);                     sofiN.setNotaU3(48);
		angeN.setNotaU4(47);                        ferN.setNotaU4(46);                     manuN.setNotaU4(47);                     sofiN.setNotaU4(50);
		angeN.setNotaU5(48);                        ferN.setNotaU5(47);                     manuN.setNotaU5(44);                     sofiN.setNotaU5(49);
		
		//[9] Estudiante                            //[10] Estudiante
		Estudiante est9 = new Estudiante();         Estudiante est10 = new Estudiante();
		est9.setNombre("Michelle");                        est10.setNombre("Angie");         
		est9.setId(9);                              est10.setId(10);
		Asignatura est9M = new Asignatura();        Asignatura est10M = new Asignatura();
		est9M.setNotaU1(40);                         est10M.setNotaU1(30);
		est9M.setNotaU2(45);                         est10M.setNotaU2(40);
		est9M.setNotaU3(47);                         est10M.setNotaU3(50);
		est9M.setNotaU4(48);                         est10M.setNotaU4(40);
		est9M.setNotaU5(50);                         est10M.setNotaU5(20);
		
		Estudiante alumnos[] = { katherine,paula,maria,maoly,angelica,fernanda,manu,sofia,est9,est10 };
		m.est.setTotalEstudiantes(alumnos);
		Asignatura materiasCursadas[] = { katheNota,pauN,majoN,maoN,angeN,ferN,manuN,sofiN, est9M, est10M };
		m.est.setTotalCalificaciones(materiasCursadas);
		
		m.est.launch();
		
	}

}
