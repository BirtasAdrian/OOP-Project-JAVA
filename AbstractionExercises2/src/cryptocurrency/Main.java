package cryptocurrency;

public class Main {
    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin(1000);
        Etherium etherium = new Etherium(1000);
        XRP xrp = new XRP(1000);

        for (int i = 0; i<30; i++){
            bitcoin.changeValue();
            etherium.changeValue();
            xrp.changeValue();
        }
        System.out.println("The final dollar value of bitcoin is " + bitcoin.valueInUSD);
        System.out.println("The final dollar value of etherium is " + etherium.valueInUSD);
        System.out.println("The final dollar value of xrp is " + xrp.valueInUSD);

    }


}
