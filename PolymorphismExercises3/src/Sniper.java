public class Sniper extends Shooter{

    public Sniper(){
        this.maxRange=2000;
    }

    @Override
    public void shoot() {
        System.out.println("The sniper hit the target at a distance of " + maxRange +  " meters");
    }
}
