/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**
 *
 * @author IX Hero
 */
public class Ch03Ex12 {
    public static void main(String[] args) {
        
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i <<= 10;
        System.out.println(Integer.toBinaryString(i));
        String str = Integer.toBinaryString(i);
        for (int j = 0; j < str.length(); j++) {
            i >>>= 1;
            System.out.println(Integer.toBinaryString(i));
        }
        
    }
}
