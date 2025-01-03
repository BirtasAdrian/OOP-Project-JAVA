package amusement;

import people.Person;

public class DisneyLand extends AmusementPark {

    @Override
    public void greetCustomer(Person customer) {
        System.out.println("Welcome to DisneyLand amusement park");
        customer.greetings();
    }
}
