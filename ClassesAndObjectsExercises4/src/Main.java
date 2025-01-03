public class Main {

    public static void main(String[] args) {

        Radio radio = new Radio();

        radio.turnOn();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeDown();

        radio.changePostForward();
        radio.changePostBackwards();
        radio.changePostBackwards();
        radio.changePostBackwards();
        radio.changePostBackwards();
        radio.changePostForward();
        radio.changePostForward();
        radio.changePostForward();
        radio.changePostForward();
        radio.changePostBackwards();

        Pencil pencil = new Pencil("Blue");

        pencil.write("Welcome to Programmers Academy");
        System.out.println(pencil.remainingInk);
    }
}

    //1. Create the Radio class, with the following fields: boolean on, int volume, int currentPostIndex and ArrayList<String> posts
    //   When creating a radio, 5 posts will be added to its list of posts.
    //   Any initialized radio will first have current post 1, volume 0 and will be turned off.
    //   The radio will have the following functionality:
    //   turnOn(), turnOff() - these methods will turn the radio on/off
    //   turnVolumeUp(), turnVolumeDown() - these methods will change the volume of the radio. A radio can have a volume between 0
    //   and 10.
    //   changePostForward(), changePostBackwards() - these methods will change the current station, based on the list of stations in the structure
    //   of its structure.
    //   displayRadioStatus() - this method will print one of the following messages based on the internal structure of the current radio:
    //   "Radio is off" / "Radio is on station x, given at volume y"
    //    Create an object of type radio. Change the volume 5 times and the current station 10 times (forward and backwards) by printing also
    //    each time the internal structure of the radio.

    //2. Create the Pencil class with String color, Int remainingInk fields and the Write() method, which will receive a String text parameter
    //  The color of the pen will be given as a parameter in the constructor, and any initialized pen will have 1000 remaining ink.
    //  The Write() method will consume 1 remaining ink for each letter/number received in its String parameter.
    //  Initialize a pen, and via the Write() method, print something to the console.
