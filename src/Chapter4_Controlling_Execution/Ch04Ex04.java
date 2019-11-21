/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

import java.util.Arrays;

/**
 * Exercise 4: (3) Write a program that uses two nested for loops and the
 * modulus operator (%) to detect and print prime numbers (integral numbers that
 * are not evenly divisible by any other numbers except for themselves and 1).
 */
public class Ch04Ex04 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++) {
            int count = 0;
            for (int j = 1; j < (i + 2) / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(i);
            }
        }

    }
}
