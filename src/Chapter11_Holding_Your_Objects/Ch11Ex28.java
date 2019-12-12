/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.PriorityQueue;
import java.util.Random;

/**Fill a PriorityQueue (using offer()) with Double values created using 
* java.util.Random, then remove the elements using poll() and display them.
 */
public class Ch11Ex28 {
    public static void main(String[] args) {
        
        PriorityQueue<Double> pq = new PriorityQueue();
        int count = 1;
        for (int i = 0; i < 50; i++) {
            Random random = new Random();
            pq.offer(random.nextDouble());
            System.out.println(count + ": " + pq.poll());
            count++;
        }
        
    }
}
