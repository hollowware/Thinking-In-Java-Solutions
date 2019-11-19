/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/** Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing. 
 */

class FloatClass {
    
    private float imAFloat;
    
    public float getImAFloat () {
        return imAFloat;
    }
    
    public void setImAFloat (int num) {
        this.imAFloat = num;
    }
}

public class Ch03Ex02 {
    public static void main(String[] args) {
        
        FloatClass fc = new FloatClass();
        System.out.println(fc.getImAFloat());
        
        FloatClass fc1 = new FloatClass();
        FloatClass fc2 = new FloatClass();
        fc1.setImAFloat(10);
        fc2.setImAFloat(15);
        System.out.println(fc1.getImAFloat());
        System.out.println(fc2.getImAFloat());
        fc1 = fc2;
        System.out.println(fc1.getImAFloat());
        System.out.println(fc2.getImAFloat());
        
        
    }
}
