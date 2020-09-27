/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasEnlazadas;

import Colecciones.SetADT;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 *
 * @author user
 */
public class LinkedSet<T> implements SetADT<T>{
    private static Random rand = new Random();
    private int count;
    private LinearNode<T> contents;

    public LinkedSet() {
        count = 0;
        contents = null;
    }

    @Override
    public void add(T element) {
        if (!contains(element)) {
            LinearNode<T> node = new LinearNode<>(element);
            node.setNext(contents);
            contents = node;
            count++;
        }
    }

    @Override
    public void addAll(SetADT<T> set) {
        Iterator<T> scan = set.iterator();

        while (scan.hasNext()) {
            add(scan.next());
        }
    }

    @Override
    public T removeRandom() {
        LinearNode<T> previous, current;
        T result;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int choice = rand.nextInt(count) + 1;
        if (choice == 1) {
            result = contents.getElement();
            contents = contents.getNext();
        } else {
            previous = contents;
            for (int skip = 2; skip < choice; skip++) {
                previous = previous.getNext();
            }
            current = previous.getNext();
            result = current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }

    @Override
    public T remove(T elemento) {
        boolean found = false;
        LinearNode<T> previous, current;
        T result = null;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (contents.getElement().equals(elemento)) {
            result = contents.getElement();
            contents = contents.getNext();
        } else {
            previous = contents;
            current = contents.getNext();
            for (int look = 1; look < count && !found; look++) {
                if (current.getElement().equals(elemento)) {
                    found = true;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
            if (!found) {
                throw new NoSuchElementException();
            }
            result = current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }

    @Override
    public SetADT<T> union(SetADT<T> set) {
        LinkedSet<T> both = new LinkedSet<T>();

        LinearNode<T> current = contents;

        while (current != null) {
            both.add(current.getElement());
            current = current.getNext();
        }

        Iterator<T> scan = set.iterator();
        while (scan.hasNext()) {
            both.add(scan.next());
        }

        return both;
    }

    @Override
    public boolean contains(T target) {
        boolean found = false;

        LinearNode<T> current = contents;

        for (int look = 0; look < count && !found; look++) {
            if (current.getElement().equals(target)) {
                found = true;
            } else {
                current = current.getNext();
            }
        }

        return found;
    }

    @Override
    public boolean equals(SetADT<T> set) {
        boolean result = false;
        LinkedSet<T> temp1 = new LinkedSet<T>();
        LinkedSet<T> temp2 = new LinkedSet<T>();
        T obj;

        if (size() == set.size()) {
            temp1.addAll(this);
            temp2.addAll(set);

            Iterator<T> scan = set.iterator();

            while (scan.hasNext()) {
                obj = scan.next();
                if (temp1.contains(obj)) {
                    temp1.remove(obj);
                    temp2.remove(obj);
                }

            }
            result = (temp1.isEmpty() && temp2.isEmpty());
        }

        return result;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator<T>(count,contents);
    }
    
    public String toString(){
      return "";
   }

   
}
