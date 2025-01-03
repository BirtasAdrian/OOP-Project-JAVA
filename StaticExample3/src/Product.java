public class Product {

    static int counter = 1;

    int id;
    String name;
    int price;

    public Product(String name, int price) {
        id=counter++;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
