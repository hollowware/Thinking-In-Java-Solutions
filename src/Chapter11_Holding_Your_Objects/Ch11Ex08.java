/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * (1) Modify Exercise l so it uses an Iterator to move through the List while
 * calling hop( ).
 */
class Gerbil2 {

    private int gerbilNumber;

    public Gerbil2(int gerbilNumber) {
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

public class Ch11Ex08 {

    public static void display(Iterator<Gerbil2> gb) {
        while (gb.hasNext()) {
            Gerbil2 g = gb.next();
            g.hop();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        List<Gerbil2> list = new ArrayList();

        for (int i = 1; i <= 10; i++) {
            list.add(new Gerbil2(i));
        }
        
        display(list.iterator());
        
//        for (Gerbil2 g : list) {
//            g.hop();
//        }

    }
}
