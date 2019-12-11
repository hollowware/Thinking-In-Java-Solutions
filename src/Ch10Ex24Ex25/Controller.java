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
public class Controller {

    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) 
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
