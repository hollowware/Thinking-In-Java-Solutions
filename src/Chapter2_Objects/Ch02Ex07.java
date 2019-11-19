/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2_Objects;

/**
 *
 * @author IX Hero
 */
class StaticTest {
    
    static int i = 47;
    
}

class Incrementable {
    
    static void increment () {
        StaticTest.i++;
    }
    
}

public class Ch02Ex07 {
    public static void main(String[] args) {
        
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
        
    }
}
