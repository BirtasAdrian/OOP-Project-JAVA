import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//    Exercises 1

//        ArrayList<Car>cars = new ArrayList<>(Arrays.asList(
//                new Dacia("Sandero", 120),
//                new Bmw("5 series", 200),
//                new Mercedes("Benz", 190)
//        ));
//
//        for (Car car : cars){
//            car.reachMaxSpeed();
//        }


//    Exercises 2

        ArrayList<Plane> airplanes = new ArrayList<>();
        airplanes.add(new JetPlane());
        airplanes.add(new NormalPlane(30));
        airplanes.add(new PaperPlane());

        for(Plane avion : airplanes){
            avion.fly();
        }

    }

//    1.Create parent class Car and child classes Dacia, Mercedes, Bmw.
//    Each car will have the String property model, int maxSpeed and the method reachMaxSpeed().
//    The Bmw will reach maximum speed in 10 seconds.
//    Mercedes will reach maximum speed in 15 seconds.
//    The Dacia will have the additional crushEngine() method. It will reach top speed in 20 seconds, at which point
//    the engine will stall and a corresponding message will be displayed.
//    Add one car of each type in a list, and make all cars reach maximum speed.




//    2. Create class Plane, with property maxPassengers and method fly().
//    The JetPane class will always have a maximum of 2 passengers and will fly at high speed.
//    The NormalPlane class will have a maximum number of passengers set by the constructor, which cannot be less than 30.
//    When the plane flies, it will fly at normal speed.
//    The PaperPlane class will always have 0 passengers. The moment our paper planes fly, they will fly
//    slowly
//    Add one plane of each declared type to a list, and make all planes fly.


}
