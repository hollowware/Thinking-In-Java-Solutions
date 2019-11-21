/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**
 * Exercise 11: (4) Modify the previous exercise so that your finalize( ) will
 * always be called.
 */
public class Ch05Ex11 {

    public static void main(String[] args) {
        TerminationConditionExSecond objOne = new TerminationConditionExSecond(true);
        TerminationConditionExSecond objTwo = new TerminationConditionExSecond(true);
        new TerminationConditionExSecond(true);
        // Proper cleanup: log out of bank1 before going home:
        objOne.logOut();
        // Forget to logout of bank2 and unnamed new bank
        // Attempts to finalize any missed banks:
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        // using deprecated since 1.1 method:
        System.runFinalizersOnExit(true);
    }
}

class TerminationConditionExSecond {

    boolean loggedIn = false;

    TerminationConditionExSecond(boolean logStatus) {
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
