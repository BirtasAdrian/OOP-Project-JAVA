package amusement;

import people.Person;

public class EdenLand extends AmusementPark {

    @Override
    public void greetCustomer(Person customer) {
        System.out.println("Welcome to EdenLand amusement park");
        customer.greetings();
    }
}
