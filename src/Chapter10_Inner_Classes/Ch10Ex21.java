/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(2) Create an interface that contains a nested class that has a static method
that calls the methods of your interface and displays the results. Implement your interface
and pass an instance of your implementation to the method. 
 */
interface HelloKitty {
    
    void hello();
    void kitty(); 
    
    class ByeCat {
        static void display(HelloKitty hk) {
            hk.hello();
            hk.kitty();
        }
    }
    
}

public class Ch10Ex21 implements HelloKitty {

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void kitty() {
        System.out.println("kitty");
    }
    
    public static void main(String[] args) {
        
        Ch10Ex21 obj = new Ch10Ex21();
        HelloKitty.ByeCat.display(obj);
        
    }
    
}
