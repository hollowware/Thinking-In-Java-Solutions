/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**
 * (4) Create an interface U with three methods. Create a class A with a method
 * that produces a reference to a U by building an anonymous inner class. Create
 * a second class B that contains an array of U. B should have one method that
 * accepts and stores a reference to a U in the array, a second method that sets
 * a reference in the array (specified by the method argument) to null, and a
 * third method that moves through the array and calls the methods in U. In
 * main( ), create a group of A objects and a single B. Fill the B with U
 * references produced by the A objects. Use the B to call back into all the A
 * objects. Remove some of the U references from the B.
 */
interface U {

    void write();

    void read();

    void erase();

}

class A {

    U a() {
        return new U() {

            @Override
            public void write() {
                System.out.println("Overrided write()");
            }

            @Override
            public void read() {
                System.out.println("Overrided read()");
            }

            @Override
            public void erase() {
                System.out.println("Overrided erase()");
            }

            @Override
            public String toString() {
                return "Class A";
            }

        };
    }

}

class B {

    U[] uArr;

    B(int i) {
        uArr = new U[i];
    }

    void store(U u) {
        for (int i = 0; i < uArr.length; i++) {
            uArr[i] = u;
        }
    }

    void setNull(int i) {
        uArr[i] = null;
    }

    void iterate() {
        for (U obj : uArr) {
            System.out.println("***************");
            obj.write();
            obj.read();
            obj.erase();
        }
    }
    
    void obj() {
        for (U obj : uArr) {
            if(obj != null) {
                System.out.println(obj);
            } else {
                System.out.println("Null here");
            }
        }
    }

}

public class Ch10Ex23 {

    public static void main(String[] args) {
        
        int quantity = 10;
        
        A objA = new A();
        B objB = new B(quantity);
        for (int i = 0; i < quantity; i++) {
            objB.store(objA.a());
        }
        objB.iterate();
        objB.obj();
        System.out.println("--------------");
        objB.setNull(0);
        objB.setNull(1);
        objB.obj();

    }
}
