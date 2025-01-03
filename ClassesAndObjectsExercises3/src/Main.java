import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Phone phone1 = new Phone("Iphone", "7", 32);
    Phone phone2 = new Phone("Iphone", "8", 64);
    Phone phone3 = new Phone("Samsung", "S22", 128);
    Phone phone4 = new Phone("Samsung", "A22", 64);
    Phone phone5 = new Phone("Xiaomi", " Mi Mix 3", 128);

//        System.out.println(phone1);
//        System.out.println(phone2);
//        System.out.println(phone3);
//        System.out.println(phone4);
//        System.out.println(phone5);

//        ArrayList<Robot> robots = new ArrayList<>();
//        Scanner scText = new Scanner(System.in);
//        Scanner scInt = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter the robot name:");
//            String name = scText.nextLine();
//            System.out.println("Enter the value of the attack");
//            int attackValue = scInt.nextInt();
//            System.out.println("Enter the robot material:");
//            String material = scText.nextLine();
//
//            robots.add(new Robot(name, attackValue, material));
//
//        }
//        for (Robot robot : robots){
//            robot.attack();
//        }

        Book harryPotter = new Book("Harry Potter", "J.K.Rowling", 250);
        Book harryPotter2 = new Book("Harry Potter 2", "J.K.Rowling", 300);
        Book harryPotter3 = new Book("Harry Potter 3", "J.K.Rowling", 350);

//        harryPotter.flipPageBackwards();
//        harryPotter.flipPageForward();
//        harryPotter.flipPageForward();
//        harryPotter.flipPageForward();
//        harryPotter.flipPageForward();
//        harryPotter.flipPageForward();
//        harryPotter.printBookState();

        flipTheBook(harryPotter);
        flipTheBook(harryPotter2);
        flipTheBook(harryPotter3);


}

public static void flipTheBook(Book book){
        for(int i = book.currentPageNumber; i < book.totalPageNumber; i++){
            book.flipPageForward();
        }
        book.printBookState();
}

}


    //1. Create the Phone class with the following fields: brand, model, storage(int) //Gb//
    // Create 5 phones and print the details of each object in the console, overriding the toString() method.

    //2. Create Robot class with the following fields: name, attackPower, material and attack() method,
    // method that will use the object fields to print a suitable message.
    // Add 5 robots to a list whose details will be entered from the keyboard.
    // Make all robots in your list attack.

    //3. Create class Book, with the following fields: string name, string author, int totalPageNumber, int currentPageNumber
    // and the methods flipPageForward(), flipPageBackwards() and printBookState()
    // The printBookState() method will print the state of our book as "Book M, written by N, having 0 pages,
    // is open on page P".
    // The flipPageForward() and flipPageBackwards() methods will change the internal state of our book.
    // Hint: a book cannot be flipped if the current page is 1.
    // It also cannot be flipped a page forward if the current page is the last page.
    // Create a book and flip through it.

    //4. Based on the previous exercise, create a method in the Main class that takes a card as a parameter
    //  and flips all its pages. Call the method for 3 different books.
