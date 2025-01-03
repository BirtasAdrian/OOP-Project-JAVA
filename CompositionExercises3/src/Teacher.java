import java.util.ArrayList;

public class Teacher {

    String name;
    ArrayList<Elev> elevi = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public void addStudent(Elev elev){
        elevi.add(elev);
    }

    public void addGrade(int index, int grade){
        elevi.get(index).grades.add(grade);
    }

    public void calculateStudentAverage(){
        for(Elev elev : elevi){
            printAverageStudent(elev);
        }
    }

    private static void printAverageStudent(Elev elev) {
        int average = 0;
        for(int grade : elev.grades){
            average+=grade;
        }
        average /= elev.grades.size();
        System.out.println("The average is " + average);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", elevi=" + elevi +
                '}';
    }
}
