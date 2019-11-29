/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**Exercise 10: (1) Modify the previous exercise so that each class only has non-default
constructors. 
 */
class Component4 {

    public Component4(int num) {
        System.out.println("Component4");
    }
}

class Component5 {

    public Component5(int num) {
        System.out.println("Component5");
    }
}

class Component6 {

    public Component6(int num) {
        System.out.println("Component6");
    }
}

class RootRoot {

    Component4 com1;
    Component5 com2;
    Component6 com3;
    
    public RootRoot(int num) {
        System.out.println("RootRoot");
    }

}

class StemStem extends RootRoot {

    Component4 com4;
    Component5 com5;
    Component6 com6;
    
    public StemStem(int num) {
        super(num);
        System.out.println("StemStem");
    }
    
}

public class Ch07Ex10 {

    public static void main(String[] args) {

        StemStem stem = new StemStem(15);
    }

}
