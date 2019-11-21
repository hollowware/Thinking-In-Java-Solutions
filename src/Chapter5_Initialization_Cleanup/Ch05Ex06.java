/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 6: (1) Modify the previous exercise so that two of the overloaded methods have
two arguments (of two different types), but in reversed order relative to each other. Verify
that this works. 
 */
public class Ch05Ex06 {
   
    public static void main (String[] args) {
        
        Dogo dog = new Dogo();
        dog.bark();
        dog.bark(1);
        dog.bark('a');
        dog.bark(5, 'a');
        dog.bark('b', 5);
    }
}

class Dogo {
    
    void bark () {
        System.out.println("No arg bark");
    }
    
    void bark(int a) {
        System.out.println("I have int bark!");
    }
    
    void bark (char a) {
        System.out.println("I have char bark!");
    }
    
    void bark (int b, char c) {
        System.out.println("int, char");
    }
    
    void bark (char d, int e) {
        System.out.println("char, int");
    }
}