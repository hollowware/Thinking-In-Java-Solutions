/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**
 * (1) Create an interface containing a nested class. Implement this interface
 * and create an instance of the nested class
 */
public interface Ch10Ex20 {

    void howdy();

    static class Nested implements Ch10Ex20 {

        @Override
        public void howdy() {
            System.out.println("howdy");
        }

    }

}

class Runable {
    
    public static void main(String[] args) {

        Ch10Ex20 obj = new Ch10Ex20.Nested();
        obj.howdy();

    }
    
}
