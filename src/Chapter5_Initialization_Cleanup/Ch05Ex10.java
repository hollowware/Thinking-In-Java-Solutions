/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**
 * Exercise 10: (2) Create a class with a finalize( ) method that prints a
 * message. In main( ), create an object of your class. Explain the behavior of
 * your program.
 */
public class Ch05Ex10 {
    public static void main(String[] args) {
        TerminationConditionEx objOne = new TerminationConditionEx(true);
        TerminationConditionEx objTwo = new TerminationConditionEx(true);
        // Proper cleanup: log out of objOne before going home
        objOne.logOut();
        // Drop the reference, forget to cleanup:
        new TerminationConditionEx(true);
        // Force garbage collection and finalization:
        System.gc();
    }
}

class TerminationConditionEx {

    boolean loggedIn = false;

    TerminationConditionEx (boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn) {
            System.out.println("Error: still logged in");
        }
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}
