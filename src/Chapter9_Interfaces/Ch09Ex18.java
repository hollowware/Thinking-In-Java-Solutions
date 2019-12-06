/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**(2) Create a Cycle interface, with implementations Unicycle, Bicycle
and Tricycle. Create factories for each type of Cycle, and code that uses these factories. 
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
    
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
    
}

class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle riding.");
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
    
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle riding.");
    }
}

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
    
}

public class Ch09Ex18 {
    
    static void serviceConsumer (CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }
    
    public static void main(String[] args) {
        
        serviceConsumer(new UnicycleFactory());
        serviceConsumer(new BicycleFactory());
        serviceConsumer(new TricycleFactory());
        
    }
    
}
