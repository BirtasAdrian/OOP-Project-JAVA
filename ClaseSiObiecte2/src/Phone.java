public class Phone {

    String brand;
    String model;
    int ramMemory;
    double price;

//    This is a constructor, when we instantiate something in main class the constructor will be called

    public Phone (String brand, String model){
        System.out.println("A new phone with the brand " + brand + " was generated");
        this.brand = brand;
        this.model = model;
    }
// A constructor with 3 parameters, brand and model are called from 2 parameters constructor.

    public Phone(String brand, String model, int ramMemory) {
        this(brand, model);
        this.ramMemory = ramMemory;
    }

//    A constructor with 4 parameters, brand, model and ramMemory are called from 3 parameters constructor.
    public Phone(String brand, String model, int ramMemory, double price){
        this(brand, model, ramMemory);
        this.price = price;
    }

    public void call(){
        System.out.println("The " + brand + " phone is calling");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramMemory=" + ramMemory +
                ", price=" + price +
                '}';


    }
}

