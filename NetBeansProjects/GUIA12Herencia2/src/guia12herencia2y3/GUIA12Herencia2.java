/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12herencia2y3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.LavadoraService;
import Servicios.TelevisorService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
public class GUIA12Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        for (int i = 0; i < 4; i++) {
            System.out.println("1- Crear lavadora");
            System.out.println("2- Crear televisor");
            switch (leer.nextInt()) {
                case 1:
                    electrodomesticos.add(ls.crearLavadora());
                    break;
                case 2:
                    electrodomesticos.add(ts.crearTelevisor());
                    break;
            }
        }
        double precioFinalTele = 0;
        double precioFinalLavadora = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electrodomestico;
                double precioLavadora = ls.precioFinal(lavadora);
                precioFinalLavadora += precioLavadora;
                System.out.println("El precio de la lavadora es de: " + precioLavadora);
            } else if (electrodomestico instanceof Televisor) {
                Televisor televisor = (Televisor) electrodomestico;
                double precioTele = ts.precioFinal(televisor);
                precioFinalTele += precioTele;
                System.out.println("El precio del tele es de: " + precioTele);
            }
        }

        System.out.println("El monto final por los televisores es de " + precioFinalTele);
        System.out.println("El monto final por las lavadoras es de " + precioFinalLavadora);
    }

}