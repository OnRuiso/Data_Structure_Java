/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoSteam1;

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
        Juego juego1D = new Juego("esto es doom","Doom",50000);
        
        String nombrejuego = juego1D.getNombre();
        
        
        System.out.println("Nombre: "+nombrejuego);
        System.out.println("Descrioción: "+juego1D.getDescripcion());
        System.out.println("Precio: "+juego1D.getPrecio());
        
        
        juego1D.setPrecio(60000);
        
        System.out.println("Precio: "+juego1D.getPrecio());
    }
    
}
