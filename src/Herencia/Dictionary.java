/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author user
 */
public class Dictionary extends Book{
    private int numDefs;

    public Dictionary(int numDefs, int numPages) {
        super(numPages);
        this.numDefs = numDefs;
    }
    
    
    
    public void info(){
        System.out.println("Number of definitions: "+ numDefs);
        System.out.println("Definition per page: " + numDefs/numPages);
    }
    
}
