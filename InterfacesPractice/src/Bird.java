public class Bird implements Flayable, Eatable {


    @Override
    public void fly() {
        System.out.println("The bird flies");

    }

    @Override
    public void eat() {
        System.out.println("The bird eats");
    }
}
