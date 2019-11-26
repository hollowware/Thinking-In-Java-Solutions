/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**Exercise 21: (1) Create an enum of the least-valuable six types of paper currency. Loop
through the values( ) and print each value and its ordinal( ). 
 */

enum Currency {
    
    FIVE, TEN, TWENTY, FIFTY, ONE_HUNDRED, TWO_HUNDRED, FIVE_HUNDRED
    
}

public class Ch05Ex21 {
    public static void main(String[] args) {
        
        for (Currency currency : Currency.values()) {
            System.out.println(currency + " - " + currency.ordinal());
        }
        
    }
}
