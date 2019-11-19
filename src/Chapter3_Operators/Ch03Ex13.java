/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**Exercise 13: (1) Write a method that displays char values in binary form. Demonstrate
it using several different characters. 
 */
public class Ch03Ex13 {
    public static void main(String[] args) {
        
        displayValues('a');
        displayValues('b');
        displayValues('c');
        
    }

    private static void displayValues(char a) {
        System.out.println(Integer.toBinaryString(a));
    }
}
