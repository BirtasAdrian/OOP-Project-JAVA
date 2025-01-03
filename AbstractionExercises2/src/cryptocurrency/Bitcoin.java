package cryptocurrency;

public class Bitcoin extends Cryptocurrency  {


    public Bitcoin(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {
        int probability = generator.nextInt(11);
        if(probability <=4){
            valueInUSD-=80.0;
            System.out.println("Bitcoin dropped by 80");
        }else{
            valueInUSD+=100;
            System.out.println("Bitcoin has risen by 100");
        }

    }
}
