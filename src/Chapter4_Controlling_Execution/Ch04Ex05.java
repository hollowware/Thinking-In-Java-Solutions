/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

/**
 * Exercise 5: (4) Repeat Exercise 10 from the previous chapter, using the
 * ternary operator and a bitwise test to display the ones and zeroes, instead
 * of Integer.toBinaryString( ).
 */
public class Ch04Ex05 {

    static void integerToBinary(int a) {
        if (a == 0) {
            System.out.print(0);
        } else {
            int b = Integer.numberOfLeadingZeros(a);
            a <<= b;
            for (int i = 0; i < 32 - b; i++) {
                int n = (Integer.numberOfLeadingZeros(a) == 0) ? 1 : 0;
                System.out.print(n);
                a <<= 1;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int i = 0xAAAA;
        int j = 0x5555;
        System.out.print("i = ");
        integerToBinary(i);
        System.out.print("j = ");
        integerToBinary(j);
        System.out.print("i & j = ");
        integerToBinary(i & j);
        System.out.print("i | j = ");
        integerToBinary(i | j);
        System.out.print("i ^ j = ");
        integerToBinary(i ^ j);
        System.out.print("~i = ");
        integerToBinary(~i);
        System.out.print("~j = ");
        integerToBinary(~j);

    }
}
