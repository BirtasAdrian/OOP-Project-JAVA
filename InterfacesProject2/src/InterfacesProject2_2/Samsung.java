package InterfacesProject2_2;

public class Samsung implements SmartphoneBehavior{
    @Override
    public void takeScreenshot() {
        System.out.println("Screenshot taken");
    }

    @Override
    public void downloadAppFromStore(String appName) {
        System.out.println("Samsung downloaded the app " + appName + " from mobileStore");
    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Samsung rings the number " + telephoneNumber);

    }

    @Override
    public void charge() {
        System.out.println("Samsung is charged");

    }
}
