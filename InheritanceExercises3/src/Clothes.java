public class Clothes {

    String brand;
    int price;


    public Clothes(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
