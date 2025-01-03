public class Pencil {

    String color;
    int remainingInk;

    public Pencil(String color) {
        this.color = color;
        remainingInk = 1000;
    }

    public void write(String text){
//        remainingInk -= text.length();
        char[] letters = text.toCharArray();
        for(char c: letters){
//           method isDigit(c) returns true if the character is a number
//           method isLetter(c) returns true if the character is a letter
            if(Character.isDigit(c) || Character.isLetter(c)){
                remainingInk--;
            }
        }
        System.out.println(text);

    }
}
