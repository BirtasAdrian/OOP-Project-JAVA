public class Student {

    String name;
    int age;
    String telephoneNumber;

    public Student(String name, int age, String telephoneNumber){
        this.name = name;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
    }

    public void call(String telephoneNumber){
        System.out.println("Student " + name + " having the telephone number " + this.telephoneNumber + " made a call to the number "
         + telephoneNumber);
    }
}
