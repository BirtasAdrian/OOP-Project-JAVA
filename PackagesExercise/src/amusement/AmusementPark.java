package amusement;

import people.Person;

import java.util.ArrayList;

public class AmusementPark {

    ArrayList<Person> people = new ArrayList<>();

    public void greetCustomer(Person customer){
        System.out.println("Hello " + customer);
    }
}
