/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (4) Add a class with a dispose( ) method to the previous exercise. Modify
 * FailingConstructor so that the constructor creates one of these disposable
 * objects as a member object, after which the constructor might throw an
 * exception, after which it creates a second disposable member object. Write
 * code to properly guard against failure, and in main( ) verify that all
 * possible failure situations are covered.
 */
class AddClass {

    void dispose() {
        System.out.println("Disposing.");
    }

}

class OtherFailingConstructor {

    public OtherFailingConstructor() {
        AddClass ac = new AddClass();
        ac.dispose();
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Cought");
        }
        AddClass dc = new AddClass();
        dc.dispose();
    }
    
    void dispose() {
        System.out.println("Failure");
    }

}

public class Ch12Ex23Ex24 {

    public static void main(String[] args) {

        OtherFailingConstructor ofc = new OtherFailingConstructor();
        ofc.dispose();

    }
}
