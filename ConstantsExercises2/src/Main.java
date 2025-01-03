public class Main {
    public static void main(String[] args) {

//        Exercise 1

//        Student student = new Student("Adrian","Java");
//
//        student.passYear();
//        student.passYear();
//        student.passYear();
//        student.passYear();

//        Exercise 2

        Teacher teacher = new Teacher("Marius", 35, "Math" );
        Teacher teacher2 = new Teacher("Andrei", 45, "English" );

//        we cannot assign a value to final variable subject
//        teacher.subject = "programming";

        System.out.println(teacher);
        System.out.println(teacher2);

//        Exercise 3

        Mercedes mercedes = new Mercedes();
        Dacia dacia = new Dacia();
        Bmw bmw = new Bmw();

        bmw.startEngine();
        dacia.startEngine();
        mercedes.startEngine();

        bmw.accelerate();
        dacia.accelerate();
        mercedes.accelerate();

        bmw.stopEngine();
        dacia.stopEngine();
        mercedes.stopEngine();


    }

//    1. Create the class Student with the properties String name, int year and String major, set by constructor.
//    Once a name and major have been chosen for the student, they cannot be changed. Create the passYear() method,
//    which modifies the internal structure of a Student. Students can be in years 1-4.
//    Initialize a freshman student, then have them graduate.

//    2. Create the Teacher class, with properties String name, int age, and String subject.
//    A teacher can never change the subject taught.
//    Initialize two teachers, then print their data.

//    3. Create the class Car with the properties String mark, String model, boolean on, and the methods startEngine() and accelerate().
//    Create the Bmw, Dacia and Mercedes child classes. Child classes will not be able to override the startEngine() and stopEngine() methods.
//    But they will have their own implementation of the accelerate() method.
//    Initialize one car of each type, start it and make it accelerate.

}
