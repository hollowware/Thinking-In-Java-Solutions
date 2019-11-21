/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. This
method should be overloaded based on various primitive data types, and print different types
of barking, howling, etc., depending on which overloaded version is called. Write a main( )
that calls all the different versions. 
 */
public class Ch05Ex05 {
    public static void main (String[] args) {
        
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark('a');
        
    }
}

class Dog {
    
    void bark () {
        System.out.println("No arg bark");
    }
    
    void bark(int a) {
        System.out.println("I have int bark!");
    }
    
    void bark (char a) {
        System.out.println("I have char bark!");
    }
}
