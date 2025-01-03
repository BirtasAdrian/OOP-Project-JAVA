public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Samsung","S22");
        Phone phone2 = new Phone("Xiaomi", "mix3");
        Phone phone3 = new Phone("Xiaomi", "mix2");

        System.out.println("We generated " + Phone.numberGeneratedPhones + " mobile phones");

        Phone phone4 = new Phone("Iphone", "15");

        System.out.println("We generated " + Phone.numberGeneratedPhones + " mobile phones");

        Product product1 = new Product("Pants", 20);
        Product product2 = new Product("Shoes", 10);
        Product product3 = new Product("T-shirt", 12);
        Product product4 = new Product("Coat", 17);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

    }
}
