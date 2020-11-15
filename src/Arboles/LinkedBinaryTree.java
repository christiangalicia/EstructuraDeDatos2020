/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class LinkedBinaryTree<T> implements BinaryTreeADT<T>{

    protected int count;
    protected BinaryTreeNode<T> root;

    public LinkedBinaryTree() {
        count=0;
        root=null;
    }
    public LinkedBinaryTree(T element){
        count=1;
        root= new BinaryTreeNode<T>(element);
    }
    
    public LinkedBinaryTree(T element, LinkedBinaryTree<T> leftSubTree,
                                        LinkedBinaryTree<T> rightSubTree){
        
        root= new BinaryTreeNode<T>(element);
        count=1;
        if(leftSubTree!=null){
            count=count+leftSubTree.size();
            root.left=leftSubTree.root;
        }else{
            root.left=null;
        }
        if(rightSubTree != null){
            count= count+rightSubTree.size();
            root.rigth=rightSubTree.root;
        }else{
            root.rigth=null;
        }
    }
    
    
    @Override
    public void removeLeftSubtree() {
        if(root.left!=null){
            count=count-root.left.numChildren()-1;
        }
        root.left=null;
    }

    @Override
    public void removeRightSubtree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllElements() {
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

    @Override
    public boolean contains(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T find(T element)throws EmptyStackException {
        BinaryTreeNode<T> current = findagain(element,root);
        if(current==null){
            throw new EmptyStackException();
        }
        return current.element;
    }
    
    private BinaryTreeNode<T> findagain(T target, BinaryTreeNode<T> next){
        if(next==null){
            return null;
        }
        if(next.element.equals(target)){
            return next;
        }
        BinaryTreeNode<T> temp = findagain(target, next.left);
        if(temp==null){
            temp=findagain(target, next.rigth);
        }
        return temp;
    }

    @Override
    //es el recorrido en arbol
    public Iterator<T> itaratorInOrder() {
        ArrayList<T> templist = new ArrayList<>();
        inorder(root,templist);
        return templist.iterator();
    
    }
    
    private void inorder(BinaryTreeNode<T> node, ArrayList<T> templist){
        if(node !=null){
            inorder(node.left, templist);
            templist.add(node.element);
            inorder(node.rigth, templist);
        }
    }

    @Override
    //descendente
    public Iterator<T> itaratorPreOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //ascendente 
    public Iterator<T> itaratorPostOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //por niveles
    public Iterator<T> itaratorLeveOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     /*
        Crear cola denominada nodos
        crear una lista desordenada denominada resultado
        introducir la raiz en la cola de nodos
        Mietras que la cola de nodos no este vacia{
           Sacar el primer elemento de la cola
           Si dicho elemento no es nulo entonces
                añadir dicho elemento al final de la lista de resultados
                introducir en la cola los hijos del elemento
           sino
                añaidr el valor nulo a la lista de resultados

        }
        devolver un iterador para la lista de resultados
        
        */
    }
    
}
