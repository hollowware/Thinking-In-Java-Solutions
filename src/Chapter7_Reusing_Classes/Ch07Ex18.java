/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(2) Create a class with a static final field and a final field and
demonstrate the difference between the two. 
 */
public class Ch07Ex18 {
    
    private static final String BEST_STRING = "I am alfa String!"; // Constant, must be written in capital letters
    private final String string = "I'm only Final :(";
    
    public static void main(String[] args) {
        
        System.out.println(Ch07Ex18.BEST_STRING);
        Ch07Ex18 obj = new Ch07Ex18();
        System.out.println(obj.string);
//        Ch07Ex18.BEST_STRING = "New String."; Can't assign because its Final. 
//        obj.string = "hah"; Can't assign because its Final.
        
    }
    
}
