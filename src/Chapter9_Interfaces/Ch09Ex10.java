/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**
 *
 * @author IX Hero
 */
enum NoteTwo {
    MIDDLE_C
}

interface Playable {

    void play(Note n);
    
}

abstract class InstrumentTwo {

    static final int VALUE = 5;

    abstract void adjust();

    @Override
    public String toString() {
        return "Wind";
    }

}

class WindTwo extends InstrumentTwo implements Playable {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class PercussionTwo extends InstrumentTwo implements Playable {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class StringedTwo extends InstrumentTwo implements Playable {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class BrassTwo extends WindTwo {

    @Override
    public String toString() {
        return "Brass";
    }
}

class WoodwindTwo extends WindTwo {

    @Override
    public String toString() {
        return "Woodwing";
    }
}

public class Ch09Ex10 {
    
    static void tune(Playable i) { 
        //...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        
        Playable[] orchestra = {
            new WindTwo(),
            new PercussionTwo(),
            new StringedTwo(),
            new BrassTwo(),
            new WoodwindTwo()
        };
        tuneAll(orchestra);
    }
}
