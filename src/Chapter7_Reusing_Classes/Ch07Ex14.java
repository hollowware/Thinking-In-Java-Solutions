/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(1) In Car.java add a service( ) method to Engine and call this method
in main( ). 
 */
class Engine {

    public void start() {
    }

    public void rev() {
    }

    public void stop() {
    }
    
    void service() {
        System.out.println("Car service");
    }
}

class Wheel {

    public void inflate(int psi) {
    }
}

class Window {

    public void rollup() {
    }

    public void rolldown() {
    }
}

class Door {

    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}

// Car
public class Ch07Ex14 {

    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(),
            right = new Door(); // 2-door

    public Ch07Ex14() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Ch07Ex14 car = new Ch07Ex14();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}
