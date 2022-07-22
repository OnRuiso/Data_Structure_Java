package Folder;

import java.util.ArrayList;
import java.util.List;

public class FileBrowser
{
	private List<SO> system;
	private List<UnitC> systemC;
	private List<UnitD> systemD;
	Tree folder = new Tree();
	
	//----------------------------------------------------------------------------Metodos---------------------------------------------------------------------------------------------
	public void initFolders()
	{
		system = new ArrayList<SO>();
		systemC = new ArrayList<UnitC>();
		systemD = new ArrayList<UnitD>();
		
		// public SO(	String nombre, String tipo, double tamaño, double tamañoEnDisco, int contiene, String creado, String atributos )
		// public UnitC ( String ubicacion ,   String nombre, String tipo, double tamaño, double tamañoEnDisco, String contiene, String creado, String atributos)
		// public UnitD ( String ubicacion ,   String nombre, String tipo, double tamaño, double tamañoEnDisco, String contiene, String creado, String atributos)
		// si es menor el indice 100 lo pondre en "C:" si es mayor a 100 lo pondre en "D:"
		// C: izquierda y D: derecha
		system.add(new SO ("Equipo","",715.6,715.6,"N carpetas", "",""));
		folder.insertContenido(0, system.get(0));
		
		systemC.add(new UnitC ("Unidad C","Usuarios","Carpeta de archivos",41.5,41.5,"N carpetas", "sabado 7 de diciembre de 2019 4:03:44","Solo Lectura (solo para archivos de carpeta)") ); 
		folder.insertContenido(1, systemC.get(0));
		
		systemC.add(new UnitC ("Unidad C","ruiso","Carpeta de archivos",41.3,41.3,"N carpetas", "sabado 13 de marzo de 2021 17:29:10","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(2, systemC.get(1));
		
		systemC.add(new UnitC ("Unidad C","Escritorio","Carpeta de archivos",1.45,1.45,"N carpetas", "martes 29 de diciembre de 2020 0:52:02","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(3, systemC.get(2));
		
		systemC.add(new UnitC ("Unidad C","Descargas","Carpeta de archivos",27.0,27.0,"N carpetas", "martes 29 de diciembre de 2020 0:52:02","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(4, systemC.get(3));
		
		systemC.add(new UnitC ("Unidad C","Temporal Desktop","Carpeta de archivos",1.45,1.45,"N carpetas", "viernes 9 de Abril de 2021 10:58:02","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(5, systemC.get(4));
		
		systemD.add(new UnitD ("Unidad D","ruiso","Carpeta de archivos",490,491,"N carpetas", "martes 29 de	 diciembre de 2020 11:03:30","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(100, systemD.get(0));
		
		systemD.add(new UnitD ("Unidad D","ESTUDIOS","Carpeta de archivos",18.1,18.2,"N carpetas", "viernes 29 de enero de 2021 21:12:23","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(101, systemD.get(1));
		
		systemD.add(new UnitD ("Unidad D","Ingenieria de Sistemas","Carpeta de archivos",1.45,1.45,"N carpetas", "viernes 9 de Abril de 2021 10:58:02","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(102, systemD.get(2));
		
		systemD.add(new UnitD ("Unidad D","MATERIAS","Carpeta de archivos",16.3,16.5,"N carpetas", "lunes 1 de Febrero de 2021 7:36:02","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(103, systemD.get(3));
		
		systemD.add(new UnitD ("Unidad D","Estructura de datos","Carpeta de archivos",0.249,0.250,"N carpetas", "lunes 1 de Febreo de 2021 7:37:08","Solo Lectura (solo para archivos de carpeta)") );
		folder.insertContenido(104, systemD.get(4));
		
	}
	//-------------------------------------------------------------------------------------------------
	
	//-------------------------------------------------------------------------------------------------
	public void recorrer()
	{
		folder.recorrerMenorMayor(folder.getRaiz());
	}
	public void recorrerRight()
	{
		folder.recorrerMenorMayor(folder.getRaiz().getRight());
	}
	public void recorrerLeft()
	{
		folder.recorrerMenorMayor(folder.getRaiz().getLeft());
	}
}
