/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**Exercise 8: (2) Show that hex and octal notations work with long values. Use
Long.toBinaryString( ) to display the results. 
 */
public class Ch03Ex08 {
    public static void main(String[] args) {
        
        long i1 = 0x2f; // Hex
        long n1 = 200L; // Octal
        long n2 = 0x15L; // Hex
        System.out.println(i1);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(Long.toBinaryString(i1));
        System.out.println(Long.toBinaryString(n1));
        System.out.println(Long.toBinaryString(n2));
        
    }
}
