public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "y9");
        Person person = new Person("Adrian", "Florian", car1);
        Person person2 = new Person("Marius", "Popescu", new Car("Audi", "Q7"));

        System.out.println(person);
    }


}
