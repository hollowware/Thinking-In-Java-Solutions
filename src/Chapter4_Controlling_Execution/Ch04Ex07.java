/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

/**Exercise 7: (1) Modify Exercise 1 so that the program exits by using the break keyword
at value 99. Try using return instead. 
 */
public class Ch04Ex07 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) {
                return;
            }
        }
        
    }
}
