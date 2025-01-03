package Example2;

public class BMW implements Driveable{
    @Override
    public void startEngine() {
        System.out.println("BMW start the enngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW stop the engine");
    }

    @Override
    public void drive() {
        System.out.println("Drive the bmw");

    }
}
