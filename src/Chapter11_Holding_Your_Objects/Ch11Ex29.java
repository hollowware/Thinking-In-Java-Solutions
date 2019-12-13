/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.PriorityQueue;

/**
 *
 * @author IX Hero
 */
class Empty {
    
    private int num;
    
    public Empty(int num) {
        this.num = num;
    }
    
}

public class Ch11Ex29 {
    public static void main(String[] args) {
        
        PriorityQueue<Empty> pqe = new PriorityQueue();
        int count = 1;
        while (count <= 5) {
            // java.lang.ClassCastException
            pqe.offer(new Empty(count));
            count++;
        }
        
    }
}
