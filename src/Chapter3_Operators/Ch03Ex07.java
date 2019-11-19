/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

import java.util.Random;

/**Exercise 7: (3) Write a program that simulates coin-flipping.  
 */
public class Ch03Ex07 {
    public static void main(String[] args) {
        
        Random random = new Random();
        int num = random.nextInt();
        System.out.println(num);
        if ((num % 2) == 0)
            System.out.println("Jackpot!");
        else 
            System.out.println("Container.");
        
    }
}
