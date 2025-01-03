package cryptocurrency;

public class Etherium extends Cryptocurrency {


    public Etherium(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {

        int probability = generator.nextInt(11);
        if(probability <=5){
            valueInUSD-=50.0;
            System.out.println("Etherium dropped by 80");
        }else{
            valueInUSD+=50;
            System.out.println("Etherium has risen by 100");
        }
    }
}
