/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3_Operators;

/**(2) Create a class called Dog containing two Strings: name and says. In
main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who
says, “Wurf!”). Then display their names and what they say. 
 */
public class Ch03Ex05 {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Spot", "Ruff!");
        Dog dogo = new Dog("Scruffy", "Wurf!");
        System.out.println(dog.name + " says - " + dog.says);
        System.out.println(dogo.name + " says - " + dogo.says);
        
    }
}

class Dog {
    
    String name;
    String says;
    
    public Dog (String name, String says) {
        this.name = name;
        this.says = says;
    }
    
}
