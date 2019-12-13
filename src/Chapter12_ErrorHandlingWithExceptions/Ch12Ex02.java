/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**Define an object reference and initialize it to null. Try to call a method
* through this reference. Now wrap the code in a try-catch clause to catch the
* exception.
 */
class Ref {
    
    public void f() {
        System.out.println("lol");
    }
    
}

public class Ch12Ex02 {
    public static void main(String[] args) {
        
        Ref ref = null;
        
        try {
            ref.f();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Cought");
        }
        
    }
}
