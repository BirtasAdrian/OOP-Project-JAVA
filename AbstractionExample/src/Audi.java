public class Audi extends Car{
    public Audi(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Audi accelerate");
    }
}
