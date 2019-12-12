/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Fill a LinkedHashMap with String keys and objects of your choice. Now extract
 * the pairs, sort them based on the keys, and reinsert them into the Map.
 */
class Lion {

    private int id;

    public Lion(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Lion{" + "id=" + id + '}';
    }

}

public class Ch11Ex24 {

    public static void main(String[] args) {
        
        // original container:
        Map<String, Lion> map = new LinkedHashMap();
        map.put("Mufasa", new Lion(0));
        map.put("Simba", new Lion(1));
        map.put("Jerk", new Lion(2));
        
        // sorted keys:
        Set<String> stringSet = new TreeSet(map.keySet());
        // temp container:
        Map<String, Lion> mTemp = new LinkedHashMap();
        Iterator<String> it = stringSet.iterator();
        // put sorted keys and values into temp container
        while (it.hasNext()) {
            String key = it.next();
            Lion value = map.get(key);
            map.remove(key);
            mTemp.put(key, value);
        }
        // get sorted list of temp keys:
        Set<String> stringSet2 = new TreeSet(mTemp.keySet());
        // move sorted entrys back to map:
        Iterator<String> it2 = stringSet2.iterator();
        while (it2.hasNext()) {
            String key = it2.next();
            Lion value = mTemp.get(key);
            mTemp.remove(key);
            map.put(key, value);
        }
        // done with temp:
        mTemp.clear();
        System.out.println("Sorted map: " + map);

    }
}
