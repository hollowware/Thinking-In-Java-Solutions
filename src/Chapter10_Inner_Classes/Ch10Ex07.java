/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(2) Create a class with a private field and a private method. Create an
inner class with a method that modifies the outer-class field and calls the outer-class method.
In a second outer-class method, create an object of the inner class and call its method, then
show the effect on the outer-class object. 
 */
class PrivateClass {
    
    private String name = "Java";
    
    String getName () {
        return name;
    }
    
    private void method() {
        System.out.println("Private outer method");
    }
    
    class Inner {
        
        void modify() {
            name = "Buggy";
            method();
        }
        
    }
    
    void secondMethod() {
        Inner inner = new Inner();
        inner.modify();
    }
    
}
public class Ch10Ex07 {
    public static void main(String[] args) {
        
        PrivateClass pc = new PrivateClass();
        System.out.println(pc.getName());
        pc.secondMethod();
        System.out.println(pc.getName());
        
    }
}
