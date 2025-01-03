public class Student {

    final String name;
    int year;
    final String major;

//    We generate a constructor to cover name and major values


    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        year=1;
    }

    public void passYear(){
        if(year<4){
            System.out.println("The student has passed in year"+ ++year);
        }else{
            System.out.println("The student graduated ");
        }
    }
}
