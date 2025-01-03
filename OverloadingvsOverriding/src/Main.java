public class Main {
    public static void main(String[] args) {

        Leopard leopard = new Leopard();
        Snail snail = new Snail();

        leopard.move();
        snail.move();

        Calculator calculator = new Calculator();

        calculator.add(2, 4);
        calculator.add(2,5,6);
    }
}
