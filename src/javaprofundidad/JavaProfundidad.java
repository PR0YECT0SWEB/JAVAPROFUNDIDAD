/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprofundidad;

/**
 *
 * @author D3RL3
 */
public class JavaProfundidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
//        Arreglos arr = new Arreglos();
//        arr.mostrarEnPantalla();
// Utilizo un ciclo 'for' para iterar sobre los elementos del array.

        int a[][] = {{5,2,6},{8,9,7}};

        for(int i = 0; i < a.length; i++)
        {
            int x = a[i].length;
           
            for(int j = 0; j < x; j++){
                // Imprimimos los elementos del array en pantalla.
            System.out.print("\t"+a[i][j]);
            }
            System.out.print("\n");
           
        } 
    }
    
}
