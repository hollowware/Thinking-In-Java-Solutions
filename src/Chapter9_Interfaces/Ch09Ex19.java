/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

import java.util.Random;

/**
 * (3) Create a framework using Factory Methods that performs both coin tossing
 * and dice tossing.
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

}

class CoinTossFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new CoinToss();
    }

}

class DiceToss implements Game {
    
    Random random = new Random();

    @Override
    public void play() {
        System.out.println("Dice throw: " + (random.nextInt(6) + 1));
    }

}

class DiceTossFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new DiceToss();
    }

}

// Games
public class Ch09Ex19 {
    
    static void playGame(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.play();
    }
    
    public static void main(String[] args) {
        
        playGame(new CoinTossFactory());
        playGame(new DiceTossFactory());
        
    }
    
}
