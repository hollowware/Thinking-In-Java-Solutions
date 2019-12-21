/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (3) Modify StormyInning.java by adding an UmpireArgument exception type and
 * methods that throw this exception. Test the modified hierarchy.
 */
class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends BaseballException {
}

abstract class Inning {

    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Doesn’t actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    } // Throws no checked exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {

    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

// class StormyInning
public class Ch12Ex20 extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:

    public Ch12Ex20()
            throws RainedOut, BaseballException {
    }

    public Ch12Ex20(String s)
            throws Foul, BaseballException {
    }

    public Ch12Ex20(int i) throws UmpireArgument, BaseballException {

    }
    // Regular methods must conform to base class:
//! void walk() throws PopFoul {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
//! public void event() throws RainedOut {}
    // If the method doesn’t already exist in the
    // base class, the exception is OK:

    @Override
    public void rainHard() throws RainedOut {
    }
    // You can choose to not throw any exceptions, 
    // even if the base version does:

    @Override
    public void event() {
    }
    // Overridden methods can throw inherited exceptions:

    @Override
    public void atBat() throws PopFoul {
    }

    public static void main(String[] args) {
        try {
            Ch12Ex20 si = new Ch12Ex20();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new Ch12Ex20();
            Inning b = new Ch12Ex20(1);
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
