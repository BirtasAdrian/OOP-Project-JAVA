public class FirstClassPassenger extends Passenger{


    public FirstClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println("The Passenger " + this.name + " got peanuts, champagne and has space");

    }
}
