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
public class BingoBall {
    
    private char letter;
    private int number;

    public BingoBall( int number) {
        this.number = number;
        if(number<=15){
            letter='B';
        }else if( number<=30){
            letter='I';
        }else if(number<=45){
            letter='N';
        }else if (number<=60){
            letter='G';
        }else{
            letter='O';
        }
    }
    
    public String toString(){
        return letter+ " "+ number;
    }
    
}
