/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * (3) Modify SimpleDynamicProxy.java so that it measures method-call times.
 */
interface InterfaceTwo {

    void doSomething();

    void somethingElse(String arg);
}

class RealObjectTwo implements InterfaceTwo {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass()
                + ", method: " + method + ", args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        /*
        Stack overflow error,
        Infinite recursion via toString();
        */
//        System.out.println(proxy);
        return method.invoke(proxied, args);
    }
}

// SimpleDynamicProxy class
public class Ch14Ex22Ex23 {
    
    static long startTime;
    static long stopTime;
    static long elapsedTime;

    public static void consumer(InterfaceTwo iface) {
        startTime = System.currentTimeMillis();
        iface.doSomething();
        iface.somethingElse("bonobo");
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " miliseconds");
    }

    public static void main(String[] args) {
        RealObjectTwo real = new RealObjectTwo();
        consumer(real);
        System.out.println();
        // Insert a proxy and call again:
        InterfaceTwo proxy = (InterfaceTwo) Proxy.newProxyInstance(
                InterfaceTwo.class.getClassLoader(),
                new Class[]{InterfaceTwo.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
