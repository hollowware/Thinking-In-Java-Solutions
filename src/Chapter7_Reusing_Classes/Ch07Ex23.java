/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**
 * (2) Prove that class loading takes place only once. Prove that loading may be
 * caused by either the creation of the first instance of that class or by the
 * access of a static member.
 */
class G {

    static int j = printInit("G.j initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }

    G() {
        System.out.println("G() constructor");
    }
}

class H extends G {

    static int k = printInit("H.k initialized");

    H() {
        System.out.println("H() constructor");
    }
}

class I {

    static int n = printInitC("I.n initialized");
    static G g = new G();

    I() {
        System.out.println("I() constructor");
    }

    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }
}

class J {

    J() {
        System.out.println("J() constructor");
    }
}

public class Ch07Ex23 extends H {

    static int i = printInit("Ch07Ex23.i initialized");

    Ch07Ex23() {
        System.out.println("Ch07Ex23() constructor");
    }

    public static void main(String[] args) {
        // accessing static main causes loading (and initialization)
        // of A, B, & LoadClass
        System.out.println("hi");
        // call constructors from loaded classes:
        Ch07Ex23 c = new Ch07Ex23();
        // call to static field loads & initializes C:
        System.out.println(I.n);
        // call to constructor loads D:
        J j = new J();
    }
}
