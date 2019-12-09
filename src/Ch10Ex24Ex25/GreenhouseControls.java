/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch10Ex24Ex25;

/**
 * (2) In GreenhouseControls.java, add Event inner classes that turn fans on and
 * off. Configure GreenhouseController.java to use these new Event objects.
 * 
 * (3) Inherit from GreenhouseControls in GreenhouseControls.java
to add Event inner classes that turn water mist generators on and off. Write a new version of
GreenhouseController.java to use these new Event objects. 
 */
public class GreenhouseControls extends Controller {
    
    private boolean waterMist = false;
    
    Event waterMistOn(long delayTime) {
        return new Event(delayTime) {

            @Override
            public void action() {
                waterMist = true;
            }

            @Override
            public String toString() {
                return "Water Mist is on";
            }

        };
    }
    
    Event waterMistOff(long delayTime) {
        return new Event(delayTime) {

            @Override
            public void action() {
                waterMist = false;
            }

            @Override
            public String toString() {
                return "Water Mist is off";
            }

        };
    }

    private boolean fan = false;

    Event fanOn(long delayTime) {
        return new Event(delayTime) {

            @Override
            public void action() {
                fan = true;
            }

            @Override
            public String toString() {
                return "Fan is on";
            }

        };
    }
    
    Event fanOff(long delayTime) {
        return new Event(delayTime) {

            @Override
            public void action() {
                fan = false;
            }

            @Override
            public String toString() {
                return "Fan is off";
            }

        };
    }

//    public class FanOn extends Event {
//
//        public FanOn(long delayTime) {
//            super(delayTime);
//        }
//
//        @Override
//        public void action() {
//            // Put hardware control code here to
//            // physically turn on the fan.
//            fan = true;
//        }
//
//        @Override
//        public String toString() {
//            return "Fan is on";
//        }
//    }
//    public class FanOff extends Event {
//
//        public FanOff(long delayTime) {
//            super(delayTime);
//        }
//
//        @Override
//        public void action() {
//            // Put hardware control here to
//            // physically turn off the fan.
//            fan = false;
//        }
//
//        @Override
//        public String toString() {
//            return "Fan is off";
//        }
//    }
    private boolean light = false;

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here to
            // physically turn on the light.
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control here to
            // physically turn off the light.
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }
    private boolean water = false;

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }
    private String thermostat = "Day";

    public class ThermostatNight extends Event {

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            // Put hardware control code here
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }
    // An example of an action() that inserts a
    // new one of itself into the event list:

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }

    public class Restart extends Event {

        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start(); // Rerun each event
                addEvent(e);
            }
            start(); // Rerun this Event
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting system";
        }
    }

    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }
}
