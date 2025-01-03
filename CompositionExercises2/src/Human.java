public class Human {

    String name;
    Heart heart;
    Stomach stomach;
    Brain brain;


    public Human(String name, Heart heart, Stomach stomach, Brain brain) {
        this.name = name;
        this.heart = heart;
        this.stomach = stomach;
        this.brain = brain;
    }

    public void eat(){
        if(stomach.needsFood){
            System.out.println("I ate");
        }else{
            System.out.println("I'm not hungry");
        }
    }

    public void read(){
        brain.iq++;
    }

    public void live(){
        heart.beat();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", heart=" + heart +
                ", stomach=" + stomach +
                ", brain=" + brain +
                '}';
    }
}
