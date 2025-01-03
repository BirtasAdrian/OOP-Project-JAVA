import java.util.ArrayList;

public class TeamLeader extends Staff{


    ArrayList<Programmer> team;
    public TeamLeader(String name, int salary) {
        super(name, salary);
        team = new ArrayList<>();
    }

    public void assignWork(){
        for(Programmer developer : team){
            developer.code();
        }
    }

    public void addPeopleInTheTeam(Programmer programmer){
        team.add(programmer);

    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "team=" + team +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
