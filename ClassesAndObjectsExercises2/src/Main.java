public class Main {
    public static void main(String[] args) {

        Person boy = new Person("Adrian", 25, 'M', "Cluj-Napoca");
        Person girl = new Person("Maria", 23, 'F', "Cluj Napoca");

        boy.eat();
        boy.sleep();
        boy.walk();
        boy.showDetails();

        girl.eat();
        girl.sleep();
        girl.walk();
        girl.showDetails();

        Persoana persoana = new Persoana("Adrian", 180, 90 );
        persoana.eat();
        persoana.eat();
        persoana.sleep();
        persoana.exercise();
        persoana.exercise();

        System.out.println(persoana);

        Car audi = new Car("Audi Q7", 2010);
        audi.stopEngine();
        audi.startEngine();

        audi.stopEngine();
        audi.printDetails();
    }

}


    // 1. Create the class Person. This will contain the attributes (fields) name, age, gender, address, and the functionalities
    // (methods) walk(), eat(), sleep().
    // Create 2 objects, a boy and a girl, that access the same attributes and methods, but with different results.
    // The methods will display corresponding text on the console.

    // Display both objects as:
    // "Hi, my name is..., I'm... years old, I live in..." // by accessing the fields
    // "Adrian walks down the street." // by accessing the methods
    // "Maria sleeps late." // Write logic to the other methods too

    // 2. Create the Persoana class with the following fields: name, height, energy, weight, and the following functionalities:
    // eat, learn, sleep, exercise
    // each method will change the internal state of the person.
    // Create a Person object to call each of the 4 methods.
    // Print the structure of the person after calling each method.

    // 3. Create class Car, with the following fields: String brand, String model, int year, boolean on,
    // and the following methods: printDetails() startEngine(), stopEngine();
    // the startEngine and stopEngine methods will do different things depending on the internal state of our car,
    // state that will also change.
    // Create a car and call its methods.
