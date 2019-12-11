/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * (2) Write a method that uses an Iterator to step through a Collection and
 * print the toString( ) of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */
class Animal {

    String animal;
    
}

class Panda extends Animal {

    private String name = "Panda";

    @Override
    public String toString() {
        return "Panda{" + "name=" + name + '}';
    }

}

class Bear extends Animal {

    private String name = "Bear";

    @Override
    public String toString() {
        return "Bear{" + "name=" + name + '}';
    }

}

class Deer extends Animal {

    private String name = "Deer";

    @Override
    public String toString() {
        return "Deer{" + "name=" + name + '}';
    }

}

public class Ch11Ex11 {

    static void iterate(Collection collection) {
        Iterator<Animal> it = collection.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().toString() + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        ArrayList<Animal> arrayList = new ArrayList();
        arrayList.add(new Panda());
        arrayList.add(new Bear());
        arrayList.add(new Deer());
        LinkedList<Animal> linkedList = new LinkedList();
        linkedList.add(new Panda());
        linkedList.add(new Bear());
        linkedList.add(new Deer());
        HashSet<Animal> hashSet = new HashSet();
        hashSet.add(new Panda());
        hashSet.add(new Bear());
        hashSet.add(new Deer());
        
        iterate(arrayList);
        iterate(linkedList);
        iterate(hashSet);
        
    }

}
