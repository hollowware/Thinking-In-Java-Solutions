/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (2) Create a class called FailingConstructor with a constructor that might
 * fail partway through the construction process and throw an exception. In
 * main( ), write code that properly guards against this failure.
 */
class FailingConstructor {

    public FailingConstructor() throws Exception {
        throw new Exception();
    }

}

public class Ch12Ex22 {

    public static void main(String[] args) {

        try {
            FailingConstructor fc = new FailingConstructor();
        } catch (Exception e) {

        }
    }
}
