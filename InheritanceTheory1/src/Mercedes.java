public class Mercedes extends Car{

    boolean autopilot;

    public Mercedes(String brand, String model) {
        super(brand, model);
        System.out.println("We generate Mercedes");
    }

    public void accelerate(){
        System.out.println("The Mercedes is accelerating");
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "autopilot=" + autopilot +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
