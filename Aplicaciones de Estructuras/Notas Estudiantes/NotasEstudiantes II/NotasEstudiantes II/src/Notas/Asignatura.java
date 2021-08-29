/*
 Facultad : Ingenieria de Sistemas
 Materia: Estructura de Datos
 Estudiante: Luis Felipe Narvaez Gomez
 Codigo: 2312660
 Periodo: 2021-1
 */

package Notas;

public class Asignatura
{
	private String nombre;
	//private int notas[];
	private int notaU1;
	private int notaU2;
	private int notaU3;
	private int notaU4;
	private int notaU5;
	
	public Asignatura() {}
	
	public Asignatura(String nombre, int notaU1, int notaU2, int notaU3, int notaU4, int notaU5)
	{
		this.nombre = nombre;
		//this.notas = new int[5];
		this.notaU1 = notaU1;
		this.notaU2 = notaU2;
		this.notaU3 = notaU3;
		this.notaU4 = notaU4;
		this.notaU5 = notaU5;
	}

	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}

	//public int[] getNotas() {		return notas;	}
	//public void setNotas(int[] notas) {		this.notas = notas;	}

	public int getNotaU1() {	return notaU1;	}
	public void setNotaU1(int notaU1) {		this.notaU1 = notaU1;	}

	public int getNotaU2() {		return notaU2;	}
	public void setNotaU2(int notaU2) {		this.notaU2 = notaU2;	}

	public int getNotaU3() {		return notaU3;	}
	public void setNotaU3(int notaU3) {		this.notaU3 = notaU3;	}

	public int getNotaU4() {		return notaU4;	}
	public void setNotaU4(int notaU4) {		this.notaU4 = notaU4;	}

	public int getNotaU5() {		return notaU5;	}
	public void setNotaU5(int notaU5) {		this.notaU5 = notaU5;	}

	
	

}
