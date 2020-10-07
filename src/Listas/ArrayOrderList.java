/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.Iterator;

/**
 *
 * @author user
 */
public class ArrayOrderList<T> extends ArrayList<T> implements OrderListADT<T> {

   
    
    @Override
    public void add(T elemento) {
        if (size() == list.length) {
            expandCapacity();
        }
        Comparable<T> temp = (Comparable<T>) elemento;
        int scan = 0;
        while (scan < rear && temp.compareTo(list[scan]) > 0) {
            scan++;
        }
        for (int scan2 = rear; scan2 > scan; scan2--) {
            list[scan2] = list[scan2 - 1];
        }
        list[scan]=elemento;
        rear++;
    }

    private void expandCapacity() {
        T[] larger = (T[]) (new Object[list.length * 2]);
        for (int index = 0; index < list.length; index++) {
            larger[index] = list[index];
        }
        list = larger;
    }

}
