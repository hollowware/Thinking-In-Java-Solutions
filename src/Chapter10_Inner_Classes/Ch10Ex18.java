/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(1) Create a class containing a nested class. In main( ), create an instance
of the nested class. 
 */
class Container {
    
    static class Inner {
        
        private String country = "Italy";
        
        String getCountry () {
            return country;
        }
        
    }
    
    static Inner giveInner () {
        return new Inner();
    }
    
}

public class Ch10Ex18 {
    public static void main(String[] args) {
        
        Container.Inner inner = Container.giveInner();
        System.out.println(inner.getCountry());
        
    }
}
