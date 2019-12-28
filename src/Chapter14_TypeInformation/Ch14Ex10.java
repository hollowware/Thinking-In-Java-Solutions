/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

/**
 * (3) Write a program to determine whether an array of char is a primitive type
 * or a true Object.
 */
public class Ch14Ex10 {

    static char[] arr;

    public static void main(String[] args) {

        char[] charArr = new char[5];
        System.out.println(charArr.getClass().getSuperclass());
        System.out.println(charArr instanceof Object);

        // NullPointerException, default value of an Object
        try {
            System.out.println(arr);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Cought");
        }
    }
}
