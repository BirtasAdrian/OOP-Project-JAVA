public class Dacia extends Car{

    public Dacia(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Dacia reached top speed in 20 seconds");
        crushEngine();
    }

    public void crushEngine(){
        System.out.println("Dacia has stopped");
    }
}
