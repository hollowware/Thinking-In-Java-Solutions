/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner. In main( ), create and
initialize a reference to an Inner
 */
class Outer {
    
    Inner giveInner() {
        return new Inner();
    }
    
    class Inner {

        @Override
        public String toString() {
            return "Inner";
        }
        
    }
    
}

public class Ch10Ex01 {
    public static void main(String[] args) {
        
        Outer o = new Outer();
        Outer.Inner inner = o.giveInner();
        System.out.println(inner);
        
    }
}
