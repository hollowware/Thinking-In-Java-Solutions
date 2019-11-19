/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2_Objects;

/**
 *
 * @author IX Hero
 */
public class Ch02Ex11 {
    public static void main(String[] args) {
        
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        System.out.println("Color Number = " + rainbow.getColorNumber());
        System.out.println("Hue = " + rainbow.getHue());
        rainbow.changeColor(64);
        rainbow.changeHue(32);
        System.out.println("Color changed: Color Number = " + rainbow.getColorNumber());
        System.out.println("Hue = " + rainbow.getHue());
        
    }
}

class AllTheColorsOfTheRainbow {
    
    private int ColorNumber = 0;
    private int hue = 0;
    
    void changeHue(int h) {
        this.hue = h;
    }
    
    int changeColor(int c) {
        return this.ColorNumber = c;
    }
    
    public int getColorNumber () {
        return ColorNumber;
    }
    
    public int getHue () {
        return hue;
    }
}
