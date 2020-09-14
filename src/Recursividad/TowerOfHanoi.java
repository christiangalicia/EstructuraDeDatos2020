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
public class TowerOfHanoi {
    private int totalDisks;

    public TowerOfHanoi(int totalDisks) {
        this.totalDisks = totalDisks;
    }
    
    public void solve(){
        moveTower(totalDisks,1,3,2);
    }
    
    private void moveTower(int numDisk,int start, int end, int temp){
        if(numDisk==1){
            moveOneDisk(start,end);
        }else{
          moveTower() 
            moveOneDisk(start, end);
          moveTower()
        }
    }
    private void moveOneDisk(int start, int end){
        System.out.println("move one disk from "+ start + " to "+ end);
    }
    
    
}
