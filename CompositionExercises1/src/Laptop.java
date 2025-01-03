public class Laptop {

    static int idCount=1;

    int id;
    String brand;
    String model;

    public Laptop(String brand, String model) {
        id=idCount++;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
