import java.util.ArrayList;

public class Employee {

    static int rang = 500;

    String name;
    int age;
    ArrayList<String> soldProduct = new ArrayList<>();

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sellProduct(String productName){
        soldProduct.add(productName);
        rang++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", soldProduct=" + soldProduct +
                '}';
    }
}
