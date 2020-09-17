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
    
}
