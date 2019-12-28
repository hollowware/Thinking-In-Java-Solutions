/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

import java.util.Scanner;

/**(2) Create a class that contains int, long, float and double and String
fields. Create a constructor for this class that takes a single String argument, and scans that
string into the various fields. Add a toString( ) method and demonstrate that your class
works correctly. 
 */
public class Ch13Ex20 {
    
    private int i;
    private long l;
    private float f;
    private double d;
    private String str;

    public Ch13Ex20(String str) {
        Scanner scan = new Scanner(str);
        i = scan.nextInt();
        l = scan.nextLong();
        f = scan.nextFloat();
        d = scan.nextDouble();
        this.str = scan.next();
    }

    @Override
    public String toString() {
        return "Ch13Ex20{" + "i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", str=" + str + '}';
    }
    
    public static void main(String[] args) {
        
        Ch13Ex20 obj = new Ch13Ex20("17 56789 2.7 3.61412 hello");
        System.out.println(obj);
        
    }
    
}
