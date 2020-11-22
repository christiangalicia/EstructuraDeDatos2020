/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import java.util.EmptyStackException;
import org.omg.CosNaming.NamingContextPackage.NotFound;

/**
 *
 * @author user
 */
public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T>
                                    implements BinarySearchTreeADT<T> {
    
    public LinkedBinarySearchTree(){
        super();
    }
    public LinkedBinarySearchTree(T element){
        super(element);
    }
    @Override
    public void addElement(T element) {
        BinaryTreeNode<T> temp = new BinaryTreeNode(element);
        Comparable<T> comparableElement= (Comparable<T>)element;
        if(isEmpty()){
            root=temp;
        }else{
            BinaryTreeNode<T> current = root;
            boolean added= false;
            while (!added) {                
                if(comparableElement.compareTo(current.element)<0){
                    if(current.left==null){
                        current.left=temp;
                        added=true;
                    }else{
                        current=current.left;
                    }
                }else{
                    if(current.rigth==null){
                        current.rigth=temp;
                        added=true;
                    }else{
                        current=current.rigth;
                    }
                }
            }
        }
        count++;
    }

   
    public T removeElement(T element) throws EmptyStackException {
     T result =null;
     if(!isEmpty()){
         if(((Comparable)element).equals(root.element)){
             result = root.element;
             root= remplacemet(root);
             count--;
         }else{
             BinaryTreeNode<T> current ,parent=root;
             boolean found=false;
             if(((Comparable)element).compareTo(root.element)<0){
                 current=root.left;
             }else{
                 current=root.rigth;
             }
             while(current !=null && !found){
                 if(element.equals(current.element)){
                     found=true;
                     count--;
                     result=current.element;
                     if(current==parent.left){
                         parent.left=remplacemet(current);
                     }else{
                         parent.rigth=remplacemet(current);
                     }
                 }else{
                     parent=current;
                     if(((Comparable)element).compareTo(current.element)<0){
                         current= current.left;
                     }else{
                         current= current.rigth;
                     }
                     
                 }
             }
             if(!found){
                 throw new EmptyStackException();
             }
         }
     }
     return result;
    }
    
    protected BinaryTreeNode<T> remplacemet(BinaryTreeNode<T> node){
        BinaryTreeNode result=null;
        if((node.left==null) && (node.rigth==null)){
            result=null;
        }else if ((node.left !=null)&&(node.rigth==null)){
            result=node.left;
        }else if((node.left==null)&& (node.rigth !=null)){
            result= node.rigth;
        }else{
            BinaryTreeNode<T> current = node.rigth;
            BinaryTreeNode<T> parent = node;
            while(current.left!= null){
                parent=current;
                current=current.left;
            }
            if(node.rigth==current){
                current.left=node.left;
            }else{
                parent.left=current.rigth;
                current.rigth=node.rigth;
                current.left=node.left;
            }
            result=current;
        }
        return result;
    }

    @Override
    public void removeAllOcurrences(T element)throws EmptyStackException {
        removeElement(element);
        try{
            while (contains((T)element)) {                
                removeElement(element);
            }
        }catch(Exception e){
            
        }
    }

    @Override
    public T removeMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeMax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T findMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T findMax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
