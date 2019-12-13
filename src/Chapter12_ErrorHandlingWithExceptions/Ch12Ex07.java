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
 * Modify Exercise 3 so that the catch clause logs the result.
 */
public class Ch12Ex07 {

    private static Logger logger = Logger.getLogger("LoggingException");

    static void logger(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    static void f() {
        int[] arr = new int[5];
        for (int i = 0; i < 6; i++) {
            arr[i] = i;
        }
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (ArrayIndexOutOfBoundsException e) {
            logger(e);
        }

    }
}
