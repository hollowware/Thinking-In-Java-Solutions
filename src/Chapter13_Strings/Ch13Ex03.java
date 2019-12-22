/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Modify Turtle.java so that it sends all output to System.err.
 */
public class Ch13Ex03 {

    private String name;
    private Formatter f;

    public Ch13Ex03(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Ch13Ex03 tommy = new Ch13Ex03("Tommy", new Formatter(System.err));
        Ch13Ex03 terry = new Ch13Ex03("Terry", new Formatter(outAlias));
        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
