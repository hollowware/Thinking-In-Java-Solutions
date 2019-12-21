/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**
 * (2) Show that OnOffSwitch.java can fail by throwing a RuntimeException inside
 * the try block.
 */
class Switch {

    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}

class OnOffException1 extends Exception {}

class OnOffException2 extends Exception {}

// OnOffSwitch class

public class Ch12Ex14Ex15 {

    private static Switch sw = new Switch();

    public static void f()
            throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
//            sw.off();
            throw new RuntimeException();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
            // with finally switch is set to 'off' anyways. 
        } finally {
            sw.off();
        }
    }
}
