/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroCalificaciones;

import com.sun.javafx.geom.AreaOp;

/**
 *
 * @author D3RL3
 */
public class ProcesarCalificaciones {
    public void procesarCalificaciones(int calificaciones[][]){
        
        imprimirCalificaciones(calificaciones);
        
        System.out.printf("%n%s %d%n%s %d",
                "La calificacion mas baja en el libro es:",
                obtenerMinima(calificaciones),
                "La calificacion mas alta en el libro es:",
                obtenerMaxima(calificaciones));
        System.out.println("");
        
        imprimirGraficoBarras(calificaciones);
        
    }
    
    public int obtenerMinima(int calificaciones[][]){
        int caliBaja = calificaciones[0][0];
        for(int calificaionFila[] : calificaciones){
            for(int calificaionColumna : calificaionFila){
                if(calificaionColumna < caliBaja){
                    caliBaja = calificaionColumna;            
                }
            }
        }
        return caliBaja;
    }
        
    
    public int obtenerMaxima(int calificaciones[][]){
        int caliAlta = calificaciones[0][0];
        for(int calificaionFila[] : calificaciones){
            for(int calificaionColumna : calificaionFila){
                if(calificaionColumna > caliAlta){
                    caliAlta = calificaionColumna;
                }
            }
        }
        return caliAlta;
    }
    
            
    public void imprimirCalificaciones(int calificaciones[][]){
        System.out.printf("Las calificaciones son: %n%n");//%n%n dos saltos de linea formateado
        System.out.print("                  ");
        
        
        for(int nota = 0; nota < calificaciones[0].length; nota++){
            System.out.printf(" Nota%2d",nota + 1);
        }
        System.out.println("Promedio");
        
        for(int estudiante = 0; estudiante < calificaciones.length; estudiante++){
            System.out.printf("Estudiante %2d", estudiante + 1);
            for (int nota : calificaciones[estudiante]) {
                System.out.printf("%8d", nota);
            }
            
            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f%n", promedio);            
        }
    }
    
    public double obtenerPromedio(int promedio[]){
        int total = 0;
        
        for(int promedioRetorno : promedio){
            total += promedioRetorno;
        }
        return (double)total/promedio.length;
            
    }
    
    public void imprimirGraficoBarras(int calificaciones[][]){
        System.out.println("Distribucion de calificaciones en general: ");
        
        int frecuencia[] = new int[11];
        
   
        
        for(int caliEstudiantes[] : calificaciones){
            for(int calificacion : caliEstudiantes){
                ++frecuencia[calificacion / 10];
            }
            
        }
        
        for(int cuenta = 0; cuenta < frecuencia.length; cuenta++){
            if(cuenta == 10){
                System.out.printf("%5d:", 100);
            }else{
                System.out.printf("%02d-%02d: ",
                        cuenta * 10, cuenta * 10 + 9);

            }
            for(int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++){
                System.out.print("*");
            }
            System.out.println("");

        }
        
    }    
}
