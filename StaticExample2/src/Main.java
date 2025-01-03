public class Main {

    public static void main(String[] args) {

        Elev elev1 = new Elev("Marius", 17);

        System.out.println(elev1);

        Elev elev2 = new Elev("Andrei", 15);

        System.out.println(elev2);

        Elev.profesor = "Gabriel Popescu";

        Elev elev3 = new Elev("Mircea", 16);

        System.out.println(elev3);


    }
}
