import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//       Exercise 1 and 2

//        Dog dog1 = new Dog("Max", 8);
//        Dog dog2 = new Dog("Maya", 5);
//        Dog dog3 = new Dog("Puky", 7);
//
//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(dog1);
//        dogs.add(dog2);
//        dogs.add(dog3);
//
//        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(
//                new Cat("Runa", 5),
//                new Cat("Mira", 6),
//                new Cat("Elina", 9)
//        ));
//
//        ArrayList<Parrot> parrots = new ArrayList<>(Arrays.asList(
//                new Parrot("Miguel", 2),
//                new Parrot("Coco", 6),
//                new Parrot("Dudu", 7)
//        ));
//
//        for(Dog dog : dogs){
//            dog.bark();
//            dog.eat();
//        }
//        System.out.println("   ");
//
//        for(Cat cat : cats){
//            cat.miaw();
//            cat.eat();
//        }
//        System.out.println("   ");
//
//        for(Parrot parrot : parrots){
//            parrot.eat();
//            parrot.talk("Hi all");
//
//        }

//        Exercise 3 and 4

        Superman superman = new Superman("Superman", "Cark Kent");
        Batman batman = new Batman("Batman", "Bruce Wayne");
        Flash flash = new Flash("Flash", "Berry Allen");
        KidFlash kidflash = new KidFlash("KidFlash", "Wally West");
        TornadoTwins tornadoTwins = new TornadoTwins("TornadoTwins", "Anonymous");


        superman.attack();
        superman.fly();

        batman.attack();
        batman.useGadgets();

        flash.attack();
        flash.timeTravel();
        flash.speedRun();

        kidflash.attack();
        kidflash.savePerson();
        kidflash.speedRun();


    }

//    1. Write class Animal, with properties String name, int age and method eat(),
//    Write child class Dog, with method bark()
//    Write the child class Cat, with the method miaw()
//    Write child class Parrot, with method talk(String whatToSay)

//    2. Create 3 animals of each breed and add them to specific lists.
//    Make all animals eat.
//    Make all dogs bark, cats meow, and parrots talk.

//    3. Create the Hero class, with properties String name, String hiddenIdentity and attack() method.
//    Create the Superman child class, and add the fly() method to it.
//    Create the Batman child class and add the useGadgests() method to it.
//    Create the Speedster child class and add the speedRun() method to it.
//    The Speedster class will have three child classes: Flash, kidFlash and TornadoTwins.
//    Flash will have the timeTravel() method, kidFlash savePerson, and TornadoTwins doubleRun().


//    4. Create an instance of each hero and call up all its features.



}
