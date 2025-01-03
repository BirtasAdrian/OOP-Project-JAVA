public class Main {
    public static void main(String[] args) {

        Audi audi = new Audi("Audi", "Q7");
        Mercedes mercedes = new Mercedes("Mercedes", "Vito");



        audi.startEngine();

        mercedes.brand= "Mercedes";
        mercedes.model="Vito";
        mercedes.startEngine();
        mercedes.accelerate();

        System.out.println(audi);
        System.out.println(mercedes);



    }
}
