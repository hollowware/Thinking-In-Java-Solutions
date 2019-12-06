/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**
 * (4) Create a class with a method that takes a String argument and produces a
 * result that swaps each pair of characters in that argument. Adapt the class
 * so that it works with interfaceprocessor.Apply.process( ).
 */
interface Processor {

    public String name();

    Object process(Object input);

}

class StringSwaper {

    public String name() {
        return getClass().getSimpleName();
    }

    String swapString(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] ca = new char[s.length()];
        if ((s.length()) % 2 == 0) {
            for (int i = 0; i < s.length(); i += 2) {
                ca[i] = s.charAt(i + 1);
                ca[i + 1] = s.charAt(i);
            }
            return new String(ca);
        } else {
            for (int i = 0; i < s.length() - 1; i += 2) {
                ca[i] = s.charAt(i + 1);
                ca[i + 1] = s.charAt(i);
            }
            ca[s.length() - 1] = s.charAt(s.length() - 1);
            return new String(ca);
        }
    }

}

class StringSwaperAdapter implements Processor {

    StringSwaper stringSwaper;

    public StringSwaperAdapter(StringSwaper stringSwaper) {
        this.stringSwaper = stringSwaper;
    }

    @Override
    public String name() {
        return stringSwaper.name();
    }

    @Override
    public Object process(Object input) {
        return stringSwaper.swapString((String) input);
    }

}

class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

public class Ch09Ex11 {

    public static void main(String[] args) {
        String str = "process";
        Apply.process(new StringSwaperAdapter(new StringSwaper()), str);
    }
}
