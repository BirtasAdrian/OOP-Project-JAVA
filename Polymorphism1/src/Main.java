import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Citizen> citizens = new ArrayList<>();

        citizens.add(new American("Josh"));
        citizens.add(new American("Andy"));
        citizens.add(new Romanian("Matei"));
        citizens.add(new Romanian("Marius"));
        citizens.add(new French("Pierre"));
        citizens.add(new French("Mateo"));

        for(Citizen citizen : citizens){
            citizen.greetings();
        }
    }
}
