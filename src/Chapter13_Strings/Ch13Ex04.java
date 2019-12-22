/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.Formatter;

/**(3) Modify Receipt.java so that the widths are all controlled by a single set of
constant values. The goal is to allow you to easily change a width by changing a single value
in one place. 
 */
// Receipt
public class Ch13Ex04 {
    
    private static final String FORMAT_ONE = "%-15s %5s %10s";
    private static final String FORMAT_TWO = "%-15.15s %5d %10.2f";
    private static final String FORMAT_THREE = "%-15s %5s %10.2f";
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format(FORMAT_ONE + "\n", "Item", "Qty", "Price");
        f.format(FORMAT_ONE + "\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(FORMAT_TWO + "\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(FORMAT_THREE + "\n", "Tax", "", total * 0.06);
        f.format(FORMAT_ONE + "\n", "", "", "-----");
        f.format(FORMAT_THREE + "\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Ch13Ex04 receipt = new Ch13Ex04();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
