/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5_Initialization_Cleanup;

/**
 * Exercise 22: (2) Write a switch statement for the enum in the previous
 * example. For each case, output a description of that particular currency.
 */
class Bank {

    Currency currency;

    public Bank(Currency currency) {
        this.currency = currency;
    }

    public void describe() {
        switch (currency) {
            case FIVE:
                System.out.println("A five euro banknote");
                break;
            case TEN:
                System.out.println("A ten euro banknote");
                break;
            case TWENTY:
                System.out.println("A twenty euro banknote");
                break;
            case FIFTY:
                System.out.println("A fifty euro banknote");
                break;
            case ONE_HUNDRED:
                System.out.println("A one hundred euro banknote");
                break;
            case TWO_HUNDRED:
                System.out.println("A two hundred euro banknote");
                break;
            case FIVE_HUNDRED:
                System.out.println("A five hundred euro banknote");
                break;
        }
    }
}

public class Ch05Ex22 {

    public static void main(String[] args) {

        Bank bankOne = new Bank(Currency.ONE_HUNDRED),
                bankTwo = new Bank(Currency.TWO_HUNDRED),
                        bankThree = new Bank(Currency.FIVE_HUNDRED);
        
        bankOne.describe();
        bankThree.describe();

    }
}
