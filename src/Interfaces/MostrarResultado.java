/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interfaces.Sumable;

/**
 *
 * @author user
 */
public class MostrarResultado {
    
    public void imprimir(Sumable objeto,int a, int b){
        objeto.sumar(a, b);
        System.out.println(objeto.resultado());
    }
    
}
