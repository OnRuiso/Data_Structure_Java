/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triqui;

/**
 *
 * @author yolima
 */
public class Juego {
    private Casilla tablero[][];

    public Juego() {
        
        tablero = new Casilla [3][3];
        
        int numeros = 1;
        
        for(int i = 0;i<3;i++)
            for(int j = 0;j<3;j++)
            {
                this.tablero[i][j] = new Casilla(numeros);
                numeros++;
            } 
    }
    
    
}
