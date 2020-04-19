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
public class PruebaLibroCalificaciones{
    public static void main(String[] args){
        int calificaciones[][] = {  {87, 96, 70},
                                    {68, 87, 90},
                                    {94, 100, 90},
                                    {100, 81, 82},
                                    {83, 65, 85},
                                    {78, 87, 65},
                                    {85, 75, 83},
                                    {91, 94, 100},
                                    {76, 72, 84},
                                    {87, 93, 73}};
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("Arreglos multidimensionales. Java a profundidad", calificaciones);
        System.out.printf("Bienvenido al libro calificacione para %s%n%n", miLibroCalificaciones.getNombreDelCurso());
        ProcesarCalificaciones calificacionesEstudiantes = new ProcesarCalificaciones();
        calificacionesEstudiantes.procesarCalificaciones(calificaciones);
    }
}
