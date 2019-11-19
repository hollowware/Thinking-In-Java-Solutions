/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**(1) Create a class containing a float and use it to demonstrate aliasing
during method calls. 
 */
public class Ch03Ex03 {
    public static void main(String[] args) {
        
        ABC x = new ABC();
        x.c = 'a';
        System.out.println("1: x.c = " + x.c);
        
        ABCD b = new ABCD();
        b.abc(x);
        System.out.println("2: x.c = " + x.c);
        
    }
}

class ABC {
    
    char c;
    
}

class ABCD {
    
    public void abc (ABC a) {
        a.c = 'z';
    }
    
}