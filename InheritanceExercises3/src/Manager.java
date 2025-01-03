public class Manager extends Staff{

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public void raiseSalary(Staff staff, int amount){
        staff.salary+=amount;
        System.out.println("We increased the salary of employee " + staff.name + " with " + amount);

    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
