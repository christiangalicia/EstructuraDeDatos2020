/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.Iterator;

/**
 *
 * @author user
 */
public interface SetADT<T> {
    //añane un elmento , ignorando los duplicados
    public void add(T element);
    
    public void addAll(SetADT<T> set);
    
    public T removeRandom();
    
    public T remove(T element);
    
    public SetADT<T> union (SetADT<T> set);
    
    public boolean contains(T target);
    
    public boolean equals(SetADT<T> set);
    
    public boolean isEmpty();
    
    public int size();
    
    public Iterator<T> iterator();
    
    public String toString();
}
