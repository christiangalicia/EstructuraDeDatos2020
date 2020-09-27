/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasEnlazadas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author user
 */
public class LinkedIterator<T> implements  Iterator<T> {
     private int count;
    private LinearNode<T> current;

    public LinkedIterator(int count, LinearNode<T> current) {
        this.count = count;
        this.current = current;
    }
   

    @Override
    public boolean hasNext() {
        return (current != null);
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T result = current.getElement();
        current = current.getNext();
        return result;
    }

}
