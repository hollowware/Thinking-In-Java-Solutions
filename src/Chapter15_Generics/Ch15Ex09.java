/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

/**
 * (1) Modify GenericMethods.java so that f( ) accepts three arguments, all of
 * which are of a different parameterized type.
 */
// GenericMethods
public class Ch15Ex09 {

    public <T, U, V> void f(T t, U u, V v) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(v.getClass().getName());
    }

    @Override
    public String toString() {
        return "GenericMethods";
    }

    public static void main(String[] args) {
        
        Ch15Ex09 obj = new Ch15Ex09();
        obj.f(8, "Luck", 'P');
        obj.f("Luck", true, 50.15);
        obj.f(1.01f, 11111111111111L, obj);
        
        
    }
}
