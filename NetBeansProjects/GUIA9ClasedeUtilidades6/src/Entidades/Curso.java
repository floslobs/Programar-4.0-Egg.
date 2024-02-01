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
/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 
5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes 
métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
*/
public class Curso {
    private String nombreCurso;
    private int horasPorDia;
    private int diasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] nombres = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasPorDia, int diasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.horasPorDia = horasPorDia;
        this.diasPorSemana = diasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasPorDia() {
        return horasPorDia;
    }

    public void setHorasPorDia(int horasPorDia) {
        this.horasPorDia = horasPorDia;
    }

    public int getDiasPorSemana() {
        return diasPorSemana;
    }

    public void setDiasPorSemana(int diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    
    
    
    
}
