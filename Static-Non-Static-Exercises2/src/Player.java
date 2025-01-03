public class Player {

    static int slots = 0;

    String name;
    int health;

    public Player(String name, int health) {
        slots +=50;
        this.name = name;
        this.health = health;
        if(slots >=300){
            System.out.println("We have exceeded the maximum capacity of players ");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", slots=" + slots +
                '}';
    }
}
