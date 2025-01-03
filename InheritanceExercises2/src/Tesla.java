public class Tesla extends Automobile {

    int batteryPercentage;

    public Tesla(String brand, String model) {
        super(brand, model);
        batteryPercentage=100;
    }

    public void drive(){
        if(batteryPercentage>=10){
            System.out.println("Tesla is on the road");
            batteryPercentage-=10;
        }else{
            System.out.println("Tesla is out of battery ");
        }
    }

    public void charge(){
        batteryPercentage=100;

    }


}
