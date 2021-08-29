/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoSteam2.infosteam;

import java.util.Arrays;

/**
 *
 * @author yolima
 */
public class Steam {
    
    public static final int tamanioV = 10;
    private Juego juegosSteam[];
    
    private int numJuegosll;//controlar cuantos juegos se han llenado hasta el momento
    
    //private String nombres[];

    public Steam() {
        numJuegosll = 0;
        juegosSteam = new Juego[tamanioV];
        for(int i = 0;i<tamanioV;i++)
            this.juegosSteam[i] = new Juego(); 
    }

    public Steam(Juego[] juegosSteam) {
        this.juegosSteam = juegosSteam;
    }

    public Juego[] getJuegosSteam() {
        return juegosSteam;
    }

    public void setJuegosSteam(Juego[] juegosSteam) {
        this.juegosSteam = juegosSteam;
    }

    public int getNumJuegosll() {
        return numJuegosll;
    }

    public void setNumJuegosll(int numJuegosll) {
        this.numJuegosll = numJuegosll;
    }
    
    
    
    public void iniciarJuegos(){
        
        Juego juego1 = new Juego("esto es doom","Doom",50000);        
        this.juegosSteam[0] = juego1;
        numJuegosll++;
        
        this.juegosSteam[1] = new Juego("Juego multijugador, es chevere","Fortnite",0);
        numJuegosll++;
        
        this.juegosSteam[2] = new Juego();
        this.juegosSteam[2].setNombre("Oulast");
        this.juegosSteam[2].setDescripcion("Juego de terror");
        this.juegosSteam[2].setPrecio(40000);
        numJuegosll++;
    }
    
    public String mostrarVectorCompleto()
    {
        return Arrays.toString(juegosSteam);
    }

    public void agregarJuego(String nombredigitado, String descrpdg, double preciodig) {
       this.juegosSteam[numJuegosll] = new Juego(descrpdg,nombredigitado,preciodig); 
       numJuegosll++;
    }
}
