package cryptocurrency;

public class XRP extends Cryptocurrency{


    public XRP(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {

        int probability = generator.nextInt(11);
        if(probability <=2){
            valueInUSD-=30.0;
            System.out.println("XRP dropped by 30");
        }else{
            valueInUSD+=100;
            System.out.println("XRP has risen by 10");
        }

    }
}
