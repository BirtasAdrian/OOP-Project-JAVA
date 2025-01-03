public class TShirt {
    final String brand;
    int size;
    String color;

    public TShirt(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
