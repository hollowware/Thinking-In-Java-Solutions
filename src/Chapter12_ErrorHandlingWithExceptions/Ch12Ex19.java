/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 *
 * @author IX Hero
 */
class VeryImportantExceptionn extends Exception {

    @Override
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumExceptionn extends Exception {

    @Override
    public String toString() {
        return "A trivial exception";
    }
}

class ThirdExceptionn extends Exception {

    @Override
    public String toString() {
        return "A third exception";
    }
}

// LostMessage class
public class Ch12Ex19 {

    void f() throws VeryImportantExceptionn {
        throw new VeryImportantExceptionn();
    }

    void dispose() throws HoHumExceptionn {
        throw new HoHumExceptionn();
    }
    
    void lol() throws ThirdExceptionn {
        throw new ThirdExceptionn();
    }

    public static void main(String[] args) {
        try {
            Ch12Ex19 lm = new Ch12Ex19();
            try {
                lm.f();
                lm.dispose();
            } catch (VeryImportantExceptionn | HoHumExceptionn e) {
                System.out.println("Handeled");
            } finally {
                lm.lol();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
