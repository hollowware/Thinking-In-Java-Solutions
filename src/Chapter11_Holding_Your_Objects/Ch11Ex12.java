/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * (3) Create and populate a List<Integer>. Create a second List<Integer>
 * of the same size as the first, and use ListIterators to read elements from
 * the first List and insert them into the second in reverse order. (You may
 * want to explore a number of different ways to solve this problem.)
 */
class Populate {

    void populateList(List<Integer> list, int listSize) {
        for (int i = 1; i <= listSize; i++) {
            list.add(i);
        }
    }
}

public class Ch11Ex12 {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList();
        List<Integer> secondList = new ArrayList();

        Populate pp = new Populate();
        pp.populateList(firstList, 15);
        pp.populateList(secondList, 15);

        ListIterator<Integer> itOne = firstList.listIterator();
        ListIterator<Integer> itTwo = secondList.listIterator();
        while (itOne.hasNext()) {
            itOne.next();
        }
        while (itTwo.hasNext()) {
            itTwo.next();
            itTwo.set(itOne.previous());
        }

        System.out.println(firstList);
        System.out.println(secondList);

    }
}
