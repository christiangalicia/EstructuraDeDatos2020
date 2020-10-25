/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import EstructurasEnlazadas.LinearNode;
import java.util.EmptyStackException;

/**
 *
 * @author user
 */
public class LinkedStack<T> implements StackADT<T>{
    private LinearNode<T> top;
    private int count;

    public LinkedStack() {
        top = new LinearNode<>();
        count=0;
    }
    
    
    @Override
    public void push(T element) {
      LinearNode<T> temp = new LinearNode<T>(element);
      temp.setNext(top);
      top=temp;
      count++;
    }

    @Override
    public T pop() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = top.getElement();
        top= top.getNext();
        count--;
        return result;
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        return "";
    }
    
}
