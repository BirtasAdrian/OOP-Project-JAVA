package InterfacesProject2_2;

public class Motorola implements TelephoneBehavior{
    @Override
    public void call(String telephoneNumber) {
        System.out.println("Motorola rings the number " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Motorola is charged");

    }
}
