import java.sql.SQLOutput;

public class Plane {

    String brand;
    String model;
    boolean isFlying;
    int maxPassengers;
    int passengersNumber;

    public Plane(String brand, String model, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.maxPassengers = maxPassengers;
    }

    public void addPassenger(){
        if(passengersNumber<maxPassengers){
            System.out.println("A passenger got on board");
            passengersNumber++;
        }else{
            System.out.println("The plane is at full capacity ");
        }
    }

    public void fly(){
        if(isFlying || passengersNumber<(maxPassengers/2)){
            System.out.println("The plane can't fly");
        }else{
            System.out.println("The plane has taken flight!");
            isFlying = true;
        }

    }

    public void land(){
        if(isFlying){
            System.out.println("The plane lands");
            isFlying = false;
        }else{
            System.out.println("The plane is already on the ground");
        }

    }
}
