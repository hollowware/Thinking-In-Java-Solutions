/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch10Ex24Ex25;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IX Hero
 */
// A class from java.util to hold Event objects:
public class Controller {
    // A class from java.util to hold Event objects:

    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) // Make a copy so you’re not modifying the list
        // while you’re selecting the elements in it:
        {
            for (Event e : new ArrayList<>(eventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
            break;
        }
    }
}
