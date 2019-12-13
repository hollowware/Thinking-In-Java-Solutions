/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Create two exception classes, each of which performs its own logging
 * automtically. Demonstrate that these work.
 */
class MyExceptionThree extends Exception {

    private static Logger logger = Logger.getLogger("LoggingException");

    public MyExceptionThree() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class MyExceptionFour extends Exception {

    private static Logger logger = Logger.getLogger("LoggingException");

    public MyExceptionFour() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Ch12Ex06 {
    public static void main(String[] args) {
        
        try {
            throw new MyExceptionThree();
        } catch (MyExceptionThree e) {
            System.err.println("Cought: " + e);
        }
        try {
            throw new MyExceptionFour();
        } catch (MyExceptionFour e) {
            System.err.println("Cought: " + e);
        }
        
    }
}
