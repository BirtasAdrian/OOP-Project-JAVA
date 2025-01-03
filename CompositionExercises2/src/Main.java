public class Main {
    public static void main(String[] args) {

//        Exercise 1

//        Human human = new Human("Andrei", new Heart(), new Stomach(), new Brain());
//
//        System.out.println(human);
//        human.eat();
//        human.read();
//        human.live();
//
//        System.out.println(human);

//        Exercise 2

//        Trainer trainer = new Trainer("Adrian");
//        trainer.addPokemonToCollection(new Pokemon("Pikachu"));
//        trainer.addPokemonToCollection(new Pokemon("Charmander"));
//        trainer.addPokemonToCollection(new Pokemon("Bulbasaur"));
//        trainer.addPokemonToCollection(new Pokemon("Charizard"));
//        trainer.addPokemonToCollection(new Pokemon("Snorlax"));
//
//        trainer.releaseAllPokemons();


//        Exercise 3


        Computer computer = new Computer("Asus", 3500, new Mouse("Logitech", "black", 200),
                new Keyboard("Razer", 300),
                new Monitor("Dell", 24, 1200));

        Computer computer2 = new Computer("Apple", 5000, new Mouse("Asus", "black", 250),
                new Keyboard("Asus", 250),
                new Monitor("LG", 24, 1000));

               computer.printTotalPrice();
               computer2.printTotalPrice();


    }


//    1.Create the Heart class, with the beat() method.
//    Create class Stomach, with boolean property needsFood.
//    Create class Brain, with int property iq.
//    Create class Human with properties String name, Heart heart, Stomach stomach, Brain brain, and methods eat(), read(), live().
//    Each method of the person will influence the state or behavior of its organs.
//    Create a human, call its methods, and constantly print its state.

//    2.Create Pokemon class, with String name property and sayHello() method, which will print the our pokemon name 3 times to the console.
//    Create the Trainer class, with String name property, ArrayList<Pokemon> pokemons,
//    method addPokemonToCollection(Pokemon pokemon) and method releaseAllPokemons().
//    All trainer pokemon will greet when they are removed from the pokeball.
//    Generate a trainer to which you add 5 pokemons. Release all pokemon.


//    3. Create class Monitor, with properties String brand, int diagonal and int price.
//    Create class Keyboard, with properties String brand and int price.
//    Create class Mouse, with properties String brand, String color and int price.
//    Create class Computer, with properties String brand, int price, Mouse mouse, Keyboard keyboard and Monitor monitor.
//    The computer class will also have a non-static method printTotalPrice(),
//    which will calculate and print the sum of all product prices.
//    Generate two computers, each with different parts, then print the price of both.
}
