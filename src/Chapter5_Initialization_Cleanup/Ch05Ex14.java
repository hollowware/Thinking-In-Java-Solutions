/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**
 *
 * @author IX Hero
 */
public class Ch05Ex14 {
    
    static String string;
    
    static {
        string = "String";
    }
    
    static void print() {
        System.out.println(string);
    }
    
    public static void main(String[] args) {
        
        System.out.println(Ch05Ex14.string);
        Ch05Ex14.print();
        
    }
}
