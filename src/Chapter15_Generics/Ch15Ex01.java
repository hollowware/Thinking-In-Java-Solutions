/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

/**
 * Use Holders with the typeinfo.pets library to show that a Holders that is
 * specified to hold a base type can also hold a derived type.
 */
class Pet {

    @Override
    public String toString() {
        return "Pet";
    }
    
}

class Rat extends Pet {

    @Override
    public String toString() {
        return "Rat";
    }
    
}

class Cat extends Pet {
}

class Holder<T> {

    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

}

public class Ch15Ex01 {
    public static void main(String[] args) {
        
        Holder<Pet> petHolder = new Holder(new Pet());
        Pet pet = petHolder.get();
        System.out.println(pet);
        petHolder.set(new Rat());
        pet = petHolder.get();
        System.out.println(pet);
        
    }
}
