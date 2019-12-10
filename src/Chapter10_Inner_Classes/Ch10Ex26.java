/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**(2) Create a class with an inner class that has a non-default constructor
(one that takes arguments). Create a second class with an inner class that inherits from the
first inner class.
 */
class Evening {
    
    class Inner {
        
        private String game;
        
        public Inner(String game) {
            this.game = game;
        }

        @Override
        public String toString() {
            return "Inner{" + "game=" + game + '}';
        }
        
    }
    
}

class LateEvening {
    
    class LateInner extends Evening.Inner {
        
        public LateInner (Evening e) {
            e.super("League Of Legends");
        }
        
    }
    
}

public class Ch10Ex26 {
    public static void main(String[] args) {
        
        Evening evening = new Evening();
        LateEvening lateE = new LateEvening();
        LateEvening.LateInner lateIn = lateE.new LateInner(evening);
        System.out.println(lateIn);
        
    }
}
