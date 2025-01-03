public class Pistol extends Shooter{

    public Pistol(){
        this.maxRange=100;
    }

    @Override
    public void shoot(){
        System.out.println("The pistol hit the target at a distance of " + maxRange +  " meters");
    }
}
