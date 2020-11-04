/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import EstructurasEnlazadas.LinearNode;
import java.util.EmptyStackException;

/**
 *
 * @author user
 */
public class LinkedQueue<T> implements QueueADT<T>{
    
    
    private LinearNode<T> rear;
    private LinearNode<T> front;    
    private int count;
    
    public LinkedQueue(){
        count=0;
        rear=null;
        front=rear;
    }

    @Override
    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<>(element);
        if(isEmpty()){
            front=node;
        }else{
            rear.setNext(node);
        }
        rear=node;
        count++;
    }

    @Override
    public T dequeue() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = front.getElement();
        front= front.getNext();
        count--;
        if(isEmpty()){
            rear=null;
        }
        return result;
    }

    @Override
    public T first() {
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
    
    public String toString(){
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }
}
