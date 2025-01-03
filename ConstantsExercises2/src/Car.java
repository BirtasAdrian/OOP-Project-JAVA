public class Car {

    String mark;
    String model;
    boolean on;

    public final void startEngine(){
        if(on){
            System.out.println("The engine is already on");
        }else{
            System.out.println("The engine started");
            on=true;
        }

    }

    public final void stopEngine(){
        if(on){
            System.out.println("The engine is off");
            on=false;
        }else{
            System.out.println("The engine is already off");
        }

    }

    public void accelerate(){
        System.out.println("Accelerate");

    }
}
