/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

/**
 *
 * @author IX Hero
 */
class Glyph {

    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {

    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    
    private int center = 2;
    
    RectangularGlyph(int c) {
        center = c;
        System.out.println("RectangularGlyph.RectangularGlyph(), center = " + center);
    }
    
    @Override
    void draw() {
        System.out.println("RectangularGlyph.draw(), radius = " + center);
    }
    
}

// class PolyConstructors
public class Ch08Ex15 {
    public static void main(String[] args) {
        
        new RoundGlyph(5);
        System.out.println("******************");
        new RectangularGlyph(5);
        
    }
}
