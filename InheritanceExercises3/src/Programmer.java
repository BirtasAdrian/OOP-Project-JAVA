public class Programmer extends Staff{

    public Programmer(String name, int salary) {
        super(name, salary);
    }

    public void code(){

        System.out.println("The programmer " + this.name + " writes code");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
