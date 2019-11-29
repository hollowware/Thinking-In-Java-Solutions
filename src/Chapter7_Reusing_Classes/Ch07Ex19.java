/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(2) Create a class with a blank final reference to an object. Perform the
initialization of the blank final inside all constructors. Demonstrate the guarantee that the
final must be initialized before use, and that it cannot be changed once initialized. 
 */
public class Ch07Ex19 {
    
    private final String str; // shows an error while final isnt initialized in a constructor.
    
    public Ch07Ex19 (String string) {
        this.str = string;
    }
    
    public String getStr () {
        return this.str;
    }
    
    public static void main(String[] args) {
        
        Ch07Ex19 obj = new Ch07Ex19("final");
        System.out.println(obj.getStr());
//        obj.str = "Hello"; Error, can't asign. 
        
    }
    
}
