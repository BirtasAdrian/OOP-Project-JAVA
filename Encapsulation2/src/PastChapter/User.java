package PastChapter;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;

    private ArrayList<String> productsInCart;


    public User(String username, String password) {
        checkUsername(username);
        checkPassword(password);
        productsInCart = new ArrayList<>();
    }

    public void addProductInCart(String newProduct){
        productsInCart.add(newProduct);
    }

    public void removeProductFromCart(String product){
        productsInCart.remove(product);
    }

    public ArrayList<String> getProductsInCart() {
        return productsInCart;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        checkUsername(username);
    }

    public void setPassword(String password) {
        checkPassword(password);
    }

    private void checkUsername(String username) {
        if(username.length()>=5){
            this.username= username;
        }else{
            System.out.println("The username needs to have at least 5 characters");
        }
    }

    private void checkPassword(String password) {
        boolean passwordMeetsRequirments = true;
        char[] letterpassword = password.toCharArray();
        int digitsNumber = 0;
        for(char c  : letterpassword){
            if(Character.isDigit(c)){
                digitsNumber++;
            }
        }
        if(digitsNumber < 2){
            System.out.println("Password needs to contain at least 2 digits");
            passwordMeetsRequirments = false;
        }
        if(password.length()<5){
            System.out.println("The password must contain at least 5 characters");
            passwordMeetsRequirments = false;
        }
        if (passwordMeetsRequirments){
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "PastChapter.User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", productsInCart=" + productsInCart +
                '}';
    }
}
