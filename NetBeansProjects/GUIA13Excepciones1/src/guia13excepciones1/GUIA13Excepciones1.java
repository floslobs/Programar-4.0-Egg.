/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13excepciones1;

import Entidad.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA13Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio personaServicio = new PersonaServicio();
        System.out.println("Ingrese cuantas personas desea cargar");
        int N = leer.nextInt();
        Persona[] personas = new Persona[N];
        int[] resultadosIMC = new int[N];
        boolean[] mayoresDeEdad = new boolean[N];

        personas[0] = personaServicio.crearPersona();
        personas[1] = null;

        for (int i = 0; i < N; i++) {
            try {
                mayoresDeEdad[i] = personaServicio.esMayorDeEdad(personas[i]);
                resultadosIMC[i] = personaServicio.calcularIMC(personas[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        int porDebajoPeso = 0;
        int enPesoIdeal = 0;
        int conSobrepeso = 0;
        int cantidadMayoresDeEdad = 0;

        for (int i = 0; i < N; i++) {
            switch (resultadosIMC[i]) {
                case -1:
                    porDebajoPeso++;
                    break;
                case 0:
                    enPesoIdeal++;
                    break;
                default:
                    conSobrepeso++;
                    break;
            }
            if (mayoresDeEdad[i]) {
                cantidadMayoresDeEdad++;
            }
        }

        System.out.println("Porcentaje de personas por debajo del peso ideal: " + (porDebajoPeso / N) * 100);
        System.out.println("Porcentaje de personas en su peso ideal: " + (enPesoIdeal / N) * 100);
        System.out.println("Porcentaje de personas con sobrepeso: " + (conSobrepeso / N) * 100);
        System.out.println("Porcentaje de personas mayores de edad: " + (cantidadMayoresDeEdad / N) * 100);
        System.out.println("Porcentaje de personas menores de edad: " + ((4 - cantidadMayoresDeEdad) / N) * 100);
    }
}
    
