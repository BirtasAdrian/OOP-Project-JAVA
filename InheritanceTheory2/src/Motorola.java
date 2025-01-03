public class Motorola extends Cellular{

    boolean clapOpen;

    public Motorola(String number, int price, boolean clapOpen) {
        super(number, price);
        this.clapOpen=clapOpen;
    }

    public void closeCap(){
        if(clapOpen){
            System.out.println("We close the clap");
            clapOpen=false;
        }else{
            System.out.println("We open the clap");
            clapOpen = true;
        }
    }
}
