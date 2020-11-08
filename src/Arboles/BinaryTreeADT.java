/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import java.util.Iterator;

/**
 *
 * @author user
 */
public interface BinaryTreeADT<T> {
    public void removeLeftSubtree();
    public void removeRightSubtree();
    public void removeAllElements();
    public boolean isEmpty();
    public  int size();
    public boolean contains(T element);
    public T find(T element);
    public String toString();
    public Iterator<T> itaratorInOrder(); //en arbol
    public Iterator<T> itaratorPreOrder(); //descendente
    public Iterator<T> itaratorPostOrder();//Ascendente
    public Iterator<T> itaratorLeveOrder();//Niveles
}
