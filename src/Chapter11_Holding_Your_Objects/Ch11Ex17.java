/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Take the Gerbil class in Exercise 1 and put it into a Map instead,
 * associating each Gerbil's name (e.g. "Fuzzy" or "Spot") as a String (the key)
 * for each Gerbil (the value) you put in the table. Get an Iterator for the
 * keySet() and use it to move through the Map, looking up the Gerbil for each
 * key and printing out the key and telling the Gerbil to hop().
 */
class Gerbil3 {

    private int gerbilNumber;

    public Gerbil3(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    int getGerbilNumber() {
        return gerbilNumber;
    }

    void hop() {
        System.out.println(getGerbilNumber());
        System.out.println("Hoping");
    }

}

public class Ch11Ex17 {

    public static void main(String[] args) {
        
        Map<String, Gerbil3> gerbils = new HashMap();
        gerbils.put("Fuzzy", new Gerbil3(0));
        gerbils.put("Spot", new Gerbil3(1));
        gerbils.put("Speedy", new Gerbil3(2));
        gerbils.put("Dopey", new Gerbil3(3));
        gerbils.put("Sleepy", new Gerbil3(4));
        gerbils.put("Happy", new Gerbil3(5));
        Iterator<String> it = gerbils.keySet().iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + ": ");
            gerbils.get(s).hop();
        }
        
    }
}
