public class Animal {

    String name;
    int hungerLevel;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("The animal " + name + " makes sounds");

    }

    public final void eat(){
        System.out.println("The animal " + name + "eats");
    }
}
