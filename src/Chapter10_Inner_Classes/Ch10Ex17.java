/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

import java.util.Random;

/**(1) Modify the solution to Exercise 19 from the Interfaces chapter to use
anonymous inner classes. 
 */
interface Game {

    void play();

}

interface GameFactory {

    Game getGame();

}

class CoinToss implements Game {

    Random random = new Random();

    @Override
    public void play() {
        System.out.print("Coin Toss: ");
        switch (random.nextInt(2)) {
            case 0:
                System.out.println("Heads");
                break;
            case 1:
                System.out.println("Tails");
                break;
            default:
                System.out.println("Edge");
        }
    }
    
    static GameFactory gameFactory = () -> new CoinToss();

}

class DiceToss implements Game {
    
    Random random = new Random();

    @Override
    public void play() {
        System.out.println("Dice throw: " + (random.nextInt(6) + 1));
    }
    
    static GameFactory gameFactory = () -> new DiceToss();

}

// Games
public class Ch10Ex17 {
    
    static void playGame(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.play();
    }
    
    public static void main(String[] args) {
        
        playGame(CoinToss.gameFactory);
        playGame(DiceToss.gameFactory);
        
    }
    
}
