/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
/*En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje


Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, 
si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y 
la función devuelve un 1.
*/
public class PersonaServicio {
  
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = sc.nextInt();

        System.out.println("Ingrese el sexo (H - hombre, M - mujer, O - otro):");
        char sexo = sc.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo inválido, ingrese nuevamente (H - hombre, M - mujer, O - otro):");
            sexo = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("Ingrese el peso (en kg):");
        double peso = sc.nextDouble();

        System.out.println("Ingrese la altura (en metros):");
        double altura = sc.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
        
    
}
