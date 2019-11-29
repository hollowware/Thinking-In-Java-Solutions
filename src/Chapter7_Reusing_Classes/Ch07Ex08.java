/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(1) Create a base class with only a non-default constructor, and a derived
class with both a default (no-arg) and non-default constructor. In the derived-class
constructors, call the base-class constructor. 
 */
class Vehicle {
    
    public Vehicle (String name) {
        System.out.println("This car is - " + name);
    }
    
}

class Car extends Vehicle {
    
    public Car () {
        super("Mercedes");
    }
    
    public Car (String name) {
        super(name);
    }
}

public class Ch07Ex08 {
    public static void main(String[] args) {
        
        Car car = new Car();
        Car secondCar = new Car("Ford");
        
    }
}
