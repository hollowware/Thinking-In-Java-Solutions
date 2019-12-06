/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * (3) Create a class that produces a sequence of chars. Adapt this class so
 * that it can be an input to a Scanner object.
 */
class GoChar {

    private static Random rand = new Random();
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public char next() {
        char ch = alphabet.charAt(rand.nextInt(alphabet.length()));
        return ch;
    }

}

public class Ch09Ex16 extends GoChar implements Readable {

    private int count;

    public Ch09Ex16(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(new Ch09Ex16(20));
        while (scan.hasNext()) {
            System.out.print(scan.next() + " ");
        }
        System.out.println();
    }
}
