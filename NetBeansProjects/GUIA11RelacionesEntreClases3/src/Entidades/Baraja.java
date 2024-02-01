/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author fan1_
 */
public class Baraja {
    
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;

    public Baraja() {
        System.out.println("Se creó una baraja");
        this.mazo = new ArrayList();
        this.monton = new ArrayList();
    }

    public Baraja(ArrayList<Carta> mazo) {
        System.out.println("Se creó una baraja");
        this.mazo = mazo;
        this.monton = new ArrayList();
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }


}
