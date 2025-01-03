public class French extends Citizen{

    public French(String name) {
        super(name);
    }

    @Override
    public void greetings() {
        System.out.println(this.name + " says bonjour");
    }
}
