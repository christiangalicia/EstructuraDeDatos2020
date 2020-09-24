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
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact[] friends = new Contact[7];
        friends[0]= new Contact("luis", "garcia", "238393939");
        friends[1]= new Contact("angel", "lopez", "23223939");
        friends[2]= new Contact("paco", "garcia", "238394449");
        friends[3]= new Contact("armando", "sanchez", "23855939");
        friends[4]= new Contact("maria", "perez", "238393779");
        friends[5]= new Contact("luis", "sanchez", "238398769");
        friends[6]= new Contact("diego", "zarate", "233448769");
        
        SortingAndSearch<Contact> lista =new SortingAndSearch<>();
        lista.selectionSort(friends);
        for (int index = 0; index < friends.length; index++) {
            System.out.println(friends[index]);
        }
        
        System.out.println(lista.linearSearch(friends, 0, 6, 
                new Contact("luis", "zarate", "123456789")));
        
        
    }
    
}
