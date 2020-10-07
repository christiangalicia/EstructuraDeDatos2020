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
        friends[0]= new Contact("Sergio", "Mendez", "238393939");
        friends[1]= new Contact("Kim", "Nery", "23223939");
        friends[2]= new Contact("Ivan", "Valencia", "238394449");
        friends[3]= new Contact("Rocio", "Martinez", "23855939");
        friends[4]= new Contact("Pedro", "Martinez", "238393779");
        friends[5]= new Contact("Diana", "Martinez", "238398769");
        friends[6]= new Contact("Luis", "Perez", "233448769");
        
        SortingAndSearch<Contact> lista =new SortingAndSearch<>();
        lista.quickSort(friends,0,friends.length-1);
        for (int index = 0; index < friends.length; index++) {
            System.out.println(friends[index]);
        }
        
        System.out.println(lista.linearSearch(friends, 0, 6, 
                new Contact("luis", "zarate", "123456789")));
        
        
    }
    
}
