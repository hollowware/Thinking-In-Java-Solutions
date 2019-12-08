/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(2) Create a private inner class that implements a public interface. Write
a method that returns a reference to an instance of the private inner class, upcast to the
interface. Show that the inner class is completely hidden by trying to downcast to it. 

 */
interface PublicInterface {
    
    void speak();
    
}

class Child {
    
    private class Inner implements PublicInterface {

        @Override
        public void speak() {
            System.out.println("Hello madaf..");
        }
        
    }
    
    Inner getInner() {
        return new Inner();
    }
    
    PublicInterface upcast(Inner inner) {
        return inner;
    }
    
}

public class Ch10Ex11 {
    public static void main(String[] args) {
        
        Child ch = new Child();
        ch.upcast(ch.getInner()).speak();
//        Inner inner = ch.getInner(); Error, Inner isnt visible.
//        Child.
        
    }
}
