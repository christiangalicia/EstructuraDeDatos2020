/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author user
 */
public class Sumar implements Sumable{
    private int resultado;
    
    public void sumar(int a, int b) {
      resultado= a+b;
    }

    
    public int resultado() {
     return resultado;
    }
    
    
}
