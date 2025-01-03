public class Main {
    public static void main(String[] args) {


        Radio radio = new Radio("Radio ZU");

        PC pc = new PC("Dell", "I7 14400K", "RTX4080", 16);
        Laptop laptop = new Laptop("Asus", "i7 13000k", "RTX4060", 32);

        radio.start();
        radio.changePost("PROFM");
        radio.stop();

        pc.start();
        pc.stop();

        laptop.start();
        laptop.stop();


    }

//   1. Give the classes station(String marca, int ram, boolean on), laptop(String marca, int ram, boolean on) and Radio (String
//   currentPost),
//   Define the interfaces Startable (with start() method), Stoppable (with stop() method) and Changable (with changePost(String newPost) method)
//   Bind the interface classes and test the functionalities.

//   2. Customer wants to open a toy shop. The toys will have a color to be returned, will be able to move
//   and fly.
//   Valid toys: PlaneToy, CarToy and DollHouse. Define specific classes and interface bindings.
//   Call features.


}
