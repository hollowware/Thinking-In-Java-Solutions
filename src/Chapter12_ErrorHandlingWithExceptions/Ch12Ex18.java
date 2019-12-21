/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (3) Add a second level of exception loss to LostMessage.java so that the
 * HoHumException is itself replaced by a third exception.
 */
class VeryImportantException extends Exception {

    @Override
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {

    @Override
    public String toString() {
        return "A trivial exception";
    }
}

class ThirdException extends Exception {

    @Override
    public String toString() {
        return "A third exception";
    }
}

// LostMessage class
public class Ch12Ex18 {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    
    void lol() throws ThirdException {
        throw new ThirdException();
    }

    public static void main(String[] args) {
        try {
            Ch12Ex18 lm = new Ch12Ex18();
            try {
                lm.f();
                lm.dispose();
            } finally {
                lm.lol();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
