public class Hero {

    String name;
    String hiddenIdentity;

    public Hero(String name, String hiddenIdentity) {
        this.name = name;
        this.hiddenIdentity = hiddenIdentity;
    }

    public void attack(){
        System.out.println("The hero is attacking");
    }
}
