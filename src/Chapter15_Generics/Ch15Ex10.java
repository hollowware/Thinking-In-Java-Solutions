/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

/**(1) Modify the previous exercise so that one of f( )’s arguments is non-parameterized.
 */
public class Ch15Ex10 {

    public <T, U> void f(T t, U u, String str) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(str.getClass().getName());
    }

    @Override
    public String toString() {
        return "GenericMethods";
    }

    public static void main(String[] args) {
        
        Ch15Ex10 obj = new Ch15Ex10();
        obj.f(8, "Luck", "Luck");
        obj.f("Luck", true, "Luck");
        obj.f(1.01f, 11111111111111L, "Luck");
        
        
    }
}
