/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7_Reusing_Classes;

/**(1) Using Chess.java, prove the statements in the previous paragraph. 
 */
class Game {
    
    public Game(int num) {
        System.out.println("Game Constructor.");
    }
    
}

class BoardGame extends Game {
    
    public BoardGame(int num) {
        super(num);
        System.out.println("BoardGame Constructor.");
    }
    
}

class Chess extends BoardGame {
    
    public Chess() {
        super(1);
        System.out.println("Chess Constructor.");
    }
    
}

public class Ch07Ex06 {
    public static void main(String[] args) {
        
        Chess ch = new Chess();
        
    }
}
