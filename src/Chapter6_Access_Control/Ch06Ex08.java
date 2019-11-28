/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6_Access_Control;

/**
 * Exercise 8: (4) Following the form of the example Lunch.java, create a class
 * called ConnectionManager that manages a fixed array of Connection objects.
 * The client programmer must not be able to explicitly create Connection
 * objects, but can only get them via a static method in ConnectionManager. When
 * the ConnectionManager runs out of objects, it returns a null reference. Test
 * the classes in main( ).
 */
class Connection {

    private Connection() {}
    
    static Connection giveConnection() {
        return new Connection();
    }

}

// Connection Manager
public class Ch06Ex08 {

    static int availableConnections = 10;
    static Connection[] connections = new Connection[availableConnections];

    static void availableConnections() {
        System.out.println("Available Connections - " + availableConnections);
    }

    static Connection makeConnection() {
        if (availableConnections > 0) {
            return connections[--availableConnections];
        } else {
            System.out.println("No available Connections.");
            return null;
        }
    }
    
    // Optional
    static void makeAllAvailableConnections() {
        int count = 1;
        for (Connection connection : connections) {
            connection = Connection.giveConnection();
            System.out.println("Connection created - " + count);
            availableConnections--;
            count++;
        }
    }

    public static void main(String[] args) {
        
        Ch06Ex08.makeAllAvailableConnections();
        Ch06Ex08.makeConnection();
        
    }
}
