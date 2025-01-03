public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the text:");
        String  introducedText = Reader.textRead();
        System.out.println(introducedText);

        System.out.println("Enter the number:");
        int introducerNumber = Reader.numberRead();
        System.out.println(introducerNumber);

        int sum = Computer.sum(10, 20);
        int subtract = Computer.subtract(10,5);
        System.out.println(sum);
        System.out.println(subtract);
    }
}
