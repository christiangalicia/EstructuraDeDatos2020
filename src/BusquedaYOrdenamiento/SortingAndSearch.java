/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaYOrdenamiento;

/**
 *
 * @author user
 */
public class SortingAndSearch<T extends  Comparable> {
    
    public boolean linearSearch (T[] data,int min, int max, T target ){
        int index =min;
        boolean found= false;
        
        while (!found && index<=max) {            
            if(data[index].compareTo(target)==0){
                found =true;
            }
            index++;
        }
        return found;
    }
    
    public boolean binarySearch(T[] data, int min ,int max, T target){
        boolean found= false;
        int midpoint =(min+max)/2; 
        if(data[midpoint].compareTo(target)==0){
            found=true;
        }else if( data[midpoint].compareTo(target)>0){
            if(min<=midpoint -1){
                found = binarySearch(data, min, midpoint-1, target);
            }
        }else if(midpoint+1<=max){
            found= binarySearch(data, midpoint+1, max, target);
        }
        return found;
    }
    
    
    public void selectionSort(T[] data){
        int min;
        T temp;
        for (int index = 0; index < data.length-1; index++) {
            min=index;
            for (int scan = index+1; scan < data.length; scan++) {
                if(data[scan].compareTo(data[min])<0){
                    min=scan;
                }
            }
            temp= data[min];
            data[min]=data[index];
            data[index]=temp;
        }
    }
    
    public void insertionSort(T[] data){
        for (int index = 1; index < data.length ; index++) {
            T key = data[index];
            int position= index;
            
            //desplazar los valores moyores hacia la derecha
            while (position>0 && data[position-1].compareTo(key)>0) {                
                data[position]= data[position-1];
                position--;
            }
            data[position]=key;
        }
    }
    
    public void bubbleSort(T[] data){
        int position, scan;
        T temp;
        for(position= data.length-1; position>=0; position--){
            for(scan=0; scan<=position-1; scan++){
                if(data[scan].compareTo(data[scan+1])>0){
                    //intercambio
                    temp =data[scan];
                    data[scan]= data[scan+1];
                    data[scan+1]=temp;
                }
            }
        } 
    }
    
    public void quickSort(T[] data, int min, int max){
        int indexofPartition;
        if(max -min >0){
            //creraar la particion
            indexofPartition= findPartition(data,min,max);
            //ordena el lado izquierdo
            quickSort(data, min, indexofPartition-1);
            //ordenar el lado derecho
            quickSort(data, indexofPartition+1, max);
                
        }
      
    }
    private int findPartition(T[] data, int min, int max){
        int left, right;
        T temp,  partitionelement;
        //ultiliza el primer elemento como pivote
        partitionelement=data[min];
        left=min;
        right=max;
        while (left<right) {            
            //buscar un elemento que se mayor que el pivote
            while (data[left].compareTo(partitionelement)<=0 && left<right) {                
                left++;
            }
            //buscar un elmeento que sea menor que el pivote
            while (data[right].compareTo(partitionelement)>0) {                
                right--;
            }
            //intercabio de elementos
            if(left<right){
                temp= data[left];
                data[left]=data[right];
                data[right]=temp;
            }
        }
        //move el elemento hasta el indice de la particion
        temp= data[min];
        data[min]= data[right];
        data[right]=temp;
        return right;
    }
    
    public void mergeSort(T[] data, int min, int max){
        T[] temp;
        int index1, left, right;
        //busca una lista de longitud 1
        if(min==max){
            return;
        }
        //calcula la longitud y el punto medio de la lista
        int size= max-min+1;
        int pivot= (min+max)/2;
        temp=(T[])( new Comparable[size]);
        //ordenar la mitad izquierda
        mergeSort(data, min, pivot);
        //ordena la mitad derecha
        mergeSort(data, pivot+1, max);
        //copia los datos ordenados 
        for(index1=0; index1< size; index1++){
            temp[index1]= data[min+index1];
        }
        //mezcla las 2 listas ordenadas
        left=0;
        right= pivot-min+1;
        for(index1=0;index1<size;index1++){
            if(right<= max-min){
                if(left<=pivot-min){
                    if(temp[left].compareTo(temp[right])>0){
                        data[index1+min]=temp[right++];
                    }else{
                         data[index1+min]=temp[left++];
                    }
                }else{
                    data[index1+min]=temp[right++];
                }
            }else{
                data[index1+min]=temp[left++];
            }
        }
    }
    
}
