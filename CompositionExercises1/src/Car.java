public class Car {

    String brand;
    String model;
    Engine engine;
    Tire tire1;
    Tire tire2;
    Tire tire3;
    Tire tire4;
    Tire exchangeTire;

    public Car(String brand, String model, Engine engine, Tire tire1, Tire tire2, Tire tire3, Tire tire4, Tire exchangeTire) {
        int givenSize = tire1.size;
        if(tire2.size != givenSize || tire2.size != givenSize || tire3.size != givenSize || tire4.size !=givenSize ||
        exchangeTire.size != givenSize){
            System.out.println("Not all tyres are the same size");
        }

        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.tire1 = tire1;
        this.tire2 = tire2;
        this.tire3 = tire3;
        this.tire4 = tire4;
        this.exchangeTire = exchangeTire;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", tire1=" + tire1 +
                ", tire2=" + tire2 +
                ", tire3=" + tire3 +
                ", tire4=" + tire4 +
                ", exchangeTire=" + exchangeTire +
                '}';
    }
}
