package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> edades = new ArrayList<Integer>();
        edades.add(18);
        edades.add(20);
        edades.add(22);
        edades.add(20);
        edades.add(23);
        edades.add(22);

        System.out.println("Tamaño de la lista: "+ edades.size());
        for(int i = 0; i < edades.size(); i++)
        {
            System.out.println("Edad: "+ edades.get(i));
        }

        edades = agregarSinPosicion(edades);
        edades = agregarConPosicion(edades);

        mostrar(edades);
        editar(edades);
        mostrar(edades);
    }

    public static List<Integer> agregarSinPosicion(List<Integer> e)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita las siguientes 5 edades");

        for(int i = 0; i < 5; i++)
            e.add(scan.nextInt());

        System.out.println("Tamaño de la lista: "+ e.size());

        return e;
    }

    public static List<Integer> agregarConPosicion(List<Integer> e)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita las siguientes 5 edades");

        int pos = 11;
        for(int i = 0; i < 5; i++)
        {
            e.add(pos,scan.nextInt());
            pos++;
        }

        System.out.println("Tamaño de la lista: "+ e.size());

        return e;
    }

    public static void mostrar(List<Integer> edades)
    {
        for (Integer edad:edades)
        {
            System.out.println("Edad: "+ edad);
        }
    }

    public static void editar(List<Integer> edades)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qué edad deseas cambiar:");

        int i = 0;
        for (Integer edad:edades)
        {
            System.out.println("Edad "+i+": "+ edad);
            i++;
        }

        int posc = scan.nextInt();

        System.out.println("Digita la nueva edad:");
        edades.set(posc, scan.nextInt());

        //mostrar(edades);
    }
}
