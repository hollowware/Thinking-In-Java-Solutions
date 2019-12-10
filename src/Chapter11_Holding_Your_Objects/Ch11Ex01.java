/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.ArrayList;
import java.util.List;

/**(2) Create a new class called Gerbil with an int gerbilNumber that’s
initialized in the constructor. Give it a method called hop( ) that displays which gerbil
number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the
List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil. 
 */
class Gerbil {
    
    private int gerbilNumber;
    
    public Gerbil(int gerbilNumber) {
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

public class Ch11Ex01 {
    public static void main(String[] args) {
        
        List<Gerbil> list = new ArrayList();
        
        for (int i = 1; i <= 10; i ++) {
            list.add(new Gerbil(i));
        }
        
        for (Gerbil g : list) {
            g.hop();
        }
        
    }
}
