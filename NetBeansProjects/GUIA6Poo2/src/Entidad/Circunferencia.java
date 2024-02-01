/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author fan1_
 */
/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia (){
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el radio ");
        radio = sc.nextDouble();
        
    } 
    public void area(){
        double area =Math.PI * (Math.pow(radio, 2));
        System.out.println("el area es; "+area);
    }
    public void perimetro(){
        double perimetro = 2*Math.PI*radio;
        System.out.println("el orerimetro es: "+perimetro);
    }
}
