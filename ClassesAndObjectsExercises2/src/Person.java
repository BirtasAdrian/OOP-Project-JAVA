public class Person {

    String name;
    int age;
    char sex;
    String address;

    public Person(String name, int age, char sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public void walk(){
        System.out.println(this.name + " walks down the street");

    }

    public void eat(){
        System.out.println(this.name + " eats");

    }

    public void sleep(){
        System.out.println(this.name + " sleeps late");
    }

    public void showDetails(){
        System.out.println("Hi, my name is " + this.name + " I'm " + this.age + " years old " + " and I'm living in "
         + this.address);
    }

}
