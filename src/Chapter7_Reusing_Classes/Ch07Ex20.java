/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**
 * (1) Show that @Override annotation solves the problem in this section.
 */
class WithFinals {
    // Identical to "private" alone:

    private void f() {
        System.out.println("WithFinals.f()");
    }
    // Also automatically "final":

    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    
//    @Override can't override, compiler sees and error
    private void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

public class Ch07Ex20 {

}
