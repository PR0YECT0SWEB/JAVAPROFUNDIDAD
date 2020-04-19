/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroCalificaciones;

/**
 *
 * @author D3RL3
 */
public class LibroCalificaciones {
    public String nombreDelCurso;
    public int calificaciones[][];

    public LibroCalificaciones() {
    }

    public LibroCalificaciones(String nombreDelCurso, int[][] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[][] calificaciones) {
        this.calificaciones = calificaciones;
    }   
    
}
