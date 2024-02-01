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
/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
número de páginas.
*/
public class Libro {
    
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroPag;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPag = NumeroPag;
    }
    
    public void cargar (){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese ISBN");
        ISBN = sc.nextInt();
        System.out.println("ingrese Titulo");
        Titulo = sc.next();
        System.out.println("ingrese Autor");
        Autor = sc.next();
        System.out.println("ingrese Numero Pagina");
        NumeroPag = sc.nextInt();

      }
    public  void mostrar() {
        System.out.println("el ISBN es: "+ISBN);
        System.out.println("el titulo es:"+Titulo);
        System.out.println("el autor es: "+Autor);
        System.out.println("el numero de pagina es : "+NumeroPag);
    }
            

    
}
