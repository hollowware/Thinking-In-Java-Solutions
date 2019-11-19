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
public class Ch02Ex16 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
}

/**
 * that class creates type Tree
 */
class Tree {

    /**
     * field storing height of the tree
     */
    private int height;

    /**
     * constructor with no arguments
     */
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /**
     * constructor taking an int argument which is assigned to height
     */
    Tree(int initialHeight) {
        this.height = initialHeight;
        System.out.println("Creating new Tree that is "
                + this.height + " feet tall");
    }

    /**
     * method printing height of the tree
     */
    void info() {
        System.out.println("Tree is " + this.height + " feet tall");
    }

    /**
     * method printing string argument and height of the tree
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + this.height + " feet tall");

    }
}
