public class Phone {

    static int numberGeneratedPhones = 0;

    String brand;
    String model;


    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberGeneratedPhones++;
    }
}
