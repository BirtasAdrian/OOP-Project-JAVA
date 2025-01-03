public class Main {

    public static void main(String[] args) {

//        Exercise 1

//        Hero hero1 = new Hero("Catwoman", 1000, 200);
//        Hero hero2 = new Hero("Spiderman", 2000, 400);
//
//        Villain villain1 = new Villain("Scorpion", 2500, 300);
//        Villain villain2 = new Villain("Venom", 3500, 400);
//
//        hero1.setEnemy(villain1);
//        hero2.setEnemy(villain2);
//
//        villain1.setEnemy(hero2);
//        villain2.setEnemy(hero1);
//
//        hero1.attack();
//        hero2.attack();
//        villain1.attack();
//        villain2.attack();
//
//        System.out.println(hero1);
//        System.out.println(hero2);
//        System.out.println(villain1);
//        System.out.println(villain2);

//        Exercise 2

//        Teacher teacher = new Teacher("Florin");
//
//        Elev elev = new Elev("Adrian");
//        Elev elev2 = new Elev("Florin");
//        Elev elev3 = new Elev("Mircea");
//
//        elev.grades.add(10);
//        elev.grades.add(9);
//        elev.grades.add(8);
//
//        elev2.grades.add(9);
//        elev2.grades.add(8);
//        elev2.grades.add(7);
//
//        elev3.grades.add(6);
//        elev3.grades.add(9);
//        elev3.grades.add(10);
//
//        teacher.addStudent(elev);
//        teacher.addStudent(elev2);
//        teacher.addStudent(elev3);
//
//        teacher.calculateStudentAverage();

//        Exercise 3

        Town town1 = new Town("Bucharest");
        Town town2 = new Town("Paris");

        LocalAttraction localAttraction1 = new LocalAttraction("Arch of Triumph", 44281119, 26042463);
        LocalAttraction localAttraction2 = new LocalAttraction("Versailles Palace", 484816999, 184152);
        LocalAttraction localAttraction3 = new LocalAttraction("Palace of the Parliament", 442539, 260515);

        town1.addAttraction(localAttraction1);
        town1.addAttraction(localAttraction3);

        town2.addAttraction(localAttraction2);

        town1.printLocalAttractions();
        System.out.println("...");
        town2.printLocalAttractions();
    }


//    1. Create class Hero, with String name, int health and int attack.
//    Create class Villain, with String name, int health and int attack.
//    Any Hero will have in its structure an "enemy" Villain, and a Villain will have in its structure an "enemy" Hero.
//    Any hero will have an attack() method, in which it attacks its enemy, the villain, by dropping the points corresponding to the attack from its life
//    Any villain will have an attack() method, in which he attacks his enemy, the hero, by dropping the corresponding attack points from his life.
//    Generate two heroes and two villains, set the rivalries with a setRival(*) method specific to each class
//    which takes an enemy type object and passes it to our object structure
//    Start a fight.

//    2. Create class Elev, with properties String name, ArrayList<Integer> grades.
//    Create class Teacher, with properties String name, List<Elev> elevi, method addGrade(int index, int grade),
//    which sets the elev's grade to the index position in the internal list of elevi and the calculateAverage() method,
//    which calculates and prints the grades of all its elevi.

//    3. Create class LocalAttraction, with properties String name, int coordinateX, int coordinateY.
//    Create class Town, with properties String name, ArrayList<LocalAttraction> localAttractions
//    and the methods addAtraction(LocalAttraction localAttraction) and displayAttractions().
//    Create two cities to add between 2 and 4 localAttractions to.
//    Print the attractions of each city.

}
