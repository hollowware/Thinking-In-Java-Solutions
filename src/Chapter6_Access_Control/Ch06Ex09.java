/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6_Access_Control;

/**(2) Create the following file in the access/local directory (presumably in
your CLASSPATH):
// access/local/PackagedClass.java
package access.local;
class PackagedClass {
 public PackagedClass() {
 System.out.println("Creating a packaged class");
 }
}
Then create the following file in a directory other than access/local:
// access/foreign/Foreign.java
package access.foreign;
import access.local.*;
public class Foreign {
 public static void main(String[] args) {
 PackagedClass pc = new PackagedClass();
 }
}
Explain why the compiler generates an error. Would making the Foreign class part of the
access.local package change anything? 
 */
public class Ch06Ex09 {
    
    // PackagedClass is package-access only, so it's non visible in other packages.
    
}
