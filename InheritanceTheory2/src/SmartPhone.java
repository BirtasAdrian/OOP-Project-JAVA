public class SmartPhone extends Phone{

    public SmartPhone(String number, int price) {
        super(number, price);
    }

    public void takeScreenshot(){
        System.out.println("Screenshot taken");
    }

    public void takePicture(){
        System.out.println("We took a good quality picture");
    }

    public void playVideo(){
        System.out.println("Playing a high quality video");
    }
}
