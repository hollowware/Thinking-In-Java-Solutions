/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6_Access_Control;

/**(1) Create a class with protected data. Create a second class in the same file
with a method that manipulates the protected data in the first class. 
 */
class ProtectedClass {
    
    protected String name;
    
}

class ManipulateHim {
    
    static void manipulate (ProtectedClass pc, String name) {
        pc.name = name;
    }
    
}

public class Ch06Ex06 {
    public static void main(String[] args) {
        
        ProtectedClass pc = new ProtectedClass();
        System.out.println(pc.name);
        ManipulateHim.manipulate(pc, "Albert");
        System.out.println(pc.name);
        
    }
}
