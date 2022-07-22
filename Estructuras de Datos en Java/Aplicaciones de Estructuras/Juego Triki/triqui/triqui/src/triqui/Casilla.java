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
public class Casilla {
    
    private boolean estado;
    private char ficha;
    private int numero;

    public Casilla(int num) {
        this.estado = true;//disponible
        this.numero = num;
    }

    public Casilla(boolean estado, char ficha, int numero) {
        this.estado = estado;
        this.ficha = ficha;
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public char getFicha() {
        return ficha;
    }

    public void setFicha(char ficha) {
        this.ficha = ficha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
