/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8_Polymorphism;

/**
 * (3) Following the example in Transmogrify.java, create a Starship class
 * containing an AlertStatus reference that can indicate three different states.
 * Include methods to change the states.
 */
class AlarmStatus {

    void alarm() {
    }
;

}

class SmallAlert extends AlarmStatus {

    @Override
    void alarm() {
        System.out.println("Small Alert");
    }
}

class NormalAlert extends AlarmStatus {

    @Override
    void alarm() {
        System.out.println("Normal Alert");
    }
}

class HighAlert extends AlarmStatus {

    @Override
    void alarm() {
        System.out.println("High Alert");
    }
}

class Starship extends AlarmStatus {

    AlarmStatus as = new AlarmStatus();

    void changeAlarm(AlarmStatus as) {
        this.as = as;
    }

    void setAlarm() {
        as.alarm();
    }

}

public class Ch08Ex16 {
    public static void main(String[] args) {
        
        Starship st = new Starship();
        st.changeAlarm(new SmallAlert());
        st.setAlarm();
        st.changeAlarm(new NormalAlert());
        st.setAlarm();
        
    }
}
