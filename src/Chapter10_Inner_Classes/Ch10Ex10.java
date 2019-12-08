/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inner_Classes;

/**
 * (1) Repeat the previous exercise but define the inner class within a scope
 * within a method.
 */
interface Inter2 {

    void run(String str);

}

class Run2 {

    Inter2 getInter(String str) {
        if (str.equals("inner")) {
            class Inner implements Inter2 {

                @Override
                public void run(String str) {
                    System.out.println(str);;
                }

            }
            return new Inner();
        } else {
            System.out.println("Go fish");
        }
        return null;
    }

}

public class Ch10Ex10 {

    public static void main(String[] args) {

        Run2 run = new Run2();
        run.getInter("inner").run("Java");

    }
}
