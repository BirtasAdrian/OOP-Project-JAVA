import java.util.ArrayList;

public class Elev {

    String name;
    ArrayList<Integer> grades=new ArrayList<>();

    public Elev(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
