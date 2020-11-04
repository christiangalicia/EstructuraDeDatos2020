/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import java.util.EmptyStackException;

/**
 *
 * @author user
 */
public class ArrayQueue<T> implements QueueADT<T>{
    
    private T[] queue;
    private int rear;
    private final int DEFAULT_CAPACITY=5;
    
    public ArrayQueue() {
        this.queue = (T[])(new Object[DEFAULT_CAPACITY]);
        this.rear = 0;
    }

    @Override
    public void enqueue(T element) {
        if( size()== queue.length){
           //expandir
        }
        queue[rear]=element;
        rear++;
    }

    @Override
    public T dequeue() throws EmptyStackException{
      if (isEmpty()){
          throw  new EmptyStackException();
      }
      T result = queue[0];
      rear--;
      
        for (int scan = 0; scan < rear; scan++) {
            queue[scan]= queue[scan+1];
        }
        queue[rear]=null;
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
        return "";
    }
    
}
