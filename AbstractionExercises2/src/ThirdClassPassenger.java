public class ThirdClassPassenger extends Passenger{


    public ThirdClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println("the passenger " + this.name + " got nothing");
    }
}
