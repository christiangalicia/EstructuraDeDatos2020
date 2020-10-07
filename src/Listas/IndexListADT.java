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
public interface IndexListADT<T> extends ListADT<T>{
    public void add(int index, T element);
    
    public void set(int index, T element);
    
    public void add(T element);
    
    public T get(int index);
    
    public int indexOf(T element);
    
    public T remove(int index);
}
