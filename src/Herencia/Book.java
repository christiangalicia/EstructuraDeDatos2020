/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author user
 */
public class Book {
  protected  int numPages;

    public Book(int numPages) {
        this.numPages = numPages;
    }
  
  
  protected  void page(){
      System.out.println("number of pages: "+ numPages);
  }
}
