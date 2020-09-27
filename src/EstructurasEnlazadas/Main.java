/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasEnlazadas;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.name="david";
        
        Persona p2 = new Persona();
        p2.name="maria";
        
         Persona p3 = new Persona();
        p3.name="luis";
        
        p1.next= p2;
        p2.next=p3;
        p3.next=p1;
        
        System.out.println(p1.next.next.next.next.next.next.name);
    }
    
}
