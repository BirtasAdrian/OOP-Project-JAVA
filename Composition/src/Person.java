public class Person {

    String firstName;
    String lastName;
    Car car;

    public Person(String firstName, String lastName, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", car=" + car +
                '}';
    }
}
