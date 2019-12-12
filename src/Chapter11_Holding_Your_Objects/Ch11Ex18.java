/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Fill a HashMap with key-value pairs. Print the results to show ordering by
 * hash code. Extract the pairs, sort by key, and place the result into a
 * LinkedHashMap. Show that the insertion order is maintained.
 */
class Gerbil4 {

    private final int gerbilNumber;

    public Gerbil4(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    @Override
    public String toString() {
        return "Gerbil4{" + "gerbilNumber=" + gerbilNumber + '}';
    }

}

public class Ch11Ex18 {

    public static void main(String[] args) {

        Map<String, Gerbil4> gerbils = new HashMap();
        gerbils.put("Fuzzy", new Gerbil4(0));
        gerbils.put("Spot", new Gerbil4(1));
        gerbils.put("Speedy", new Gerbil4(2));
        gerbils.put("Dopey", new Gerbil4(3));
        gerbils.put("Sleepy", new Gerbil4(4));
        gerbils.put("Happy", new Gerbil4(5));
        System.out.println(gerbils);
        Set<String> sortedKeys = new TreeSet(gerbils.keySet());
        System.out.println(sortedKeys);
        Map<String, Gerbil4> sortedGerbils = new LinkedHashMap();
        sortedKeys.forEach((name) -> {
            sortedGerbils.put(name, gerbils.get(name));
        });
        System.out.println(sortedGerbils);

    }
}
