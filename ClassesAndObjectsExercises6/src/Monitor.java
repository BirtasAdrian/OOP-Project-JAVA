public class Monitor {

    boolean on;
    double diagonal;

    public Monitor(double diagonal) {
        this.diagonal = diagonal;
    }

    public void pressPowerButton(){
        if(on){
            System.out.println("We turned off the monitor");
            on = false;
        }else{
            System.out.println("We turned on the monitor");
            on = true;
        }

    }
}
