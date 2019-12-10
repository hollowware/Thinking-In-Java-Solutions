/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**(3) Create a generator class that produces character names (as String
objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
time you call next( ), and loops around to the beginning of the character list when it runs out
of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
LinkedHashSet, and a TreeSet, then print each container. 
 */
class Generator {
    
    static String giveChampName() {
        String [] nameArr = {"Yasuo", "Varus", "Ashe", "Olaf", "Leona", "Braum", "Sion", "Teemo"};
        String randomName = nameArr[new Random().nextInt(nameArr.length)];
        return randomName;
    }
    
}

public class Ch11Ex04 {
    public static void main(String[] args) {
        
        int amount = 15;
        
        String [] arr = new String[amount];
        List<String> list = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        
        for (int i = 0; i < amount; i++) {
            arr[i] = Generator.giveChampName();
            list.add(Generator.giveChampName());
            linkedList.add(Generator.giveChampName());
            hashSet.add(Generator.giveChampName());
            linkedHashSet.add(Generator.giveChampName());
            treeSet.add(Generator.giveChampName());
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
        
    }
}
