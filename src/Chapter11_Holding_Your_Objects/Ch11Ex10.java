/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**(2) Change Exercise 9 in the Polymorphism chapter to use an ArrayList to
hold the Rodents and an Iterator to move through the sequence of Rodents. 
 */
class Rodent {

    public void eat() {
        System.out.println("Rodent eat");
    }

    public void hide() {
        System.out.println("Rodent hide");
    }

}

class Mouse extends Rodent {

    @Override
    public void eat() {
        System.out.println("Mouse eat");
    }

    @Override
    public void hide() {
        System.out.println("Mouse hide");
    }

    @Override
    public String toString() {
        return "Mouse";
    }

}

class Squirrel extends Rodent {

    @Override
    public void eat() {
        System.out.println("Squirrel eat");
    }

    @Override
    public void hide() {
        System.out.println("Squirrel hide");
    }
    
    @Override
    public String toString() {
        return "Squirrel";
    }

}

class Hamster extends Rodent {

    @Override
    public void eat() {
        System.out.println("Hamster eat");
    }

    @Override
    public void hide() {
        System.out.println("Hamster hide");
    }
    
    @Override
    public String toString() {
        return "Hamster";
    }

}

public class Ch11Ex10 {

    public static void main(String[] args) {
        
        List<Rodent> rodentList = new ArrayList<>();
        rodentList.add(new Mouse());
        rodentList.add(new Squirrel());
        rodentList.add(new Hamster());
        
        Iterator<Rodent> rodent = rodentList.iterator();
        while(rodent.hasNext()) {
            System.out.println(rodent.next());
        }
        
    }
}
