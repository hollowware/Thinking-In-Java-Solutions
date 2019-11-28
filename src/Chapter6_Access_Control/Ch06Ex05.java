/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6_Access_Control;

/**(2) Create a class with public, private, protected, and package-access
fields and method members. Create an object of this class and see what kind of compiler
messages you get when you try to access all the class members. Be aware that classes in the
same directory are part of the “default” package. 
 */
class MyClass {
    
    public String name = "John";
    private int age = 15;
    protected String color = "Yellow";
    String weather = "Cold";
    
    public int getAge () {
        return age;
    }
    
}

public class Ch06Ex05 {
    public static void main(String[] args) {
        
        MyClass obj = new MyClass();
        System.out.println(obj.name);
        System.out.println(obj.getAge());
        System.out.println(obj.color);
        System.out.println(obj.weather);
        
    }
}
