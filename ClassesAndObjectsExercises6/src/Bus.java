public class Bus {

    String brand;
    int maxPassengers;
    int passengersNumber;
    int maxSpeed;

    public Bus(String brand, int maxPassengers, int maxSpeed) {
        this.brand = brand;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public void addPassenger(){
        if(passengersNumber == maxPassengers){
            System.out.println("We cannot add persons anymore");
        }else{
            System.out.println("A passenger boarded");
            passengersNumber++;
        }

    }

    public void reachNextStation(){
        if(passengersNumber < maxPassengers/2){
            System.out.println("We're going at top speed of " + maxSpeed);
        }else{
            System.out.println("We're going with the speed " + (maxSpeed/2));
        }

    }
}
