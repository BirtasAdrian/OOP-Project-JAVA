import java.util.ArrayList;

public class Customer {

    String name;
    int budget;

    ArrayList<Clothes> purchasedProducts;

    public Customer(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.purchasedProducts=new ArrayList<>();
    }

    public void buyClothes(Clothes clothes){
        if(this.budget >= clothes.price){
            System.out.println("The client " + name + " has bought" + clothes);
            this.purchasedProducts.add(clothes);
            this.budget-= clothes.price;
        }else{
            System.out.println("We don't have enough money to buy " + clothes);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", purchasedProducts=" + purchasedProducts +
                '}';
    }
}
