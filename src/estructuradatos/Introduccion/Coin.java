/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos.Introduccion;

/**
 *
 * @author user
 */
public class Coin {
    private final int HEADS=0;
    private final int TAILS=1;
    private int face;
    
    public Coin(){
        flip();
    }
    
    public void flip(){

        this.face= (int) (Math.random()*2);
    }
    
    public boolean isHeads(){
        return (face==HEADS);
    }
    
    public String toString(){
        String faceName;
        if(face==HEADS){
            faceName="Heads";
        }else{
            faceName= "Tails";
        }
        return  faceName;
    }
    
}
