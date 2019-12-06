/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**
 *
 * @author IX Hero
 */
abstract class Base {

    public Base() {
        print();
    }

    abstract void print();

}

class Child extends Base {

    protected int num = 5;

    @Override
    void print() {
        System.out.println(num);
    }

}

public class Ch09Ex03 {

    public static void main(String[] args) {

        /* Process of initialization:
		* 1. Storage for Child s allocated and initialized to binary zero
		* 2. Base() called
		* 3. Child.print() called in Base() (child.num = 0)
		* 4. Member initializers called in order (child.num = 5)
		* 5. Body of Child() called
         */
        Child child = new Child();
        child.print();

    }
}
