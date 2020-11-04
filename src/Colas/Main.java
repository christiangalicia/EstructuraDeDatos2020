/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] key = {5,12,-3,8,-9,10};
        Integer keyValue;
        String encoded = "";
        String decoded = "";
        String message = "This message will be Encrypted";
        
        LinkedQueue<Integer> keyQueue1 = new LinkedQueue<>();
        LinkedQueue<Integer> keyQueue2 = new LinkedQueue<>();
        
        System.out.println("Original Message: " + message);
        
        //Cargar cola de claves
        for (int scan = 0; scan < key.length; scan++) {
            keyQueue1.enqueue(new Integer(key[scan]));
            keyQueue2.enqueue(new Integer(key[scan]));
        }
        
        //Codificar Message
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = keyQueue1.dequeue();
            encoded += (char) ((int) message.charAt(scan) + keyValue.intValue());
            keyQueue1.enqueue(keyValue);
        }
        System.out.println("Encoded Message: " + encoded);
        
        //Decodificar Message
        //encoded
        
        
        //Crear un sistema utilizando pilas  y cola con el que se pueda
        //comprobar  si una cadena de caracteres dada es un palindromo
        
        ana
    }
    
}
