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
public class Suma implements Sumable{
   
    private int x;
    @Override
    public void sumar(int a, int b) {
       x= a+b;
    }

    @Override
    public int resultado() {
      return x+x; 
    }
}
