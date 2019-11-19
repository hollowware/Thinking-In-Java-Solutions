/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2_Objects;

/**
 *
 * @author IX Hero
 */
public class Ch02Ex09 {
    public static void main(String[] args) {
        
        // creating an Integer Object 
        // with value 10. 
        Integer i = new Integer(10); 
  
        // unboxing the Object 
        int i1 = i; 
  
        System.out.println("Value of i: " + i); 
        System.out.println("Value of i1: " + i1); 
  
        //Autoboxing of char 
        Character gfg = 'a'; 
  
        // Auto-unboxing of Character 
        char ch = gfg; 
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of gfg: " + gfg); 
        
    }
}
