/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(1) Modify Exercise 5 so that A and B have constructors with arguments
instead of default constructors. Write a constructor for C and perform all initialization within
C’s constructor. 
 */
class D {
    
    public D (int num) {
        System.out.println("Announce D " + num);
    }
    
}

class E {
    
    public E (int num) {
        System.out.println("Announce E " + num);
    }
    
}

class F extends D {
    
    int a;
    
    public F (int num) {
        super (num);
        this.a = num + 2;
        System.out.println("Announce F " + a);
    }
    
    E e = new E(4);
    
}

public class Ch07Ex07 {
    public static void main(String[] args) {
        
        F f = new F(15);
        
    }
}
