import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Exercises 1

//        ArrayList<Award> awards = new ArrayList<>(Arrays.asList(
//
//                new Award("Andrei", 10),
//                new Award("Mihai", 10),
//                new Award("Ionela", 10)
//        ));
//
//        ArrayList<StudentNormal> studentNormals  = new ArrayList<>(Arrays.asList(
//
//                new StudentNormal("Ana", 7),
//                new StudentNormal("Mihnea", 6),
//                new StudentNormal("Anton", 8)
//        ));
//
//        ArrayList<Failed> fell  = new ArrayList<>(Arrays.asList(
//
//                new Failed("Mira", 4),
//                new Failed("Gigel", 3),
//                new Failed("Mirel", 4)
//        ));
//
//        for(Award award : awards){
//            award.thank();
//        }
//
//        for(StudentNormal studentNormal : studentNormals){
//            studentNormal.read();
//        }
//
//        for(Failed failed : fell){
//            failed.learn();
//        }

//       Exercises 2

        Bus bus = new Bus("Mercedes", "Benz", 30);

        Tesla tesla = new Tesla("Tesla", "3");

        for(int i = 0;  i < 35; i++){
            bus.addPassenger();
        }

        bus.startEngine();
        bus.stopEngine();

        tesla.startEngine();
        tesla.charge();
        for(int i = 0;  i< 12; i++){
            tesla.drive();
        }

        tesla.charge();
        tesla.drive();
        tesla.stopEngine();

    }


//    1.Create the class Student, with the properties String name and int Grade
//    Create the classes Award, NormalStudent, and Failed, each inheriting the class Student
//    The award student will have the thank() method, the normal student will have the read() method, and the student that failed
//    will have the learn() method
//    Create 3 students of each type and add them to specific lists. Make all students call their particular methods.

//    2.Create class Automobile, with String property model, boolean started and methods startEngine(). stopEngine()
//    Each method will stop and start the car depending on the "started" field
//    Create the Bus class to sample the Automobile. Bus will have properties int maxPassengers, int currentPassengers
//    and the addPassengers() method
//    Create the Tesla class to inherit the Automobile. The car will have the property int batteryPercentage, which can vary between
//    0 and 100.
//    It will also have the drive() and charge() methods.
//    Each time the car is driven, the battery will drop 10%. Every time it is charged, the battery will fill up.
//    Create a bus and a Tesla and call all their features.
}
