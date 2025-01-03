public class Audi extends Car{

    public Audi(String brand, String model){
        super(brand, model);
        System.out.println("We generate Audi");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
