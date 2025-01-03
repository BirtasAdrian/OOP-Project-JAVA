public abstract class Car {

    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void startEngine(){
        System.out.println("We start the engine");
    }

    public abstract void accelerate();

}
