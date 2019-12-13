/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

import java.util.Arrays;

/**
 * Create you own resumption-like behavior using a while loop that repeats until
 * an exception is no longer thrown.
 */
public class Ch12Ex05 {

    static int[] arr = new int[5];
    static int x = 10;

    public static void main(String[] args) {

        int count = 1;
        while (true) {
            try {
                arr[x] = 1;
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception - " + count);
            }
            x--;
            count++;
        }

    }
}
