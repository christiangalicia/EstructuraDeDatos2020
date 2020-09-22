/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaYOrdenamiento;

import Recursividad.Maze;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[10];        
        int arreglo2[] = new int[10];       
        int[][] arreglo3 = new int[10][10];
        
        int[][] grid={
                        {1,0,0,0,1,0,0,0},
                        {1,0,0,0,1,0,0,0},
                        {1,1,1,1,1,0,0,0},
                        {1,0,0,0,1,1,1,0},
                        {1,0,0,0,0,1,1,1}
                         };
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println("\n");
        }
        
       //---------------------------------------
       Integer[] numeros ={2,5,8,6,4,3,0,9};
       SortingAndSearch<Integer> busqueda = new SortingAndSearch<>();
       System.out.println(busqueda.linearSearch(numeros, 0, 7, 13));
        
       String[] nombres ={"juan","maria","paco","luis"};
        SortingAndSearch<String> bNombre = new SortingAndSearch<>();
        System.out.println(bNombre.linearSearch(nombres, 0, 3, "paco"));
        
        
        // busqueda binaria  Regla : el arreglo debe estar ordenado
        Integer[] numeros2 ={2,5,8,16,24,31,40,49,65,78,122};
        System.out.println(busqueda.binarySearch(numeros2, 0, numeros2.length-1, 22));
        
        //ordenamiento por seleccion
       /* busqueda.selectionSort(numeros);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/
        
        //ordenamiento por insercion
        /*busqueda.insertionSort(numeros);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/
        
         //ordenamiento por burbuja
        //busqueda.bubbleSort(numeros);
        
        
        //ordenamiento rapido
       //busqueda.quickSort(numeros, 0, 7);
       
       //ordenaminto por mezcla
       busqueda.mergeSort(numeros, 0, 7);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        ArrayList<Integer> a = new ArrayList<>();
        
        
        
    }
    
}
