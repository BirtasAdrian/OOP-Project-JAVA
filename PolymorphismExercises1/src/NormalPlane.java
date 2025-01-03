public class NormalPlane extends Plane{


    public NormalPlane(int maxPassengers) {
        super(maxPassengers);
    }

    @Override
    public void fly() {
        System.out.println("The plane flies normally");
    }
}
