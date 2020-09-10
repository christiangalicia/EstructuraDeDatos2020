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
public class Recursiva {
    
    
    public int sumar(int num){
        int resultado;
        if(num==1){
            resultado=1;
        }else{
            resultado= num+sumar(num-1);
        }
        return resultado;
    }
    public int factorial(int num){
         int resultado;
        if(num==1){
            resultado=1;
        }else{
            resultado= num*factorial(num-1);
        }
        return resultado;
    }
}
