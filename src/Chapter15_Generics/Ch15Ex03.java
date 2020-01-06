/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

/**
 * Create and test a SixTuple generic.
 */
class SixTuple<A, B, C, D, E, F> {

    public final A first;
    public final B second;
    public final C third;
    public final D fourth;
    public final E fifth;
    public final F sixth;

    public SixTuple(A first, B second, C third, D fourth, E fifth, F sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
    }

    @Override
    public String toString() {
        return "SixTuple{" + "first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + ", fifth=" + fifth + ", sixth=" + sixth + '}';
    }

}

public class Ch15Ex03 {

    static SixTuple<String, Integer, String, Integer, String, Integer> f() {
        return new SixTuple<>("hi", 47, "yo", 56, "deum!", 99);
    }
    
    public static void main(String[] args) {
        
        SixTuple st = f();
        System.out.println(st);
        
    }

}
