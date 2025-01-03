import java.util.Scanner;

public class EspressoMaker extends CoffeeMaker{

    Scanner sc = new Scanner(System.in);

    public void addMilk(){
        System.out.println("Would you like milk in espresso?(yes OR no)");
        String answer = sc.nextLine();
        if (answer.equals("yes")){
            System.out.println("We added milk to espresso");
        }else if(answer.equals("no")){
            System.out.println("We didn't add milk to the espresso");
        }else{
            System.out.println("You did not enter a valid answer");
        }
    }

    public void makeItDouble(){
        System.out.println("Would you like a double espresso?(yes OR no)");
        String answer = sc.nextLine();
        if (answer.equals("yes")){
            addCoffee();
        }else if(answer.equals("no")){
            System.out.println("we didn't do a double espresso");
        }else{
            System.out.println("You did not enter a valid answer");
        }
    }

    @Override
    public void prepareCoffee() {
        addCoffee();
        addMilk();
        makeItDouble();
    }
}
