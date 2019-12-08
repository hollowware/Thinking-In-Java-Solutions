/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(1) Modify the solution to Exercise 18 from the Interfaces chapter to use
anonymous inner classes. 
 */
interface Cycle {
    
    void ride();
    
}

interface CycleFactory {
    
    Cycle getCycle();
    
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Unicycle riding.");
    }
    
    static CycleFactory cycleFactory = () -> new Unicycle();
    
}

class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle riding.");
    }
    
    static CycleFactory cycleFactory = () -> new Bicycle();
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle riding.");
    }
    
    static CycleFactory cycleFactory = () -> new Tricycle();
}

public class Ch10Ex16 {
    
    static void serviceConsumer (CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }
    
    public static void main(String[] args) {
        
        
        serviceConsumer(Unicycle.cycleFactory);
        serviceConsumer(Bicycle.cycleFactory);
        serviceConsumer(Tricycle.cycleFactory);
        
    }
    
}
