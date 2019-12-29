/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_TypeInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**(4) A constructor is a kind of factory method. Modify
RegisteredFactories.java so that instead of using an explicit factory, the class object is
stored in the List, and newlnstance( ) is used to create each object. 
 */
interface Factory2<T> {

    T create();
}

class Part2 {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Class<? extends Part2>> partClasses = new ArrayList<>();

    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partClasses.add(FuelFilter2.class);
        partClasses.add(AirFilter2.class);
        partClasses.add(CabinAirFilter2.class);
        partClasses.add(OilFilter2.class);
        partClasses.add(FanBelt2.class);
        partClasses.add(PowerSteeringBelt2.class);
        partClasses.add(GeneratorBelt2.class);
    }
    private static Random rand = new Random(47);

    public static Part2 createRandom() {
        int n = rand.nextInt(partClasses.size());
        Object obj = null;
        try {
            obj = partClasses.get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Part2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Part2)obj;
    }
}

class Filter2 extends Part2 {
}

class FuelFilter2 extends Filter2 {
    // Create a Class Factory for each specific type:

    public static class Factory
            implements Chapter14_TypeInformation.Factory2<FuelFilter2> {

        @Override
        public FuelFilter2 create() {
            return new FuelFilter2();
        }
    }
}

class AirFilter2 extends Filter2 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory2<AirFilter2> {

        @Override
        public AirFilter2 create() {
            return new AirFilter2();
        }
    }
}

class CabinAirFilter2 extends Filter2 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory2<CabinAirFilter2> {

        @Override
        public CabinAirFilter2 create() {
            return new CabinAirFilter2();
        }
    }
}

class OilFilter2 extends Filter2 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory2<OilFilter2> {

        @Override
        public OilFilter2 create() {
            return new OilFilter2();
        }
    }
}

class Belt2 extends Part2 {
}

class FanBelt2 extends Belt2 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory2<FanBelt2> {

        @Override
        public FanBelt2 create() {
            return new FanBelt2();
        }
    }
}

class GeneratorBelt2 extends Belt2 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory2<GeneratorBelt2> {

        @Override
        public GeneratorBelt2 create() {
            return new GeneratorBelt2();
        }
    }
}

class PowerSteeringBelt2 extends Belt2 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory2<PowerSteeringBelt2> {

        @Override
        public PowerSteeringBelt2 create() {
            return new PowerSteeringBelt2();
        }
    }
}

public class Ch14Ex14 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
