/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_Strings;

/**
 * Analyze SprinklerSystem.toString() in reusing/SprinklerSystem.java to
 * discover whether writing the toString() with an explicit StringBuilder will
 * save any StringBuilder creations.
 */
class WaterSource {

    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Ch13Ex01 {

    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    // appears to create only one StringBuilder: (using javap -c)

    @Override
    public String toString() {
        return "valve1 = " + valve1 + " "
                + "valve2 = " + valve2 + " "
                + "valve3 = " + valve3 + " "
                + "valve4 = " + valve4 + " "
                + "i = " + i + " " + "f = " + f + " "
                + "source = " + source;
    }

    public static void main(String[] args) {
        Ch13Ex01 sprinklers = new Ch13Ex01();
        System.out.println(sprinklers);
    }
}
