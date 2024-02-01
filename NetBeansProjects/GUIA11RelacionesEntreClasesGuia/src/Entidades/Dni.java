/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author fan1_
 */
public class Dni {
    
    private char serie;
    private int numero;

    // Constructor sin argumentos
    public Dni() {
    }

    // Constructor con argumentos
    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    // Métodos getter y setter
    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

