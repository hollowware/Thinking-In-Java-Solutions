/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**
 * (3) Add a proper hierarchy of dispose( ) methods to all the classes in
 * Exercise 9.
 */
class Root2 {

    public Root2(int i) {
        System.out.println("Root2 constructor");
    }

    void dispose() {
        System.out.println("Root2 dispose.");
    }

}

class Component7 extends Root2 {

    public Component7(int i) {
        super(i);
        System.out.println("Drawing Component7");
    }

    @Override
    void dispose() {
        System.out.println("Component7 dispose.");
        super.dispose();
    }
}

class Component8 extends Root2 {

    public Component8(int i) {
        super(i);
        System.out.println("Drawing Component8");
    }

    @Override
    void dispose() {
        System.out.println("Component8 dispose.");
        super.dispose();
    }
}

class Component9 extends Root2 {

    public Component9(int i) {
        super(i);
        System.out.println("Drawing Component9");
    }

    @Override
    void dispose() {
        System.out.println("Component9 dispose.");
        super.dispose();
    }
}

class Line extends Root2 {

    private int start;
    private int end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line: " + start + ", " + end);
    }

    @Override
    void dispose() {
        System.out.println("Erasing Line: " + start + ", " + end);
        super.dispose();
    }

}

public class Ch07Ex12 extends Root2 {
    
    private Component7 com7;
    private Component8 com8;
    private Component9 com9;
    private Line [] lines = new Line [5];
    
    public Ch07Ex12 (int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
        com7 = new Component7(1);
        com8 = new Component8(1);
        com9 = new Component9(1);
        System.out.println("Combined constructor.");
    }
    
    @Override
    public void dispose() {
        com9.dispose();
        com8.dispose();
        com7.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
    }
    
    public static void main(String[] args) {
        
        Ch07Ex12 obj = new Ch07Ex12(1);
        obj.dispose();
        
    }

}
