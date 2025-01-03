public class Computer {

    String brand;
    int price;
    Mouse mouse;
    Keyboard keyboard;
    Monitor monitor;

    public Computer(String brand, int price, Mouse mouse, Keyboard keyboard, Monitor monitor) {
        this.brand = brand;
        this.price = price;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void printTotalPrice(){
        int TotalPrice = this.price+ mouse.price+ keyboard.price+ monitor.price;
        System.out.println("The computer price is " + TotalPrice);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", monitor=" + monitor +
                '}';
    }
}
