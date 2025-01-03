public class Hoodie extends Clothes{

    boolean hasAHood;
    public Hoodie(String brand, int price, boolean hasAHood) {
        super(brand, price);
        this.hasAHood = hasAHood;
    }

    @Override
    public String toString() {
        return "Hoodie{" +
                "hasAHood=" + hasAHood +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
