/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**(2) Create three interfaces, each with two methods. Inherit a new interface
that combines the three, adding a new method. Create a class by implementing the new
interface and also inheriting from a concrete class. Now write four methods, each of which 
* takes one of the four interfaces as an argument. In main( ), create an object of your class
and pass it to each of the methods. 
 */
interface First {
    
    void firstMeth();
    void firstMethTwo();
    
}

interface Second {
    
    void secondMeth();
    void secondMethTwo();
    
}

interface Third {
    
    void thirdMeth();
    void thirdMethTwo();
    
}

interface Combine extends First, Second, Third {
    
    void newMeth();
    
}

class ConcreteClass {

    @Override
    public String toString() {
        return "ConcreteClass here.";
    }
    
}

class NewClass extends ConcreteClass implements Combine {

    @Override
    public void newMeth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firstMeth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firstMethTwo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void secondMeth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void secondMethTwo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void thirdMeth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void thirdMethTwo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void one(First first) {
        System.out.println("In First");
    }
    
    void two(Second second) {
        System.out.println("In Second");
    }
    
    void three(Third third) {
        System.out.println("In Third");
    }
    
    void four(Combine combine) {
        System.out.println("In Fourth");
    }

    @Override
    public String toString() {
        return "NewClass";
    }
    
}

public class Ch09Ex14 {
    public static void main(String[] args) {
        
        NewClass nc = new NewClass();
        nc.one(nc);
        nc.two(nc);
        nc.three(nc);
        nc.four(nc);
        
    }
}
