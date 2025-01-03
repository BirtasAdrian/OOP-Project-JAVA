public class InsuranceProcessor {

    public static void processInsurance(Insurance insurance){
        System.out.println("Processed " + insurance);
    }

    public static void processInsurance(Insurance insurance, boolean approvedByManager) {
        System.out.println( (approvedByManager? "" : "We have not ") +  " processed " + insurance);
    }
}
