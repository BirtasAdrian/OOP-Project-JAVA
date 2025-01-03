public class Superman extends Hero{

    public Superman(String name, String hiddenIdentity) {
        super(name, hiddenIdentity);
    }

    public void fly(){
        System.out.println(this.name + " is flying");
    }
}
