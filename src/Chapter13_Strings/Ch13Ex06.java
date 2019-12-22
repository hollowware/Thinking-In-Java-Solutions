/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

/**
 * (2) Create a class that contains int, long, float and double fields. Create a
 * toString( ) method for this class that uses String.format( ), and demonstrate
 * that your class works correctly.
 */
public class Ch13Ex06 {

    private int a;
    private long b;
    private float c;
    private double d;

    public Ch13Ex06(int a, long b, float c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("a = %d\nb = %d\nc = %.16g\nd = %.16g\n", a, b, c, d);
    }

    public static void main(String[] args) {

        Ch13Ex06 x = new Ch13Ex06(2, 45L, 1.2f, 2.7182818289);
        Ch13Ex06 ex = new Ch13Ex06(-2147483648, -9223372036854775808L, 1.1754943508222875E-38f, 2.2250738585072014E-308);
        Ch13Ex06 exMax = new Ch13Ex06(2147483647, 9223372036854775807L, 3.4028234663852886E38f, 1.7976931348623157E308);
        System.out.println(x);
        System.out.println(ex);
        System.out.println(exMax);

    }

}
