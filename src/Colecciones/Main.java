/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUM_BALLS = 75, NUM_PULLS=10;
        
        
        ArraySet<BingoBall> bingo= new ArraySet<>();
        BingoBall ball;
        for (int num = 1; num <=NUM_BALLS; num++) {
            ball = new BingoBall(num);
            bingo.add(ball);
        }
        System.out.println("Size: " + bingo.size());
        System.out.println();
        for (int num = 1; num <=NUM_BALLS+1; num++) {
            ball = bingo.removeRandom();
            System.out.println(ball);
        }
        
                
    }
    
}
