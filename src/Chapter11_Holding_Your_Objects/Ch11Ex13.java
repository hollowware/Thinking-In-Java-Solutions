/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Holding_Your_Objects;

import Ch10Ex24Ex25.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**(3) In the innerclasses/GreenhouseController.java example, the
class Controller uses an ArrayList. Change the code to use a LinkedList instead, and use
an Iterator to cycle through the set of events. 
 */
class Controller {

    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            Iterator<Event> it = eventList.iterator();
            while (it.hasNext()) {
                if (it.next().ready()) {
                    System.out.println(it.next());
                    it.next().action();
                    eventList.remove(it.next());
                }
            }
        }
    }
}
