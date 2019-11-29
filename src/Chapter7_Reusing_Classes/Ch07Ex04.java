/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(2) Prove that the base-class constructors are (a) always called and (b) called
before derived-class constructors. 
 */
class BaseClassOne {
    
    public BaseClassOne () {
        System.out.println("Im master constructor");
    }
    
}

class ClassThree extends BaseClassOne {
    
    public ClassThree () {
        super();
        System.out.println("Im first class after base class.");
    }
    
}

class ClassFour extends ClassThree {
    
    public ClassFour () {
        super();
        System.out.println("Im second class after base class.");
    }
    
}
public class Ch07Ex04 {
    public static void main(String[] args) {
        
        ClassFour cf = new ClassFour();
        
    }
}
