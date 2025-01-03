import amusement.DisneyLand;
import amusement.EdenLand;
import people.Person;

public class Main {
    public static void main(String[] args) {

        DisneyLand disneyLand = new DisneyLand();
        EdenLand edenLand = new EdenLand();

        disneyLand.greetCustomer(new Person());
        edenLand.greetCustomer(new Person());



    }

//     Create the packages people and amusement.
//     Introduce in the people package the parent class Person, with the String name property and greetings() method
//     and the child classes Romanian, American and French.
//     Each person will greet you in their native language.
//     Introduce the amusement package amusementPark class, which has a list of type Person, and a greetCustomer
//     (Person person person) method
//     Create the Disneyland and Edenland classes.
//     Each amusement park will greet its customers by printing the text
//     "Welcome to amusement park x", and that customer will greet you back.
//     Test the functionality of the application.

}
