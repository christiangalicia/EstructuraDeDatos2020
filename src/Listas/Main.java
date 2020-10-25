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
        LinkedOrderList<Integer> lista = new LinkedOrderList<>();
        lista.add(4);
        lista.add(7);
        lista.add(10);
        lista.add(2);
        System.out.println(lista);
        System.out.println(lista.removeLast());
        System.out.println(lista.removeFirst());
        System.out.println(lista);
        System.out.println(lista.removeLast());
        System.out.println(lista.removeFirst());
        System.out.println(lista);
    }
    
}
