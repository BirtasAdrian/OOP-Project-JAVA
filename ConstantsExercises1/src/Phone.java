public class Phone {

    String brand;
    String model;

    public final void makeCall(){
        System.out.println("The phone is ringing");

    }

    public void downloadAppFromStore(String s){
        System.out.println("The App is downloading" + s);
    }
}
