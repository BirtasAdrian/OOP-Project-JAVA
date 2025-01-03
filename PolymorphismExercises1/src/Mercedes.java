public class Mercedes extends Car{

    public Mercedes(String model, int maxSpeed) {
        super(model, maxSpeed);


    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("The Mercedes reached top speed in 15 seconds");
    }
}
