/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(1) Modify Exercise 1 so that Outer has a private String field (initialized
by the constructor), and Inner has a toString( ) that displays this field. Create an object of
type Inner and display it. 
 */
class OuterTwo {
    
    private String drink;
    
    public OuterTwo (String drink) {
        this.drink = drink;
    }
    
    Inner giveInner() {
        return new Inner();
    }
    
    class Inner {

        @Override
        public String toString() {
            return drink;
        }
        
    }
    
}
public class Ch10Ex03 {
    public static void main(String[] args) {
        
        OuterTwo o = new OuterTwo("CocaCola~");
        OuterTwo.Inner inner = o.giveInner();
        System.out.println(inner);
        
    }
}
