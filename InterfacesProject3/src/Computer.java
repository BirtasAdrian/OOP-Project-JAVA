public class Computer implements Startable, Stoppable {

    String brand;
    String processor;
    String gpu;
    int ram;
    boolean on;

    public Computer(String brand, String processor, String gpu, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
        on = false;
    }

    @Override
    public void start() {
        if (on) {
            System.out.println("The computer is on");
        } else {
            System.out.println("We start the computer");
            on = true;
        }
    }

    @Override
    public void stop() {
        if (on) {
            System.out.println("We turned off the computer");
            on = false;
        } else {
            System.out.println("The computer is already turned off");

        }
    }
}