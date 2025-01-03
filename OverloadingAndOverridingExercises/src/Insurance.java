public class Insurance {

    static int cursor=1;

    String id;

    public Insurance(){
        this.id= String.valueOf(cursor++);
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "id='" + id + '\'' +
                '}';
    }
}
