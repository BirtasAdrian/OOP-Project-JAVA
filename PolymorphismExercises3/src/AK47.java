public class AK47 extends Shooter{

    public AK47(){
        this.maxRange = 500;
    }

    @Override
    public void shoot() {
        multiShoot();
    }

    public void multiShoot(){
        for (int i = 0; i < 100; i++) {
            System.out.println("BAM BAM BAM BAM");
        }
    }
}
