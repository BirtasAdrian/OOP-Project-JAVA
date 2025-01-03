public class Automobile {

    String brand;
    String model;
    boolean started;

    public Automobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
        started=false;
    }

    public void startEngine(){
        if(started){
            System.out.println("The automobile is already started");
        }else{
            started=true;
            System.out.println("The automobile started");
        }
    }


    public void stopEngine(){
        if(started){
            started=false;
            System.out.println("We stopped the engine");
        }else{

            System.out.println("The automobile is already stopped");
        }
    }
}
