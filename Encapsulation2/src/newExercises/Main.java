package newExercises;

public class Main {
    public static void main(String[] args) {


        IceCreamMachine iceCreamMachine = new IceCreamMachine();
        iceCreamMachine.prepareIceCream("Chocolate");
        iceCreamMachine.prepareIceCream("Vanilla");
        iceCreamMachine.prepareIceCream("Strawberry");
        iceCreamMachine.prepareIceCream("cinnamon");


        iceCreamMachine.addFlavor("cinnamon");

        iceCreamMachine.prepareIceCream("Chocolate");
        iceCreamMachine.prepareIceCream("Vanilla");
        iceCreamMachine.prepareIceCream("Strawberry");
        iceCreamMachine.prepareIceCream("cinnamon");

    }

//   1. Create the IceCreamMachine class, with the following fields:
//   We will have a list of type String, in which we will pass the flavors of our machine: chocolate, vanilla, strawberry, etc.
//   Our class will have the prepareIceCream(String desiredFlavor) method
//   Our ice cream machine will be able to prepare ice cream only if our customer
//   enters as parameter a valid flavor from our machine structure.
//   Test the functionalities.

//   2. Modify the functionality of our class: add the method addFlavor(String newFlavor),
//   which will add a new type of ice cream to our machine.
//   Test the functionality of the application.


}
