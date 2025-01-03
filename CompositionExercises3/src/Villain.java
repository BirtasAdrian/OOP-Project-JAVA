public class Villain {


    String name;
    int health;
    int attack;
    Hero enemy;

    public Villain(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void setEnemy(Hero hero){
        this.enemy = hero;

    }

    public void attack() {
        if (enemy != null) {
            enemy.health -= this.attack;
            System.out.println("I attacked the enemy" + enemy);
        }else{
            System.out.println("We have no hero enemy");
        }
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", enemy=" + enemy.name +
                '}';
    }
}
