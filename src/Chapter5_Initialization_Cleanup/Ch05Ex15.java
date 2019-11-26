/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**
 *
 * @author IX Hero
 */
public class Ch05Ex15 {
    public static void main(String[] args) {
        
        new Test();
        
    }
}

class Test {
    
    String str;
    
    {
        str = "Java";
        System.out.println(str);
    }
    
}
