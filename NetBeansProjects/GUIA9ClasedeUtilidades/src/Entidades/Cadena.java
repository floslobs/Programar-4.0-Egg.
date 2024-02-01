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
/*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos 
una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente.
Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de
la frase de manera automática.*/
public class Cadena {
    
    public String frase;
    public int longitud;    

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length(); // frase setea la longitud de la frase automaticamente
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

    
    
}
