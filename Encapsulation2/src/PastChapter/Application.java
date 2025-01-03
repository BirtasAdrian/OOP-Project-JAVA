package PastChapter;

public class Application {

    public static void main(String[] args) {

        User user = new User("adrian","passwordtest12");
        System.out.println(user);

//        user.setPassword("ts12");
//        System.out.println(user);
//
//        user.setPassword("testing");
//        System.out.println(user);

        user.addProductInCart("Pants");
        user.addProductInCart("Socks");
        user.addProductInCart("Jeans");

        System.out.println(user.getProductsInCart());

        user.removeProductFromCart("Socks");

        System.out.println(user.getProductsInCart());
    }

//   1. Change the functionality of our application:
//   Password must also be checked
//   It must contain at least two digits in its structure.
//   Test the functionality.

//   2. Change the functionality of our application
//   Password must also be at least 5 digits.
//   Test the functionality.

//   3. Modify the functionality of our application:
//   PastChapter.User will have a String line, named productsInCart.
//   The only way to access the list will be through the addProductToCart(String product)
//   removeProductFromCart(String product) and printCart().
//   Test the functionality.
}
