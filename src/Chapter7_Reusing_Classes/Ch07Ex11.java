/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(3) Modify Detergent.java so that it uses delegation. 

 */
class Detergent2 {

    protected void scrub(String word) {
        System.out.println("Im a scrub method. " + word);
    }
    
    protected void shampoo(String word) {
        System.out.println("Washing head. " + word);
    }

}

public class Ch07Ex11 extends Detergent2 {
    
    Detergent2 d = new Detergent2();
    
    // Delegation Methods
    @Override
    protected void scrub(String word) {
        d.scrub(word);
    }
    
    @Override
    protected void shampoo(String word) {
        d.shampoo(word);
    }
    
    public static void main(String[] args) {
        
        Ch07Ex11 obj = new Ch07Ex11();
        obj.scrub("SCRUB");
        obj.shampoo("SHAMPOO");
        
    }
}
