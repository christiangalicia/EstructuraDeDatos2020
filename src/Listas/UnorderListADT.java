/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author user
 */
public interface UnorderListADT<T> extends ListADT<T>{
    public void addToFront(T element);
    
    public void addtoRear(T element);
    
    public void addAfter(T element, T target);
}
