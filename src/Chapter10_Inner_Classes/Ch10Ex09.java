/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**
 * (1) Create an interface with at least one method, and implement that
 * interface by defining an inner class within a method, which returns a
 * reference to your interface.
 */
interface Inter {

    void run(String str);

}

class Run {

    Inter getInter() {
        class Inner implements Inter {

            @Override
            public void run(String str) {
                System.out.println(str);;
            }
            
        }
        return new Inner();
    }

}

public class Ch10Ex09 {
    public static void main(String[] args) {
        
        Run run = new Run();
        run.getInter().run("Inner Method");
        
    }
}
