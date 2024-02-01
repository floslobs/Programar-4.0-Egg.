/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author fan1_
 */
public class ProductosServicio {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void introducirElemento(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        System.out.println("Ingrese el precio del producto");
        Double precio = leer.nextDouble();
        productos.put(nombre, precio);
    }

    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto que desea cambiar el precio");
        String nombre = leer.next();
        System.out.println("Ingrese el nuevo precio del producto");
        Double precio = leer.nextDouble();
        productos.replace(nombre, precio);
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto que desea cambiar el precio");
        String nombre = leer.next();
        productos.remove(nombre);
    }

    public void mostrarProductosConPrecio(HashMap<String, Double> productos) {
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            System.out.println("Producto: " + producto.getKey() + " precio: " + producto.getValue());
        }
    }
}

