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

/**(4) Add Null Objects to RegisteredFactories.java. 
 */
interface Factory3<T> {

    T create();
}

interface Null {}

class Part3 {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Class<? extends Part3>> partClasses = new ArrayList<>();

    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partClasses.add(FuelFilter3.class);
        partClasses.add(AirFilter3.class);
        partClasses.add(CabinAirFilter3.class);
        partClasses.add(OilFilter3.class);
        partClasses.add(FanBelt3.class);
        partClasses.add(PowerSteeringBelt3.class);
        partClasses.add(GeneratorBelt3.class);
    }
    private static Random rand = new Random(47);

    public static Part3 createRandom() {
        int n = rand.nextInt(partClasses.size());
        Object obj = null;
        try {
            obj = partClasses.get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Part3.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Part3)obj;
    }
    
    static class NullPart extends Part3 implements Null {
        
        private NullPart() {
            super();
        }

        @Override
        public String toString() {
            return "NullPart";
        }
        
    }
    
    public static final Part3 NULL = new NullPart(); 
}

class Filter3 extends Part3 {
}

class FuelFilter3 extends Filter3 {
    // Create a Class Factory for each specific type:

    public static class Factory
            implements Chapter14_TypeInformation.Factory3<FuelFilter3> {

        @Override
        public FuelFilter3 create() {
            return new FuelFilter3();
        }
    }
}

class AirFilter3 extends Filter3 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory3<AirFilter3> {

        @Override
        public AirFilter3 create() {
            return new AirFilter3();
        }
    }
}

class CabinAirFilter3 extends Filter3 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory3<CabinAirFilter3> {

        @Override
        public CabinAirFilter3 create() {
            return new CabinAirFilter3();
        }
    }
}

class OilFilter3 extends Filter3 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory3<OilFilter3> {

        @Override
        public OilFilter3 create() {
            return new OilFilter3();
        }
    }
}

class Belt3 extends Part3 {
}

class FanBelt3 extends Belt3 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory3<FanBelt3> {

        @Override
        public FanBelt3 create() {
            return new FanBelt3();
        }
    }
}

class GeneratorBelt3 extends Belt3 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory3<GeneratorBelt3> {

        @Override
        public GeneratorBelt3 create() {
            return new GeneratorBelt3();
        }
    }
}

class PowerSteeringBelt3 extends Belt3 {

    public static class Factory
            implements Chapter14_TypeInformation.Factory3<PowerSteeringBelt3> {

        @Override
        public PowerSteeringBelt3 create() {
            return new PowerSteeringBelt3();
        }
    }
}

public class Ch14Ex24 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
