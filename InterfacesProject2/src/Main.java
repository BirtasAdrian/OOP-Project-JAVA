import InterfacesProject2.Cat;
import InterfacesProject2.Human;
import InterfacesProject2.Submarine;
import InterfacesProject2_2.Iphone;
import InterfacesProject2_2.Motorola;
import InterfacesProject2_2.Nokia;
import InterfacesProject2_2.Samsung;

public class Main {
    public static void main(String[] args) {
//  Exercise 1

//        Cat cat = new Cat();
//        Human human = new Human();
//        Submarine submarine = new Submarine();
//        cat.eat();
//        human.eat();
//        human.swim();
//        submarine.swim();

//    Exercise 2

        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();
        Nokia nokia = new Nokia();
        Motorola motorola = new Motorola();

        samsung.call("0757588986");
        samsung.charge();
        samsung.downloadAppFromStore("Facebook");
        samsung.takeScreenshot();

        iphone.call("0757588986");
        iphone.charge();
        iphone.downloadAppFromStore("Facebook");
        iphone.takeScreenshot();

        nokia.call("0757588969");
        nokia.charge();

        motorola.call("07575889869");
        motorola.charge();


    }

//   1. Declare the classes Human, Cat, Submarine, and the interface swimable, with the void swim() and Eatable,
//   with the void eat() method.
//   Establish the necessary contracts.
//   Initialize an object of type human, cat and submarine. and call specific functionalities.

//  2. The TelephoneBehavior and SmartphoneBehavior interfaces are given.
//  A telephone can ring and be used.
//  A smartphone can ring, be used, take screenshots and download apps from the store.
//  Define the classes Nokia, Motorola, Samsung, and Iphone, and link them to specific interfaces. Test the functionalities.

}
