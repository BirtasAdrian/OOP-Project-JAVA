public class AcademyProgrammers {

    public void pass(String student){
        System.out.println("The student " + student + " has graduated the Academy of Programmers");
    }

    public void pass(String... students){
        for(String student : students) {
            System.out.println("The student " + student + " has graduated the Academy of Programmers");

        }
    }
}
