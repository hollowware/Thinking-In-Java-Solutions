/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

import java.util.Random;

/**
 * Exercise 3: (1) Modify Exercise 2 so that your code is surrounded by an
 * “infinite” while loop. It will then run until you interrupt it from the
 * keyboard (typically by pressing ControlC).
 */
public class Ch04Ex03 {

    public static void main(String[] args) {

        Random random = new Random();
        // infinite loop. 
        while (true) {
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
