public class Main {
    public static void main(String[] args) {

//        Exercises 1

//        CappucinoMaker cappucinoMaker = new CappucinoMaker();
//        EspressoMaker espressoMaker = new EspressoMaker();
//
//        cappucinoMaker.prepareCoffee();
//        System.out.println(" ");
//        espressoMaker.prepareCoffee();

//        Exercises 2

        SweetShawarma sweetShawarma = new SweetShawarma();
        SpicyShawarma spicyShawarma = new SpicyShawarma();

        sweetShawarma.prepareShawarma();

        System.out.println(" ");

        spicyShawarma.prepareShawarma();



    }

//   1. Create the CoffeMaker class, with the prepareCoffe() and addCoffe() methods. The addCoffe() method will be called in the
//   prepareCoffe() method.
//   The CappucinoMaker class will inherit the CoffeMaker class, will have the addMilk() and addSugar() methods. When preparing cappuccino it will
//   add coffee, add milk, and then add sugar.
//   The ExpressoMaker class will inherit the CoffeMaker class and will have the addMilk() method, which will ask the user if they want to
//   milk to the espresso and the makeItDouble() method, which will also ask the user if they want a double espresso.
//   When we make an espresso we will add coffee, ask the user if it's a double espresso, and if it is, add again
//   coffee.
//   Prepare a cappuccino and an espresso.


//  2. Create the Shawarma class, with the addMeat(), addFries(), addSalads() methods and the prepareShaorma() method.
//  ShawarmaSweet will extend Shawarma and will have the addKetchupSweet() method. Its preparation will include all existing methods
//  in the class.
//  ShawarmaPicante will extend Shawarma and will have the methods addKetchupPicante() and addGarlic(). Its preparation
//  will include all existing methods.

// Prepare a sweet and a spicy shawarma.

}
