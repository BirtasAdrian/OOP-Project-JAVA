import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Exercise 1

//        Sniper sniper = new Sniper();
//        Pistol pistol = new Pistol();
//        AK47 ak47  = new AK47();
//
//        sniper.shoot();
//        pistol.shoot();
//        ak47.shoot();

//        Exercise 2

        ArrayList<String> movies = new ArrayList<>(Arrays.asList("The Lord of the rings", "Star Wars", "Merlin"));

        VLCMediaPlayer vlcMediaPlayer = new VLCMediaPlayer();
        WindowsMediaPlayer windowsMediaPlayer = new WindowsMediaPlayer();
        Winamp winamp = new Winamp();

//        for(String movieTitle : movies){
//            vlcMediaPlayer.playVideo(movieTitle);
//            windowsMediaPlayer.playVideo(movieTitle);
//            winamp.playVideo(movieTitle);
//        }

        for (int i = movies.size()-1; i >=0 ; i--) {
            vlcMediaPlayer.playVideo(movies.get(i));
            windowsMediaPlayer.playVideo(movies.get(i));
            winamp.playVideo(movies.get(i));
            
        }

    }

//    1. Create the Shooter class with the maxRange int property and the shoot() method.
//    Sniper will inherit Shooter, will have a maxRange of 2000 meters and will shoot the target according to the maximum distance.
//    Pistol will inherit Shooter, will have a maxRange of 100 meters and will shoot the target depending on the maximum distance
//    Ak47 will inherit Shooter, will have a maxRange of 500 meters and will have multiShoot() method.
//    When Ak47 shoots, multiple bullets will be fired at once.



//    2. Create class videoPlayer, with method playVideo(String movieName)
//    The VLCPlayer class will play the video in good quality.
//    WindowsMediaPlayer class will start the video at medium quality.
//    Winamp class will start the video at poor quality.

//    Create a video player of each defined data type.
//    Add 5 movies to a list, and make all programs play those movies in descending order.

}
