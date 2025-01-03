public class Main {
    public static void main(String[] args) {

//        Exercise 1

//        System.out.println(PersonalData.name);
//        System.out.println(PersonalData.firstName);
//        System.out.println(PersonalData.address);

//       Exercise 2

//        TShirt tShirt = new TShirt("Nike", 4, "blue");
//        tShirt.size= 5;
//        tShirt.color= "black";
//
//        System.out.println(tShirt);

//        Exercises 3

//        Lion lion = new Lion("Tomas");
//        Dog dog = new Dog("Puky");
//        Cat cat = new Cat("Pufi");
//
//        lion.makeSound();
//        lion.eat();
//        dog.makeSound();
//        dog.eat();
//        cat.makeSound();
//        cat.eat();

//        Exercises 4

        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();
        Huawey huawey = new Huawey();

        samsung.downloadAppFromStore(" Facebook");
        samsung.makeCall();
        iphone.downloadAppFromStore(" Instagram");
        iphone.makeCall();
        huawey.downloadAppFromStore(" Tiktok");
        huawey.makeCall();


    }

//    1. Write the class PersonalData, which contains the following static constants: name, first name, address.
//    Print all your personal data in the Main class.

//    2. Write class TShirt, with the following properties: String brand, int size, String color.
//    Think about which properties should not be changed and initialize a t-shirt, changing the other properties
//    using the appropriate methods.

//    3. Create the class Animal, with the following properties: String name, int hungerLevel, and methods makeSound() and Eat().
//    Create the child classes Lion, Dog, Cat, restricting the ability to override the eat() method. Each animal instead will
//    make the corresponding sound. Initialize one object of each child data type. Make all the animals eat and
//    make sounds.

//    4. Create the Phone class, with the following properties: String brand, String model, and the methods makeCall(String phoneNumber)
//    and downloadAppFromStore(String appName)
//    Create Samsung, I_Phone and Huawei child classes, restricting the ability to override the makeCall() method
//    Initialize one object of each child data type. Make all phones ring and download an app.

}
