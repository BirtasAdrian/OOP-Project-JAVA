public class Main {
    public static void main(String[] args) {


// Exercise 1

//        Laptop laptop1 = new Laptop("Lenovo","g500");
//        Laptop laptop2 = new Laptop("Dell","f550");
//        Laptop laptop3 = new Laptop("Asus","x700");
//
//        Employee employee1 = new Employee("Adrian", "Marcus", laptop1);
//        Employee employee2 = new Employee("Marius", "Pop", laptop2);
//        Employee employee3 = new Employee("Mihai", "Toma", laptop3);
//
//        System.out.println(employee1);
//        System.out.println(employee2);
//        System.out.println(employee3);

// Exercise 2

//        Pearson pearson1 = new Pearson("Florin", "Marcus", null);
//        Pearson pearson2 = new Pearson("Ciprian", "Anghel", pearson1);
//        Pearson pearson3 = new Pearson("Anton", "Miron", pearson2);
//
//        System.out.println(pearson1);
//        System.out.println(pearson2);
//        System.out.println(pearson3);

// Exercise 3


//        FamilyMember member1 = new FamilyMember("Adrian", 25);
//        FamilyMember member2 = new FamilyMember("Florin", 22);
//
//        FamilyMember member3 = new FamilyMember("Andrei", 23);
//        FamilyMember member4 = new FamilyMember("Marian", 28);
//
//        member1.addFamilyMember(member2);
//        member1.addFamilyMember(member3);
//        member1.addFamilyMember(member4);
//
//        member1.printMyFamily();
//        member2.printMyFamily();

// Exercise 4

        Car car = new Car("Audi", "Q7",new Engine(3000), new Tire(40), new Tire(40), new Tire(40),
        new Tire(40), new Tire(40));
        System.out.println(car);

        Car car2 = new Car("Bmw", "y7",new Engine(3200), new Tire(40), new Tire(30), new Tire(40),
                new Tire(40), new Tire(40));
        System.out.println(car2);


    }

//    1.Create class Laptop, with fields id (unique for each laptop), String brand and String model. Create class
//    Employee. Each employee will have a first name, last name and laptop.
//    Generate 3 employees, each with their personal laptop, and print the details of each to the console.

//    2.Create the Person class, each person will have a firstName, lastName of type String, and a bestFriend of type Person.
//    Create the printFriendship method, in which each person will print their best friend as
//    "x is best friend with Y", where x and Y are just the firstname of that person.

//    3.Create class FamilyMember, with properties String name, int age and List<FamilyMember> familyMembers.
//    Each familyMember will have an addMember(FamilyMember member) method, which will add a family member to its list.
//    We will also have the printMyFamily() method, which prints all the family details of each person.
//    Test the functionality of the application.

//    4.Create class Tire, with property int Size
//    Create class Engine, with int property capacity
//    Create class Car, with property String brand, String model, Engine engine, Tire tire1, Tire tire2, Tire tire3, Tire tire4,
//    Tire exchange Tire.
//    All car tires must be the same size at initialization. If not, an appropriate message will be displayed.
//    Generate 3 cars, each with different tracks, then print their details.

}
