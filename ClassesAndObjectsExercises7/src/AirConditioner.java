public class AirConditioner {

    boolean on;
    int temperature;
    boolean swinging;

    public void turnOn(){
        if(on){
            System.out.println("Conditioning air it's already on");
        }else{
            on = true;
            System.out.println("Conditioning Air is on");
        }

    }

    public void turnOff(){
        if(on){
            System.out.println("Conditioning Air is off");
        }else{
            System.out.println("Conditioning Air it's already off");
        }

    }

    public void raiseTemperature(){
        if(on) {
            if (temperature == 30) {
                System.out.println("Temperature is set to maximum");
            } else {
                temperature++;
                System.out.println("We increased the temperature");
            }
        }else{
            System.out.println("Conditioning Air must be switched on");
        }
    }

    public void lowTemperature(){
        if(on) {
            if (temperature == 0) {
                System.out.println("Temperature is set to minimum ");
            } else {
                temperature--;
                System.out.println("We lowered the temperature");
            }
        }else{
            System.out.println("Conditioning Air must be switched on");
        }
    }

    public void swing() {
        if (on) {
            if (swinging) {
                System.out.println("We turned off the air conditioning balance.");
                swinging = false;
            } else {
                System.out.println("We turned on the air conditioning balance;");
                swinging = true;
            }
        }else{
            System.out.println("Conditioning Air must be switched on");
        }
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "on=" + on +
                ", temperature=" + temperature +
                ", swinging=" + swinging +
                '}';
    }
}
