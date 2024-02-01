/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10coleccionesejercicioguia;

import com.sun.corba.se.impl.util.PackagePrefixChecker;
import java.awt.AWTEventMulticaster;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author fan1_
 */
public class GUIA10ColeccionesEjercicioGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LISTAS:
        ArrayList<Integer> numerosA = new ArrayList();// lista de tipo integer
        int x = 20;
        int g = 10;
        int h = 4;
        int d = 5;
        int v = 6;
        numerosA.add(x); // agragamos el numero 20  la lista en la pocicion 0
        numerosA.add(g);
        numerosA.add(h);
        numerosA.add(d);
        numerosA.add(v);
        numerosA.remove(v);
        numerosA.remove(1);
        
        
        
        
        //CONJUNTOS:
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        Integer e = 3;
        Integer f = 2;
        Integer q = 56;
        Integer a = 45;
        numerosB.add(y);
        numerosB.add(e);
        numerosB.add(f);
        numerosB.add(q);
        numerosB.add(a);
        numerosB.remove(a);
        numerosB.remove(e);
        
        
        //MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 36272768;
        String nombreAlumno = "pepe";
        alumnos.put(dni, nombreAlumno);// agregamos la llave y el valor
         dni = 36272764;
        nombreAlumno = "pa";
        alumnos.put(dni, nombreAlumno);
       dni = 36272798;
         nombreAlumno = "pela";
        alumnos.put(dni, nombreAlumno);
         dni = 36272758;
        nombreAlumno = "pepa";
        alumnos.put(dni, nombreAlumno);
         dni = 36272748;
         nombreAlumno = "pancho";
        alumnos.put(dni, nombreAlumno);
         dni = 36272738;
         nombreAlumno = "flor";
        alumnos.put(dni, nombreAlumno);
        alumnos.remove(36272768);
    }
    
}
