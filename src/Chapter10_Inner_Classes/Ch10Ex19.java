/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(2) Create a class containing an inner class that itself contains an inner
class. Repeat this using nested classes. Note the names of the .class files produced by the
compiler. 
 */
class ContainerTwo {
    
    class Inner {
        class DeepInner {
            
            void string() {
                System.out.println("String");
            }
            
        }
        
        DeepInner getDeepInner() {
            return new DeepInner();
        }
    }
    
    Inner getInner() {
        return new Inner();
    }
    
}
public class Ch10Ex19 {
    public static void main(String[] args) {
        
        ContainerTwo ct = new ContainerTwo();
        ContainerTwo.Inner inner = ct.getInner();
        ContainerTwo.Inner.DeepInner deepInner = inner.getDeepInner();
        deepInner.string();
        
    }
}
