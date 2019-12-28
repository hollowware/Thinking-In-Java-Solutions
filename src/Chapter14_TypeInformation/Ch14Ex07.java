/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

/**
 * (3) Modify SweetShop.java so that each type of object creation is controlled
 * by a command-line argument. That is, if your command line is "Java Sweetshop
 * Candy," then only the Candy object is created. Notice how you can control
 * which Class objects are loaded via the commandline argument.
 */
class Candy {

    static {
        System.out.println("Loading Candy");
    }
}

class Gum {

    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {

    static {
        System.out.println("Loading Cookie");
    }
}

// SweetShop Class
public class Ch14Ex07 {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: sweetName");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            System.out.println("Enjoy your " + args[0]);
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find " + args[0]);
        }
    }
}
