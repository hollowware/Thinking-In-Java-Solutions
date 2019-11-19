/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**
 * (2) Write a program that calculates velocity using a constant distance and a
 * constant time.
 */
class Velocity {

    static float count(float s, float t) {
        float v = s / t;
        return v;
    }
}

public class Ch03Ex04 {
    public static void main(String[] args) {
        
        float s = 150;
        float t = 30;
        float v = Velocity.count(s, t);
        System.out.println("s = " + s + ", t = " + t + ", v = " + v);
        s = 152.15f;
        t = 8.3f;
        v = Velocity.count(s, t);
        System.out.println("s = " + s + ", t = " + t + ", v = " + v);
    }

}
