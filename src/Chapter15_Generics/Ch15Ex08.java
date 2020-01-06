/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

import java.util.Iterator;
import java.util.Random;

/**
 * (2) Following the form of the Coffee example, create a hierarchy of
 * StoryCharacters from your favorite movie, dividing them into GoodGuys and
 * BadGuys. Create a generator for StoryCharacters, following the form of
 * CoffeeGenerator. *
 */
class StoryCharacter {

    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class GoodGuy extends StoryCharacter {

}

class BadGuy extends StoryCharacter {

}

class Jason extends GoodGuy {

}

class Batman extends BadGuy {

}

class StoryCharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter> {

    Class[] types = {Jason.class, Batman.class};

    private static Random rand = new Random();

    public StoryCharacterGenerator() {
    }

    // For iteration:
    private int size = 0;

    public StoryCharacterGenerator(int size) {
        this.size = size;
    }

    @Override
    public StoryCharacter next() {
        try {
            return (StoryCharacter) types[rand.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    class StoryCharacterIterator implements Iterator<StoryCharacter> {
        
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacter next() {
            count--;
            return StoryCharacterGenerator.this.next();
        }

        @Override
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    };

    @Override
    public Iterator<StoryCharacter> iterator() {
        return new StoryCharacterIterator();
    }

}

public class Ch15Ex08 {

    public static void main(String[] args) {
        
        StoryCharacterGenerator gen = new StoryCharacterGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (StoryCharacter c : new StoryCharacterGenerator(5)) {
            System.out.println(c);
        }
    }
}
