public class ConsolePrinter {

    public void printText(String text){
        System.out.println(text);
    }

    public void printText(String text, int repetitionNumber){
        for(int i =0; i<repetitionNumber; i++){
            System.out.println(text);
        }
    }
}
