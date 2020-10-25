/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author user
 */
public class ArrayList<T> implements ListADT<T> {

    protected final int NOT_FOUND = -1;
    protected int rear;
    protected T[] list;
    private final int DEFAULT_CAPACITY=50;
    
     public ArrayList(){
        rear=0;
        list= (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    @Override
    public T removeFirst() {
        return remove(list[0]);
            }

    @Override
    public T removeLast() {
        return remove(list[rear-1]);
    }

    @Override
    public T remove(T element) {
        T result;
        int index = find(element);
        if (index == NOT_FOUND) {
            throw new NoSuchElementException("list");
        }
        result = list[index];
        rear--;
        //deplazar los elemento
        for (int scan = index; scan < rear; scan++) {
            list[scan] = list[scan + 1];
        }
        list[rear] = null;
        return result;

    }

    private int find(T element) {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;
        if (!isEmpty()) {
            while (!found && scan < rear) {
                if (element.equals(list[scan])) {
                    found = true;
                } else {
                    scan++;
                }
            }

        }
        if (found) {
            result = scan;
        }
        return result;
    }

    @Override
    public T first() {
        return list[0];
    }

    @Override
    public T last() {
        return list[rear-1];
    }

    @Override
    public boolean contains(T target) {
        int scan = 0, result = NOT_FOUND;
        boolean found = false;
        if (!isEmpty()) {
            while (!found && scan < rear) {
                if (target.equals(list[scan])) {
                    found = true;
                } else {
                    scan++;
                }
            }

        }
        return found;
       
    }

    @Override
    public boolean isEmpty() {
            return size()==0;
    }

    
    public int size() {
        return rear;
   
    }

    @Override
    public Iterator<T> itereator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        String lista ="";
        for (int i = 0; i < rear; i++) {
            lista= lista + list[i]+"|";
        }
        return lista;
    }

}
