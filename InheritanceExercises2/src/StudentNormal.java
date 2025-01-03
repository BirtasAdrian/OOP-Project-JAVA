public class StudentNormal extends Student{

    public StudentNormal(String name, int grade) {
        super(name, grade);
    }

    public void read(){
        System.out.println(this.name + " is reading a book");
    }
}
