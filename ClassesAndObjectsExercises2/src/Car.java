public class Car {

    String brand;
    int year;
    boolean on;

    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
        on = false;
    }

    public void printDetails(){
        System.out.print(brand + " car " + "made in " + year + " is");
        System.out.println(on? " On " : " stopped");

    }

    public void startEngine() {
        if (on) {
            System.out.println("The car is already on");
        } else {
            System.out.println("The car started");
            on = true;
        }
    }

    public void stopEngine(){
        if(on){
            System.out.println("The car has stopped");
            on = false;
        }else{
            System.out.println("The car is already stopped");
        }

    }
}
