/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos 
capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
(la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros 
así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó 
o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade 
a la cafetera la cantidad de café indicada.
*/
public class CafeteraServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public void llenarCafetera(Cafetera cafe, int CantidadMaxima) {
        cafe.setCantidaActual(cafe.getCantidadMaxima());
        
    }
    
 public void servirTaza(Cafetera cafetera, int taza) {
        if (cafetera.getCantidaActual() >= taza) {
            cafetera.setCantidaActual(cafetera.getCantidaActual() - taza);
            System.out.println("La taza se llenó completamente.");
        } else {
            System.out.printf("La taza no se pudo llenar completamente. Quedó con %d ml de café.\n", cafetera.getCantidadActual());
            cafetera.setCantidaActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidaActual(0);
    }

    public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        int nuevaCantidad = cafetera.getCantidaActual() + cantidadCafe;
        if (nuevaCantidad > cafetera.getCantidadMaxima()) {
            cafetera.setCantidaActual(cafetera.getCantidadMaxima());
        } else {
            cafetera.setCantidaActual(nuevaCantidad);
        }
        
    }    
        
}
