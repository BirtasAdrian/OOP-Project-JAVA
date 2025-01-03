import java.util.ArrayList;
import java.util.Arrays;

public class Radio {

    boolean on;
    int volume;
    int currentPostIndex;
    ArrayList<String> posts;

    public Radio() {
        currentPostIndex = 1;
        posts = new ArrayList<>(Arrays.asList("MagicFm", "RadioZu", "DigiFm"));
        posts.add("RockFm");
        posts.add("EuropaFm");
    }

    public void turnOn(){
        if(on){
            System.out.println("The radio is already on");
        }else{
            System.out.println("We turned the radio on");
            on = true;
        }

    }

    public void turnOff() {
        if (on) {
            System.out.println("We turned the radio off");
            on = false;
        } else {
            System.out.println("The radio is already off");
        }
    }
        public void turnVolumeUp(){
        if(volume == 10){
            System.out.println("The radio is at maxim volume");
        }else{
            volume++;
            System.out.println("We changed the volume on volume " + volume);
            displayRadioStatus();
        }

    }

    public void turnVolumeDown(){
        if (volume == 0){
            System.out.println("The radio is already on mute");
        }else{
            volume--;
            System.out.println("We changed the volume on the volume " + volume);
            displayRadioStatus();
        }
    }

    public void changePostForward(){
    if(currentPostIndex == posts.size() - 1){
        currentPostIndex = 0;
    }else{
        currentPostIndex++;
        displayRadioStatus();
    }
    }

    public void changePostBackwards(){
        if(currentPostIndex==0){
            currentPostIndex=posts.size()-1;
        }else{
            currentPostIndex--;
            displayRadioStatus();
        }
    }

    public void displayRadioStatus(){
        if(!on){
            System.out.println("The Radio is stopped");
        }else{
            System.out.println("The Radio is on " + posts.get(currentPostIndex) + " at the volume " + volume);
        }
    }
}

