/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (2) Demonstrate that a derived-class constructor cannot catch exceptions
 * thrown by its base-class constructor.
 */
class Bday {

    public Bday() throws Exception {
        throw new Exception();
    }

}

class Xmas extends Bday {

    public Xmas() throws Exception {
        // unable to put super() in try/catch block.
        super();
    }

}

public class Ch12Ex21 {

    public static void main(String[] args) {

        try {
            Xmas x = new Xmas();
            // Catch available only in main
        } catch (Exception e) {

        }
    }
}
