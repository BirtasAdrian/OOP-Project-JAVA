package InterfacesProject2_2;

public class Nokia implements TelephoneBehavior{


    @Override
    public void call(String telephoneNumber) {
        System.out.println("Nokia rings the number " + telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Nokia is charged");
    }
}
