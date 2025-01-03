public class SpicyShawarma extends Shawarma{

    public void addSpicyKetchup(){
        System.out.println("We add spicy ketchup");
    }

    public void addGarlic(){
        System.out.println("We add garilic");
    }

    @Override
    public void prepareShawarma() {
        super.prepareShawarma();
        addSpicyKetchup();
        addGarlic();
    }
}
