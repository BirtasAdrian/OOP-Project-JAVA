public class Hero {

    String name;
    int health;
    int attack;
    Villain enemy;

    public Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void setEnemy(Villain villain){
        this.enemy = villain;

    }

    public void attack() {
        if (enemy != null) {
            enemy.health -= this.attack;
            System.out.println("I attacked the enemy" + enemy);
        }else{
            System.out.println("We have no enemy");
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", enemy=" + enemy.name +
                '}';
    }
}
