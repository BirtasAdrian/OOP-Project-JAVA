public class PaperPlane extends Plane{

    public PaperPlane() {
        super(0);
    }

    @Override
    public void fly() {
        System.out.println("The plane flies slowly");
    }
}
