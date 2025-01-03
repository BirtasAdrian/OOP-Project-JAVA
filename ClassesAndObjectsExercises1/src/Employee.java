public class Employee {

    String name;
    int yearOfRegistration;
    String address;
    int salary;

    public Employee(String name, int yearOfRegistration, String address, int salary) {
        this.name = name;
        this.yearOfRegistration = yearOfRegistration;
        this.address = address;
        this.salary = salary;
    }

    public void showDetails(){
        System.out.println(name + " \t" + yearOfRegistration + " " + address + "\t " + salary);
    }
}
