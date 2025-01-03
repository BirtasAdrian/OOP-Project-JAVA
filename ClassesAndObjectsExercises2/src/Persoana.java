public class Persoana {
    String name;
    int height;
    int weight;
    int energy;

    public Persoana(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.energy = 10;
    }

    public void eat(){
        System.out.println(name + " ate pizza");
        weight++;
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
        energy++;
    }

    public void exercise(){
        System.out.println(name + " does exercises");
        weight--;
        energy--;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", energy=" + energy +
                '}';
    }
}
