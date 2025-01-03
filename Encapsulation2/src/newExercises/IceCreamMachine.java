package newExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamMachine {

    private ArrayList<String> flavors = new ArrayList<>(Arrays.asList("chocolate", "vanilla", "strawberry"));

    public void prepareIceCream(String desiredFlavor){
        boolean exists = false;
        for(String flavor: flavors){
            if(desiredFlavor.equalsIgnoreCase(flavor)){
                exists = true;
            }
        }

        if(exists){
            System.out.println("Your Ice Cream with " + desiredFlavor + " flavor is ready");
        }else{
            System.out.println("We're sorry we don't have this flavor");

        }
    }

    public void addFlavor(String newFlavor){
        flavors.add(newFlavor);
    }
}
