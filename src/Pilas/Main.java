/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedStack<Integer> pila = new LinkedStack<>();
        pila.push(5);
        pila.push(2);
        pila.push(8);
        System.out.println(pila);
        System.out.println(pila.pop());
        System.out.println(pila.peek());
        System.out.println(pila.pop());
        System.out.println(pila);
        
        
        Maze lab = new Maze();
        System.out.println(lab);
        if(lab.traverse()){
            System.out.println("Resuelto");
        }else{
            System.out.println("No Resuelto");
        }
        System.out.println(lab);
        
    }
    
}
