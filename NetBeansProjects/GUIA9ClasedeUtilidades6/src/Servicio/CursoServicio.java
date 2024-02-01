/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fan1_
 */
/*Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten
a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con 
un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después
se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al 
método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por 
curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad 
de alumnos y la cantidad de días a la semana que se repite el encuentro.

*/
public class CursoServicio {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("Ingresa el nombre del curso");
        curso.setNombreCurso(sc.next());
        System.out.println("Ingres la cantidad de horas por día de cursado");
        curso.setHorasPorDia(sc.nextInt());
        System.out.println("Ingresa la cantidad de días que se va a dictar el cursado");
        curso.setDiasPorSemana(sc.nextInt());
        System.out.println("Ingrese si es turno mañana o tarde");
        curso.setTurno(sc.next());
        System.out.println("Ingresa el valor de la hora del cursado");
        curso.setPrecioPorHora(sc.nextInt());
        
        curso.setNombres(cargarAlumnos(curso.getNombres().length));
        return curso;
    }

    private String[] cargarAlumnos(int longitudVector) {
        String[] alumnos = new String[longitudVector];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = sc.next();
        }
        return alumnos;
    }

    public void mostrarAlumnos(Curso curso) {
        System.out.println(Arrays.toString(curso.getNombres()));
    }

    public void calcularGananciaSemanal(Curso curso) {
        System.out.println("La ganancia semanal es de " + (curso.getDiasPorSemana()* curso.getHorasPorDia()* curso.getPrecioPorHora() * curso.getNombres().length));
    }
    
}
