/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursiva r = new Recursiva();
        
        System.out.println(r.factorial(5));
        
        Maze m = new Maze();
        
       
        if(m.traverse(0, 0)){
            System.out.println("Terminado");
        }else{
            System.out.println("no es posible terminar");
        }
        System.out.println(m);
        
        
        //----- Solve Tower
        
        TowerOfHanoi towers = new TowerOfHanoi(4);
        towers.solve();
    }
    
}
