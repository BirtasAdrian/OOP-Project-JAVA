public class Bus extends Automobile{

    int maxPassengers;
    int currentPassengers;

    public Bus(String brand, String model, int maxPassengers) {
        super(brand, model);
        this.maxPassengers=maxPassengers;
        this.currentPassengers=0;
    }

    public void addPassenger(){
        if(currentPassengers>maxPassengers){
            System.out.println("The buss is full");
        }else{
            currentPassengers++;
            System.out.println("A passenger boarded ");
        }

    }
}
