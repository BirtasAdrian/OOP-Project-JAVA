public class Main {
    public static void main(String[] args) {

//        Exercise 1

//        ConsolePrinter printer = new ConsolePrinter();
//        printer.printText("Academia Programatorilor");
//        printer.printText("Academia Programatorilor", 4 );

//       Exercises 2

//        Person person = new Person();
//        person.eat("apples");
//        person.eat("Shawarma,", " pears");
//        person.eat("grapes,", " watermelon,", " vegetable soup");

//       Exercises 3

//        InsuranceProcessor.processInsurance(new Insurance());
//        InsuranceProcessor.processInsurance(new Insurance(),true);
//        InsuranceProcessor.processInsurance(new Insurance(), false);

//        Exercises 4

        AcademyProgrammers academyProgrammers = new AcademyProgrammers();
        academyProgrammers.pass("Adrian");
        academyProgrammers.pass("Adrian", "Mircea", "Andrei");

    }

//     1. Write class ConsolePrinter. ConsolePrinter will have the static method printText.
//     which will get a string as a parameter which it will print to the console.
//     Overload the printText method to get our text, and the desired number of prints to the console.

//     2. Create class Person. Person will have a name, and will have the ability to eat, method eat().
//     Overload the eat() method to receive as parameters 1 food, 2 food and 3 food of type String.
//     and display a corresponding message when calling each.

//      3. Create the classes Insurance (property String id) and InsuranceProcessor.
//      Our Processor will have a Process() method, which will receive an Insurance object as a parameter,
//      and displays a corresponding message "Insurance x has been processed"
//      Override the process method to receive another parameter of type boolean aprovedByManager.
//      If the assurance is approved, print an appropriate message. If not.

//      4. Create the AcademyProgrammers class, with the static method pass(String studentName), which will print a message
//      "Student x has graduated from the Programmers Academy."
//      Override the method to be able to receive as many students as the user wants. (hint: use varchar : int
}
