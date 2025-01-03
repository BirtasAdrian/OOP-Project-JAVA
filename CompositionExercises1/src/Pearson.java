public class Pearson {

    String firstName;
    String lastName;
    Pearson bestFriend;

    public Pearson(String firstName, String lastName, Pearson bestFriend) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bestFriend = bestFriend;
    }

    public void printFriendship(){
        System.out.println(firstName + " is best friend with " + bestFriend.firstName);
    }

    @Override
    public String toString() {
        return "Pearson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bestFriend=" + bestFriend +
                '}';
    }
}
