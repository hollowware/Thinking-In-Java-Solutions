/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import java.util.Stack;

/**Stacks are often used to evaluate expressions in programming 
* languages. Using net.mindview.util.Stack, evaluate the following
* expression, where '+' means "push the following letter onto the 
* stack," and '-' means "pop the top of the stack and print it":
* "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---"
 */
public class Ch11Ex15 {
    public static void main(String[] args) {
        
        Stack<Character> stack = new Stack();
        stack.add('U');
        stack.add('n');
        stack.add('c');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.add('e');
        stack.add('r');
        stack.add('t');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.add('a');
        stack.add('i');
        stack.add('n');
        stack.add('t');
        stack.add('y');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.add(' ');
        System.out.println(stack.pop());
        stack.add('r');
        stack.add('u');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.add('l');
        stack.add('e');
        stack.add('s');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
}
