/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(1) Repeat Exercise 7 using an anonymous inner class. 
 */
interface Modify {
    
    void modifyOuter();
    
}

class PrivateClass2 {
    
    private String name = "Java";
    
    String getName () {
        return name;
    }
    
    private void method() {
        System.out.println("Private outer method");
    }
    
    Modify inner() {
        return new Modify() {
            @Override
            public void modifyOuter() {
                name = "Buggy";
                method();
            }
        };
    }
    
}
public class Ch10Ex12 {
    public static void main(String[] args) {
        
        PrivateClass2 pc = new PrivateClass2();
        System.out.println(pc.getName());
        pc.inner().modifyOuter();
        System.out.println(pc.getName());
        
    }
}
