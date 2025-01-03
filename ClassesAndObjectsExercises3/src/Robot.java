public class Robot {

    String name;
    int attackPower;
    String material;


    public Robot(String name, int attackPower, String material) {
        this.name = name;
        this.attackPower = attackPower;
        this.material = material;
    }

    public void attack(){
        System.out.println("The robot " + name + " attack with the value " + attackPower);
    }
}
