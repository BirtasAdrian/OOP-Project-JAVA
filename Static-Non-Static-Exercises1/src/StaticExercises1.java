import java.util.ArrayList;
import java.util.Arrays;

public class StaticExercises1 {
    public static void main(String[] args) {


//        Student student1 = new Student("Adrian");
//        Student student2 = new Student("Florin");
//        Student student3 = new Student("Mihai");
//        Student student4 = new Student("Andrei");
//        Student student5 = new Student("Vasile");
//        Student student6 = new Student("Anton");
//        Student student7 = new Student("Alin");
//        Student student8 = new Student("Ana");
//        Student student9 = new Student("Ioana");
//        Student student10 = new Student("Andreea");
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
//        System.out.println(student5);
//        System.out.println(student6);
//        System.out.println(student7);
//        System.out.println(student8);
//        System.out.println(student9);
//        System.out.println(student10);

//        Exercise2:

//        Elev elev1 = new Elev("Adrian", 10);
//        Elev elev2 = new Elev("Florin", 8);
//        Elev elev3 = new Elev("Mihai", 7);
//        Elev elev4 = new Elev("Mircea", 8);
//        Elev elev5 = new Elev("Anton", 6);
//        Elev elev6 = new Elev("Ioana", 7);
//        Elev elev7 = new Elev("Miruna", 6);
//        Elev elev8 = new Elev("Andy", 7);
//        Elev elev9 = new Elev("Carmen", 8);
//        Elev elev10 = new Elev("Ana", 8);
//
//        System.out.println(elev1);
//        System.out.println(elev2);
//        System.out.println(elev3);
//        System.out.println(elev4);
//        System.out.println(elev5);
//        System.out.println(elev6);
//        System.out.println(elev7);
//        System.out.println(elev8);
//        System.out.println(elev9);
//        System.out.println(elev10);
//
//        ArrayList<Elev> elevi = new ArrayList<>(Arrays.asList(elev1, elev2, elev3, elev4, elev5, elev6, elev7, elev8,
//                elev9, elev10));
//
//        Elev.changeSchoolName("School no 135");
//
//        printList(elevi);
//
//        Elev.changeSchoolName("Mihai Eminescu High School");
//        printList(elevi);

//        Exercise 3:

//        T_Shirt tShirt1 = new T_Shirt("black", "XL");
//        T_Shirt tShirt2 = new T_Shirt("blue", "XxL");
//        T_Shirt tShirt3 = new T_Shirt("green", "M");
//
//        System.out.println(tShirt1);
//        System.out.println(tShirt2);
//        System.out.println(tShirt3);
//
//        T_Shirt.changeBranndName("Puma");
//
//        T_Shirt tShirt4 = new T_Shirt("pink", "XL");
//        T_Shirt tShirt5 = new T_Shirt("yellow", "S");
//        T_Shirt tShirt6 = new T_Shirt("white", "L");
//
//        System.out.println(tShirt4);
//        System.out.println(tShirt5);
//        System.out.println(tShirt6);
//    }

//    public static void printList(ArrayList<Elev> elevi){
//        for (Elev elev : elevi){
//            System.out.println(elev);
//        }

        Person person1 = new Person("fName1", "lastname1");
        Person person2 = new Person("fName2", "lastname2");
        Person person3 = new Person("fName3", "lastname3");

        System.out.println(Person.counter);
    }


//    1. Create the Student class. The student will have an int id and a String name.
//    Override the toString method to display all the details of the student.
//    Create 10 students, each with a unique id to be incremented at initialization.

//    2. Create the class Elev, with fields String name, String grade and static String school.
//    Each student will have method : printDetails() and the Student class will have method changeSchoolName().
//    which will change the name of the school in which all students are enrolled.
//    Initialize 10 students and add them to a list.
//    Print all students, change the school name, then print again.

//    3. Create class T-shirt with the following properties: int size, String color.
//    All t-shirts will have the same property: brandName and method changeBrandName(String newName)
//    Initialize 3 t-shirts and print their details.
//    Change the brand name.
//    Initialize 3 more shirts. Print the details of all shirts to the console.

//    4. Create class Person. Each person will have a String firstName and a String lastName.
//    Find a way that at any point in our program, we can display how many Person objects have been
//    initialized.
}
