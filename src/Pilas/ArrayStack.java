/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.EmptyStackException;

/**
 *
 * @author user
 */
public class ArrayStack<T> implements StackADT<T>{

    private T[] stack;
    private int top;
    private final int DEFAULT_CAPACITY=50;
    
    public ArrayStack(){
         top=0;
         stack= (T[]) (new Object[DEFAULT_CAPACITY]);
    }
    
    
    public void push(T element) {
        if(size()==stack.length){
            //exapandCapacity()
        }       
        stack[top]= element;
        top++;
    }

    @Override
    public T pop() throws EmptyStackException{
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        top--;
        T result = stack[top];
        stack[top]=null;
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
