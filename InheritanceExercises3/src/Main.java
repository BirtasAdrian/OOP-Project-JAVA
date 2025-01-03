public class Main {
    public static void main(String[] args) {

//        Exercise 1

//        TeamLeader teamLeader = new TeamLeader("Florian", 1000);
//        teamLeader.addPeopleInTheTeam(new Programmer("Mircea", 7000));
//        teamLeader.addPeopleInTheTeam(new Programmer("Andrei", 7500));
//        teamLeader.addPeopleInTheTeam(new Programmer("Anton", 8500));
//        teamLeader.addPeopleInTheTeam(new Programmer("Ana", 9000));
//
//        teamLeader.assignWork();
//
//        Cleaner cleaner = new Cleaner("Marian", 5000);
//        cleaner.clean();
//
//        Manager manager = new Manager("Viorel", 10000);
//        manager.raiseSalary(teamLeader, 1500);
//        manager.raiseSalary(cleaner, 500);
//
//        System.out.println(teamLeader);
//        System.out.println(cleaner);
//        System.out.println(manager);


//        Exercise 2


        Sneakers sneakers = new Sneakers("Nike", 600, true);
        Hoodie hoodie = new Hoodie("Puma", 500, false);
        Trousers trousers = new Trousers("Adidas", 500, 4);
        Customer client = new Customer("Florian", 15000);

        client.buyClothes(sneakers);
        client.buyClothes(trousers);
        client.buyClothes(hoodie);

        System.out.println(client);

    }


//    1. Write class Staff, with properties String name and int salary.
//    The Programmer class will inherit the Staff class and will have the code() method.
//    The Cleaner class will inherit the Staff class and will have the clean() method.
//    The TeamLeader class will inherit the Staff class. It will have in its structure a list of programmers called "team" and the method
//    assignWork() method, which will make all programmers in the team write code.
//    The Manager class will inherit the Staff class and will have the method raiseSalary(Staff staff, int amount),
//    which will raise the salary of the employer passed as a parameter by the amount.

//    Test all the functionalities of the program

//    2. The client will ask for the next application:
//    "Our company will sell clothes. All our clothes will share a brand and a price.
//    We will sell trousers, which will have a specific number of pockets.
//    We will sell hoodies, which may or may not have a hood.
//    We will sell sneakers, which may or may not have laces.

//    Our customers will have a name, a budget and a list of clothes purchased,
//    We also want our customers to be able to buy our clothes at any time.

//    Create the app and test the cases.


}
