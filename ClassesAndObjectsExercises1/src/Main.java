public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Adrian", 22, "0757588956");
        student1.call("0755896598");
        student1.call("0759896555");

        Employee employee1 = new Employee("Florin", 2010, "Bucuresti", 10000);
        Employee employee2 = new Employee("Andrei", 2011, "Timisoara", 12000);
        Employee employee3 = new Employee("Mihai", 2012, "Bucuresti", 1000);

        employee1.showDetails();
        employee2.showDetails();
        employee3.showDetails();

    }
}


    // 1. Create a class called Student with String name and int age variable.
    // Allocate the age value with 22 and the name value with Adrian by creating a Student class object.

    // Modify the Student class, adding a String field telephoneNumber. Create the call method that will receive as parameter a
    // String number. The method will display the following text: "Student x, having the telephone number Y, made a call to the number
    // phone number z"

    // 3. Write a program that displays the information (name, year of registration, salary, address) of three employees
    // by creating a class called Employee. The display must be as follows:

    //  Name   Year of Joining  Address
    // Robert  1994             64 C - WallStreet
    // Sam     2000             68 D - WallStreet
    // John    1999             26 B - WallStreet

