/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch10Ex24Ex25;

/**
 *
 * @author IX Hero
 */
// GreenhouseController
public class Run {

    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
            gc.new ThermostatNight(0),
            gc.new LightOn(200),
            gc.fanOn(300),
            gc.waterMistOn(300),
//            gc.new FanOn(300),
            gc.new LightOff(400),
            gc.waterMistOff(500),
            gc.fanOff(500),
//            gc.new FanOff(500),
            gc.new WaterOn(600),
            gc.new WaterOff(800),
            gc.new ThermostatDay(1400),};
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        }
        gc.run();
    }
}
