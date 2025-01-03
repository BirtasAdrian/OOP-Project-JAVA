public class Bmw extends Car {


    public Bmw(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("The BMW reached top speed in 10 seconds");
    }
}
