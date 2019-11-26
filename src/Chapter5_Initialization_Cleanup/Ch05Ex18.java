/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 18: (1) Complete the previous exercise by creating objects to attach to the array
of references. 
 */
public class Ch05Ex18 {
    public static void main(String[] args) {
        
        Brand [] arr = {new Brand("Nike"), new Brand("Reebok"), new Brand("Adidas")};
        
    }
}

class Brand {
    
    public Brand (String arg) {
        System.out.println("Brand is: " + arg);
    }
    
}
