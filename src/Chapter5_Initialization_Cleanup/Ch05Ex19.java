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
public class Ch05Ex19 {
    
    public void showArr (String...args) {
        for (String str : args) {
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        
        String [] strArr = {"String", "Array"};
        
        Ch05Ex19 obj = new Ch05Ex19();
        obj.showArr("Tank", "Cars", "Plane");
        obj.showArr(strArr);
        
        
    }
}
