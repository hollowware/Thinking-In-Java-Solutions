/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (2) Create a three-level hierarchy of exceptions. Now create a base-class A
 * with a method that throws an exception at the base of your hierarchy. Inherit
 * B from A and override the method so it throws an exception at level two of
 * your hierarchy. Repeat by inheriting class C from B. In main( ), create a C
 * and upcast it to A, then call the method.  *
 */
class MainException extends Exception {
}

class MediumException extends MainException {
}

class SmallException extends MediumException {
}

class A {

    void pleaseFail() throws MainException {
        throw new MainException();
    }

}

class B extends A {

    @Override
    void pleaseFail() throws MediumException {
        throw new MediumException();
    }

}

class C extends B {

    @Override
    void pleaseFail() throws SmallException {
        throw new SmallException();
    }

}

public class Ch12Ex25 {

    public static void main(String[] args) {

        A a = new C();
        try {
            a.pleaseFail();
            // Base Exception handles all exceptions bellow him.
        } catch (MainException me) {

        }
    }
}
