/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 20: (1) Create a main( ) that uses varargs instead of the ordinary main( )
syntax. Print all the elements in the resulting args array. Test it with various numbers of
command-line arguments. 
 */
public class Ch05Ex20 {
    
    public static void main(String... args) {
        
        for (String str : args) {
            System.out.println(args);
        }
        
    }
}
