/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * (5) Write a method that takes an object and recursively prints all the
 * classes in that object’s hierarchy.
 * 
 * (5) Modify the previous exercise so that it uses
Class.getDeclaredFields( ) to also display information about the fields in a class. 
 */
class A {
    
    private String word;

    @Override
    public String toString() {
        return "A";
    }
    
}

class B extends A {
    
    private boolean liar;

    @Override
    public String toString() {
        return "B";
    }
    
}

class C extends B {
    
    private int number;
    
    @Override
    public String toString() {
        return "C";
    }
    
}

public class Ch14Ex08Ex09 {

    static void printInheritance(Object obj) {
        if (obj.getClass().getSuperclass() != null) {
            System.out.println(obj + " fields are - " + Arrays.toString(obj.getClass().getDeclaredFields()));
            System.out.println(obj + " is a subclass of " + obj.getClass().getSuperclass());
            System.out.println("********************************");
            try {
                printInheritance(obj.getClass().getSuperclass().newInstance());
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Ch14Ex08Ex09.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {

        printInheritance(new C());

    }
}
