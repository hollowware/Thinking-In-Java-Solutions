/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**
 * Exercise 2: (2) Create a class with a String field that is initialized at the
 * point of definition, and another one that is initialized by the constructor.
 * What is the difference between the two approaches?
 */
public class Ch05Ex02 {

    String stringOne = "Java";
    String stringTwo;

    Ch05Ex02() {
        this.stringTwo = "Oracle";
    }
    
    public static void main(String[] args) {
        
        Ch05Ex02 obj = new Ch05Ex02();
        System.out.println("String one - " + obj.stringOne);
        System.out.println("String two - " + obj.stringTwo);
        
    }
}
