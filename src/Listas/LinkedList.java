/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import EstructurasEnlazadas.LinearNode;
import java.util.EmptyStackException;
import java.util.Iterator;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author user
 */
public class LinkedList<T> implements ListADT<T> {
     protected int count;
    protected LinearNode<T> head;
    protected LinearNode<T> tail;
    //private LinearNode<T> current;
    public LinkedList() {
        count = 0;
        head= tail = null;
    }

    @Override
    public T removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public T remove(T targetElement) throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;
        while (current != null && !found) {
            if (targetElement.equals(current.getElement())) {
                found = true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (!found) {
            throw new EmptyStackException();
        }
        if (size() == 1) {
            head = tail = null;
        } else if (current.equals(head)) {
            head = current.getNext();
        } else if (current.equals(tail)) {
            tail = previous;
            tail.setNext(null);
        } else {
            previous.setNext(current.getNext());
        }

        count--;
        return current.getElement();
    }

    @Override
    public T first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T last() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(T target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<T> itereator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
