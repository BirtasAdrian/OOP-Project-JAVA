public class Elev {

    static String profesor = "Tudor Dumitrescu";

    String name;
    int age;

    public Elev(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profesor=" + profesor +
                '}';
    }
}
