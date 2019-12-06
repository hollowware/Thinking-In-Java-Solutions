/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**
 * (2) Determine whether an outer class has access to the private elements of
 * its inner class.
 */
public class Ch10Ex08 {

    class Inner {

        private int numOne = 1;
        private int numTwo = 2;

        private void showNumTwo() {
            System.out.println(numTwo);
        }

        private void hi() {
            System.out.println("Inner hi");
        }
    }

    int num = new Inner().numOne;
    int number = new Inner().numTwo;
    
    void accessHi () {
        new Inner().hi();
    }

    public static void main(String[] args) {
        
        Ch10Ex08 obj = new Ch10Ex08();
        System.out.println(obj.num);
        System.out.println(obj.number);
        obj.accessHi();
        
    }
}
