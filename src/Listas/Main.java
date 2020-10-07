/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayOrderList<Integer> lista = new ArrayOrderList<>();
        lista.add(4);
        lista.add(7);
        lista.add(10);
        lista.add(2);
        lista.add(5);
        System.out.println(lista);
    }
    
}
