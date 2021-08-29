/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoSteam2.view;

import InfoSteam2.infosteam.Juego;
import InfoSteam2.infosteam.Steam;
import java.util.Scanner;

/**
 *
 * @author yolima
 */
public class InfoSteam {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
/*        Juego juego1D = new Juego("esto es doom","Doom",50000);
        
        String nombrejuego = juego1D.getNombre();
        System.out.println("Nombre: "+nombrejuego);
        System.out.println("Descrioción: "+juego1D.getDescripcion());
        System.out.println("Precio: "+juego1D.getPrecio());
        
        
        juego1D.setPrecio(60000);
        
        System.out.println("Precio: "+juego1D.getPrecio());
*/

        Steam plataforma = new Steam();
        plataforma.iniciarJuegos();
        
        //1. ver juegos
        //System.out.println(plataforma.mostrarVectorCompleto());
        
        
        /*
        for(int i = 0; i < plataforma.getJuegosSteam().length ; i++)
        {
            Juego juegoTemp  = plataforma.getJuegosSteam()[i];
            System.out.println("Nombre: "+juegoTemp.getNombre()+" Descrioción: "+juegoTemp.getDescripcion()
            +" Precio: "+juegoTemp.getPrecio());
        }*/
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Por favor digite los datos del juego");
        
        System.out.println("Nombre: ");
        String nombredigitado = s.next();
        
        System.out.println("Descripción: ");
        String descrpdg = s.next();
        
        System.out.println("Precio: ");
        double preciodig = s.nextDouble();
        
        plataforma.agregarJuego(nombredigitado, descrpdg, preciodig);
        
        for(Juego juegoTemp : plataforma.getJuegosSteam())
        {
            System.out.println("Nombre: "+juegoTemp.getNombre()+" Descrioción: "+juegoTemp.getDescripcion()
            +" Precio: "+juegoTemp.getPrecio());
        }
    }
    
}
