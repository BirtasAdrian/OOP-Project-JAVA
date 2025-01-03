public class Athlete extends Human implements Sportive{
    @Override
    public void run() {
        System.out.println("The athlete runs");
    }

    @Override
    public void eatHealthy() {
        System.out.println("The athlete eats healty");
    }

    @Override
    public void eat() {
        eatHealthy();
    }
}
