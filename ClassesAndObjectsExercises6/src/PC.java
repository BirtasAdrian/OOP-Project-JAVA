public class PC {

    boolean on;
    int ram;
    String processor;

    public PC(int ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    public void pressPowerButton(){
        if(on){
            System.out.println("We turned off the PC");
            on = false;
        }else{
            System.out.println("We turned on the PC");
            on = true;
        }

    }
}
