public class Cleaner extends Staff{

    public Cleaner(String name, int salary) {
        super(name, salary);
    }

    public void clean(){
        System.out.println(this.name + " is cleaning");
    }

    @Override

    public String toString() {
        return "Cleaner{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
