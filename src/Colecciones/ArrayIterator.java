/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author user
 */
public class ArrayIterator<T> implements Iterator<T>{

    private int count; //numero de elemento de la coleccion
    private int current; //posicion actual del iterador
    private T[] items;

    public ArrayIterator(int size, T[] collection) {
        this.count = size;
        current=0;
        this.items = collection;
    }
    
    
    @Override
    public boolean hasNext() {
        return (current<count);
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        current++;
        return items[current-1];
        
    }
    
}
