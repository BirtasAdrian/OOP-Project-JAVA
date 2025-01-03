import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        test1();

//        test2();

//        test3();

        test4();


    }

        public static void test1(){
            Car car = new Car();
            Convertible convertible = new Convertible();
            MiniVan miniVan = new MiniVan();

            car.describeCar();
            System.out.println(" ");
            convertible.describeCar();
            System.out.println(" ");
            miniVan.describeCar();
    }

    public static void test2(){
        Car car = new Car();
        Convertible convertible = new Convertible();
        MiniVan miniVan = new MiniVan();

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car, convertible, miniVan));
                for(Car masina : cars){
                    car.describeCar();
                    System.out.println(" ");

                }
    }

    public static void test3(){

        Convertible convertible = new Convertible();
        MiniVan miniVan = new MiniVan();

        convertible.shoDetails();
        System.out.println(" ");
        miniVan.shoDetails();
    }

    public static void test4(){
        Car minivan = new MiniVan();
        Car convertible = new Convertible();

        minivan.shoDetails();
        System.out.println(" ");
        convertible.shoDetails();
    }

//    1. Write a class Car and two derived classes ConvertibleCar and MiniVan.

//    2. Declare two methods in the base class, describeCar() and showDetails() that display a text with details to the console.
//    common.

//    3. Call the showDetails() method in the describeCar method.

//    4. Implement the showDetails() method in the convertibleCar class by hiding the method from the base class and defining
//    a new one. (Override the method)

//    5. Implement in MiniVan class the showDetails() method by extending the base class method and modifying
//    the text displayed in the console

//    6. Write a static test1() method in the Program class. In it declare three objects, one of each type
//    class and call the describeCar() method with each object. Call the test1() method in the main method and observe the differences.

//    7. Write a static test2() method in the Program class. In it declare a list of cars, of type Car, containing
//    3 new objects of type of each class. Call the describeCar() method through each object in the list, using a loop.
//    Call the test 2() method. Notice the differences.

//    8. Write a test3() method in the Program class. Declare an object of type ConvertibleCar and another of type MiniVan. Go to
//    showDetails() method through each. Call the test3() method. Notice the differences.

//    9. Write a test4() method in the Program class. Declare an object of type ConvertibleCar and save it in a variable of type
//    Car, and another of type MiniVan and save it also in a variable of type Car. Call the showDetails() method through each.
//    Call the test3() method. Notice the differences.

}
