public class Car {

    String model;
    int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void reachMaxSpeed(){
        System.out.println("The car reached top speed ");
    }
}
