/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author user
 */
public interface StackADT<T> {
    /*
    push    añade un elemento a la parte superior de la pila
    pop     elimina un elemento de la parte superior de la pila
    peek    examina el elemento situado en la parte superior de la pila
    isEmpty
    size
    */
    
    public void push(T element);
    public T pop();
    public T peek();
    public int size();
    public boolean isEmpty();
    public String toString();
}
