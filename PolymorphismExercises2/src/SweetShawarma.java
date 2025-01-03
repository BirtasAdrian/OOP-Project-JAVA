public class SweetShawarma extends Shawarma {

    public void addSweetKetchup(){
        System.out.println("We add sweet ketchup ");
    }

    @Override
    public void prepareShawarma() {
        super.prepareShawarma();
        addSweetKetchup();
    }
}
