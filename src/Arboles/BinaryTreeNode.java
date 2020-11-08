/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author user
 */
public class BinaryTreeNode<T> {
    protected  T element;
    protected  BinaryTreeNode<T> left, rigth;

    public BinaryTreeNode(T obj) {
        element=obj;
        left=null;
        rigth=null;
        
    }
    
    public int numChildren(){
        int children=0;
        if(left != null){
            children =1+left.numChildren();
        }
        if(rigth !=null){
            children = children+1+ rigth.numChildren();
        }
        return children;
    }
    
    
    
    
}
