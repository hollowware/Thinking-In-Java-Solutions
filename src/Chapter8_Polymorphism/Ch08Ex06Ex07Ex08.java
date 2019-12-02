/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

import java.util.Random;

/**
 * (1) Change Music3.java so that what( ) becomes the root Object method
 * toString( ). Try printing the Instrument objects using System.out.println( )
 * (without any casting).
 */
enum Note {
    MIDDLE_C
}

class Instrument {

    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return "Instrument{" + '}';
    }

}

class Wind extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    public String toString() {
        return "Wind{" + '}';
    }

}

class Percussion extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }

    @Override
    public String toString() {
        return "Percussion{" + '}';
    }

}

class Stringed extends Instrument {

    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }

    @Override
    public String toString() {
        return "Stringed{" + '}';
    }

}

class Brass extends Wind {

    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    public String toString() {
        return "Brass{" + '}';
    }

}

class Woodwind extends Wind {

    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind{" + '}';
    }

}

class Flute extends Woodwind {

    @Override
    void play(Note n) {
        System.out.println("Flute.play() " + n);
    }

    @Override
    public String toString() {
        return "Flute{" + '}';
    }

}

class RandomInstrumentGenerator {

    private final Random rand = new Random();

    public Instrument next() {
        switch (rand.nextInt(6)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
            case 5:
                return new Flute();
        }
    }
}

public class Ch08Ex06Ex07Ex08 {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }
    
    static RandomInstrumentGenerator rig = new RandomInstrumentGenerator();

    public static void main(String[] args) {

        Instrument[] i = new Instrument[10];
        for (int j = 0; j < i.length; j++) {
            i[j] = rig.next();
        }
        
        for (Instrument inst : i) {
            System.out.println(inst);
        }

//        Instrument[] orchestra = {
//            new Wind(),
//            new Percussion(),
//            new Stringed(),
//            new Brass(),
//            new Woodwind(),
//            new Flute()
//        };
//
//        for (Instrument inst : orchestra) {
//            System.out.println(inst);
//        }
    }
}
