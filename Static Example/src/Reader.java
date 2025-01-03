import java.util.Scanner;

public class Reader {

    static Scanner textReader = new Scanner(System.in);
    static Scanner numberReader= new Scanner(System.in);

    public static String textRead(){
        return textReader.nextLine();
    }

    public static int numberRead(){
        return numberReader.nextInt(); 
    }
}
