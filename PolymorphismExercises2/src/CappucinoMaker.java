public class CappucinoMaker extends CoffeeMaker{

    public void addMilk(){
        System.out.println("We added milk");
    }

    public void addSugar(){
        System.out.println("We added sugar");
    }

    @Override
    public void prepareCoffee() {
        addCoffee();
        addMilk();
        addSugar();
    }
}
