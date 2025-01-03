public class Failed extends Student{

    public Failed(String name, int grade) {
        super(name, grade);
    }

    public void learn(){

        System.out.println(this.name + " learns to pass");
    }
}
