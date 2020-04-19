/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprofundidad;

import java.lang.reflect.Array;

/**
 *
 * @author D3RL3
 */
public class Arreglos {
     // Declaro el array como una variable miembro de la clase Arreglo.
    int caja[] = new int[3];
    int a[][] = new int[2][2];

    // Defino el constructor de la clase, donde defino el contenido de mi arreglo.
    public Arreglos()
    {
        a[0][0] = 3; 
        a[0][1] = 4; 
        a[1][0] = 3; 
        a[1][1] = 4;
        
    } 

    public void mostrarEnPantalla()
    {
        // Utilizo un ciclo 'for' para iterar sobre los elementos del array.
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++){
                // Imprimimos los elementos del array en pantalla.
            System.out.println(""+a[i][j]);
            }
            
        } 
    }
}
