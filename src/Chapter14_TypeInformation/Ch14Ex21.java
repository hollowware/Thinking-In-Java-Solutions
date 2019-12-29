/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

import java.util.Date;

/**
 * (3) Modify SimpleProxyDemo.java so that it measures method-call times.
 */
interface Interface {

    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo {

    static long startTime;
    static long stopTime;
    static long elapsedTime;

    public static void consumer(Interface iface) {
        startTime = System.currentTimeMillis();
        iface.doSomething();
        iface.somethingElse("bonobo");
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " miliseconds");
    }

    public static void main(String[] args) {

        consumer(new RealObject());
        System.out.println();
        consumer(new SimpleProxy(new RealObject()));
        
    }
}
