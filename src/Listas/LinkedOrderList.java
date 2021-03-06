/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import EstructurasEnlazadas.LinearNode;

/**
 *
 * @author user
 */
public class LinkedOrderList<T> extends LinkedList<T> implements OrderListADT<T>{

    @Override
    public void add(T elemento) {
        Comparable<T> temp = (Comparable<T>) elemento;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;
        int scan = 0;
        LinearNode<T> node = new  LinearNode<>(elemento);
        while (scan < count && temp.compareTo(current.getElement()) > 0) {
            previous = current;
            current = current.getNext();
            scan++;
        }
        
       if(current==head){
            head = node;
        }else{
           previous.setNext(node);
       }
       node.setNext(current);
       current=node;
       if(current.getNext()==null){
           tail=current;
       }
        count++;
    }
    
}
