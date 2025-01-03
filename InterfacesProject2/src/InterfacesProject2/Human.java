package InterfacesProject2;

public class Human implements Swimmable, Eatable{
    @Override
    public void eat() {
        System.out.println("The man eats");
    }

    @Override
    public void swim() {
        System.out.println("The man swims");
    }
}
