/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(1) Repeat Exercise 9 using an anonymous inner class. 
 */
interface Inter3 {

    void run(String str);

}

class Run3 {

    Inter3 getInter() {
        return new Inter3() {
            
            @Override
            public void run(String str) {
                System.out.println(str);
            }
            
        };
    }

}

public class Ch10Ex13 {
    public static void main(String[] args) {
        
        Run run = new Run();
        run.getInter().run("Inner Method");
        
    }
}
