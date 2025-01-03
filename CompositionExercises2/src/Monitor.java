public class Monitor {

    String brand;
    int diagonal;
    int price;

    public Monitor(String brand, int diagonal, int price) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
