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
public class Contact implements Comparable{

    private String firsName, lastName, phone;

    public Contact(String firsName, String lastName, String phone) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    public String toString(){
        return lastName+ " , "+firsName+"\t"+phone;
    }
    
    
    public int compareTo(Object o) {
            int result;
            if(lastName.equals(((Contact)o).lastName)){
                result = firsName.compareTo(((Contact)o).firsName);
            }else{
                result=lastName.compareTo(((Contact)o).lastName);
            }
            return result;
    }
    
}
