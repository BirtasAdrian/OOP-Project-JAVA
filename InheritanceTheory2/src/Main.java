public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone("0756165165", 1200);
        phone.call();
        phone.showDetails();

        SmartPhone smartPhone = new SmartPhone("0759894949", 1000);
        smartPhone.takeScreenshot();
        smartPhone.showDetails();
        smartPhone.showDetails();
        smartPhone.call();
        smartPhone.playVideo();
        smartPhone.takePicture();

        Cellular cellular = new Cellular("015651818", 100);
        cellular.showDetails();
        cellular.call();
        cellular.playVideo();
        cellular.takePicture();

        DeskPhone deskPhone = new DeskPhone("09859849", 200);
        deskPhone.showDetails();
        deskPhone.call();

        Samsung samsung = new Samsung("075918919", 1500);

        samsung.takeScreenshot();
        samsung.showDetails();
        samsung.showDetails();
        samsung.call();
        samsung.playVideo();
        samsung.takePicture();

        Iphone iphone = new Iphone("0498598984", 3500);

        iphone.takeScreenshot();
        iphone.showDetails();
        iphone.showDetails();
        iphone.call();
        iphone.playVideo();
        iphone.takePicture();

        Motorola motorola = new Motorola("0758984984", 1200, false);

        motorola.showDetails();
        motorola.call();
        motorola.playVideo();
        motorola.takePicture();
        motorola.closeCap();
        motorola.closeCap();
        motorola.closeCap();
        motorola.closeCap();

        Nokia nokia = new Nokia("0759498498", 1000);

        nokia.showDetails();
        nokia.call();
        nokia.playVideo();
        nokia.takePicture();

        Panasonic panasonic = new Panasonic("07455911915", 600);

        panasonic.call();
        panasonic.showDetails();
        panasonic.playPolytone();

        Cisco cisco = new Cisco("075891181", 800);

        cisco.call();
        cisco.showDetails();
        cisco.sendFax();

    }

//    1. Write a Phone superclass to be inherited by the following classes: SmartPhone, Cellular and DeskPhone.

//    2. Write to the Phone class two common fields price and number, and the methods call() and showDetails(). The latter
//    display details about the phone to the console, using the fields.

//    3. Write 2 classes that inherit the children of the Phone class: Samsung, Iphone, Nokia, Motorola, Panasonic, Cisco.

//    4. Write the following methods in the corresponding classes: takeScreenShot(), takePicture().
//    playVideo(), closeClap(), playPolytone(), sendFax and also inherit and
//    from the above classes. (Note what you can inherit and from where).
}
