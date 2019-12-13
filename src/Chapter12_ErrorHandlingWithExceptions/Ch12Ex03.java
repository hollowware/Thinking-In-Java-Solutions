/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12_ErrorHandlingWithExceptions;

/**Write code to generate and catch an ArrayIndexOutOfBoundsException.
 */
public class Ch12Ex03 {
    
    static void f() {
        int [] arr = new int[5];
        for (int i = 0; i < 6; i++) {
            arr[i] = i;
        }
    }
    
    public static void main(String[] args) {
        
        try {
            f();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Cought");
        }
        
    }
}
