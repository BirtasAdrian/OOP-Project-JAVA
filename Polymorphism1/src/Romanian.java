public class Romanian extends Citizen{


    public Romanian(String name) {
        super(name);
    }

    @Override
    public void greetings() {
        super.greetings();
        System.out.println(this.name + " says Buna!");
    }
}
