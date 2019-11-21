/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

import java.util.Random;

/**Exercise 2: (2) Write a program that generates 25 random int values. For each value,
use an if-else statement to classify it as greater than, less than, or equal to a second
randomly generated value.
 */
public class Ch04Ex02 {
    public static void main(String[] args) {
        
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            int firstNum = random.nextInt();
            int secondNum = random.nextInt();
            if (firstNum > secondNum) {
                System.out.println("first num bigger");
            } else if (firstNum < secondNum) {
                System.out.println("second num bigger");
            } else {
                System.out.println("equal");
            }
        }
        
    }
}
