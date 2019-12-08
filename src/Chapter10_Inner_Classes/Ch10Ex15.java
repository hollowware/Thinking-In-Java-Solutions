/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(2) Create a class with a non-default constructor (one with arguments) and
no default constructor (no "no-arg" constructor). Create a second class that has a method
that returns a reference to an object of the first class. Create the object that you return by
making an anonymous inner class that inherits from the first class. 
 */
class CreateClass {
    
    private String country = "Italy";
    
    public CreateClass (String country) {
        this.country = country;
    }
    
    String getCountry () {
        return country;
    }
    
}

class SecondClass {
    
    CreateClass createClass (String country) {
        return new CreateClass(country);
    }
    
}

public class Ch10Ex15 {
    public static void main(String[] args) {
        
        SecondClass sc = new SecondClass();
        String a = sc.createClass("Swiss").getCountry();
        System.out.println(a);
        
    }
}
