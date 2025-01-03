public class Sneakers extends Clothes{
    boolean hasShoelaces;
    public Sneakers(String brand, int price, boolean hasShoelaces) {
        super(brand, price);
        this.hasShoelaces = hasShoelaces;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "hasShoelaces=" + hasShoelaces +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
