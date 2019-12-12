/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author IX Hero
 */
class Gerbil5 {

    private final int gerbilNumber;

    public Gerbil5(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    int getNumber() {
        return gerbilNumber;
    }

    @Override
    public String toString() {
        return "Gerbil4{" + "gerbilNumber=" + gerbilNumber + '}';
    }

}

public class Ch11Ex19 {

    public static void main(String[] args) {

        Map<String, Gerbil5> gerbils = new HashMap();
        gerbils.put("Fuzzy", new Gerbil5(0));
        gerbils.put("Spot", new Gerbil5(1));
        gerbils.put("Speedy", new Gerbil5(2));
        gerbils.put("Dopey", new Gerbil5(3));
        gerbils.put("Sleepy", new Gerbil5(4));
        gerbils.put("Happy", new Gerbil5(5));
        Set<String> hashedKeys = new HashSet(gerbils.keySet());
        System.out.println("HashSet: " + hashedKeys);
        Map<String, Gerbil5> hashedGerbils = new LinkedHashMap();
        for (String name : hashedKeys) {
            hashedGerbils.put(name, gerbils.get(name));
        }
        System.out.println("From HashSet: " + hashedGerbils);
        System.out.println("****************************************");
        Set<String> linkedHashedKeys = new LinkedHashSet(gerbils.keySet());
        System.out.println("LinkedHashSet: " + linkedHashedKeys);
        Map<String, Gerbil5> linkedHashedGerbils = new LinkedHashMap();
        for (String name : linkedHashedKeys) {
            linkedHashedGerbils.put(name, gerbils.get(name));
        }
        System.out.println("From LinkedHashSet: " + linkedHashedGerbils);

    }
}
