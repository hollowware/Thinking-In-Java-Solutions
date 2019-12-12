/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*Write a class called Command that contains a String and has a method operation()
* that displays the String. Write a second class with a method that fills a Queue
* with Command objects and returns it. Pass the filled Queue to a method in a third
* class that consumes the objects in the Queue and calls their operation() methods.
 */
class Command {
    
    private int num;
    
    Command (int num) {
        this.num = num;
    }
    
    int getNum() {
        return num;
    }
    
}

class SecondClass {
    
    static Queue<Command> fill() {
        Queue<Command> queue = new LinkedList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            queue.offer(new Command(random.nextInt(20)));
        }
        return queue;
    }
    
}

public class Ch11Ex27 {
    
    static void method(Queue<Command> queue) {
        while (queue.peek() != null) {
            System.out.println(queue.poll().getNum());
        }
    }
    
    public static void main(String[] args) {
        
        method(SecondClass.fill());
        
    }
}
