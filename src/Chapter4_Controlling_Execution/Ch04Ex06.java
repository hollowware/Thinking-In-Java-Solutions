/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4_Controlling_Execution;

/**
 * Exercise 6: (2) Modify the two test( ) methods in the previous two programs
 * so that they take two extra arguments, begin and end, and so that testval is
 * tested to see if it is within the range between (and including) begin and
 * end.
 */
public class Ch04Ex06 {

    static String test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end) {
            return "range between";
        } else {
            return "out of range";
        }
    }

    public static void main(String[] args) {
        
        System.out.println(test(5,1,10));
        System.out.println(test(5,6,10));
        System.out.println(test(5,5,10));
        
        
    }
}
