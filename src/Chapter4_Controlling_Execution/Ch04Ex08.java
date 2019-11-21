/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

/**
 * Exercise 8: (2) Create a switch statement that prints a message for each
 * case, and put the switch inside a for loop that tries each case. Put a break
 * after each case and test it, then remove the breaks and see what happens.
 */
public class Ch04Ex08 {

    public static void main(String[] args) {

        int num = 8;
        for (int i = 0; i < 5; i++) {
            switch (num) {
                case 1:
                    System.out.println("this is one");
                    break;
                case 2:
                    System.out.println("this is two");
                    break;
                case 3:
                    System.out.println("this is three");
                    break;
                case 4:
                    System.out.println("this is four");
                    break;
                default:
                    System.out.println("wrong num");
            }
        }

    }
}
