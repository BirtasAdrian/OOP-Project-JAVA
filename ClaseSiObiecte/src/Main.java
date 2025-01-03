public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Audi";
        car1.yearProduction = 2015;

        System.out.println("My car has the brand " +car1.name);

        car1.name = "Bmw";

        System.out.println("My car has the brand " + car1.name);

        car1.startEngine();

        car1.stopEngine();

        Car car2 = new Car();
        car2.name = "Dacia";
        car2.yearProduction = 2019;

        System.out.println("Car 2 has the brand " + car2.name + ", year production " + car2.yearProduction);
    }
}
