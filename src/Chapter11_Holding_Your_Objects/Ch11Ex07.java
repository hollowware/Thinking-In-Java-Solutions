/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * (3) Create a class, then make an initialized array of objects of your class.
 * Fill a List from your array. Create a subset of your List by using subList(
 * ), then remove this subset from your List.
 */
public class Ch11Ex07 {

    String[] nameArr = {"Yasuo", "Varus", "Ashe", "Olaf", "Leona", "Braum", "Sion", "Teemo"};
    String randomName = nameArr[new Random().nextInt(nameArr.length)];

    @Override
    public String toString() {
        return "Ch11Ex07{" + "randomName=" + randomName + '}';
    }

    public static void main(String[] args) {

        int size = 10;
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Ch11Ex07();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        List<Object> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println("List: " + list);

        List<Object> subList = list.subList(2, 4);
        System.out.println("Sub List: " + subList);

        list.removeAll(subList);

    }
}
