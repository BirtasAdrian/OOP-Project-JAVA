public class SecondClassPassenger extends Passenger{

    public SecondClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println("the passenger " + this.name + " got peanuts and has decent space ");

    }
}
