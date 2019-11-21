/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

import java.math.BigInteger;

/**
 * Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3,
 * 5, 8, 13, 21, 34, and so on, where each number (from the third on) is the sum
 * of the previous two. Create a method that takes an integer as an argument and
 * displays that many Fibonacci numbers starting from the beginning, e.g., If
 * you run java Fibonacci 5 (where Fibonacci is the name of the class) the
 * output will be: 1, 1, 2, 3, 5.
 */
public class Ch04Ex09 {
    
    static void fibonacci (int a) {
        BigInteger [] bigIntArray = new BigInteger[a];
        bigIntArray[0] = BigInteger.ZERO;
        bigIntArray[1] = BigInteger.ONE;
        for (int i = 2; i < bigIntArray.length; i++) {
            bigIntArray[i] = bigIntArray[i - 1].add(bigIntArray[i - 2]);
        }
        for (BigInteger num : bigIntArray) {
            System.out.print(num + " ");
        }
    }
    
    static void fibo (int a) {
        int [] arr = new int [a];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        
        fibonacci(6);
        System.out.println();
        fibo(6);
    }
}
