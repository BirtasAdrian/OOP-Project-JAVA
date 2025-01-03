public class Radio implements Startable, Stoppable, Changeable {

    String currentPost;

    public Radio(String currentPost) {
        this.currentPost = currentPost;
    }

    @Override
    public void changePost(String newPost) {
        System.out.println("We change the post on " + newPost);
        currentPost = newPost;
    }

    @Override
    public void start() {
        System.out.println("We start the radio");
    }

    @Override
    public void stop() {
        System.out.println("We stop the radio");
    }
}
