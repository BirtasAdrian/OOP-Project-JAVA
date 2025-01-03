import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Phone phoneSamsung = new Phone("Samsung", "S22", 8, 1199.99);


        Phone phoneIphone = new Phone("Iphone", "12", 8, 2999.99);

        Phone phoneIncomplete = new Phone("Samsung", "a15");

        Phone phoneIncomplete2 = new Phone("Samsung", "a15", 4);

        System.out.println(phoneSamsung);
        System.out.println(phoneIphone);
        System.out.println(phoneIncomplete);
        System.out.println(phoneIncomplete2);


        ArrayList<Phone> phones = new ArrayList<>(Arrays.asList(phoneIncomplete, phoneIncomplete2));
        phones.add(phoneSamsung);
        phones.add(phoneIphone);

        for(Phone phone : phones){
            phone.call();
        }

}
    }