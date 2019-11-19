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
class StaticTestCopy {
    
    static int i = 47;
    
}

public class Ch02Ex08 {
    public static void main(String[] args) {
        
        StaticTestCopy copyOne = new StaticTestCopy();
        StaticTestCopy copyTwo = new StaticTestCopy();
        StaticTestCopy copyThree = new StaticTestCopy();
        System.out.println(copyOne.i);
        System.out.println(copyTwo.i);
        System.out.println(copyThree.i);
        
        
    }
}
