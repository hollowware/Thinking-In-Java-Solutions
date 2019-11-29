/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(2) Create a simple class. Inside a second class, define a reference to an object
of the first class. Use lazy initialization to instantiate this object. 
 */
class SimpleClass {
    
    String simple;
    
    public SimpleClass() {
        System.out.println("SimpleClass");
        this.simple = "Simple Class Created.";
    }

    @Override
    public String toString() {
        return "SimpleClass{" + "simple=" + simple + '}';
    }
    
}

public class Ch07Ex01 {
    
    int num = 15;
    SimpleClass sc = new SimpleClass();

    @Override
    public String toString() {
        return "Ch07Ex01{" + "num=" + num + ", sc=" + sc + '}';
    }
    
    public static void main(String[] args) {
        
        Ch07Ex01 obj = new Ch07Ex01(); 
        System.out.println(obj);
        
    }
    
}
