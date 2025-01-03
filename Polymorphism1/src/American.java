public class American extends Citizen{

    public American(String name) {
        super(name);
    }

    @Override
    public void greetings() {
        System.out.println(this.name + " says hello");
    }
}
