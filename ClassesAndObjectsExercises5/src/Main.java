public class Main {
    public static void main(String[] args) {

//        User user1 = new User("AdrianBirtas1219", "pass12345", "pass12345");
//        User user2 = new User("Adrian", "pass12345", "pass12345");
//        User user3 = new User("AdrianBirtas1219", "pass", "pass1");
//        User user4 = new User("Mira", "1", "2");

        FacebookUser user1= new FacebookUser("Adrian", "Birtas", 1997);
        FacebookUser user2 = new FacebookUser("Maria", "Pop", 1999);

        user1.writePost("Outside is raining");
        user1.writePost("The rain has stopped");

        user2.writePost("I'm selling a Play Station 5");
        user2.writePost("It's sold");

        user1.printAllPosts();
        user2.printAllPosts();


    }
}

//1. Create class User, with the following fields: String username, String password
//   The constructor of the class will receive the following parameters: username, password and confirmPassword.
//   The following checks will be performed in the constructor. Each violation of these rules will display a corresponding
//   message in the console:
//   The username must be at least 7 characters long.
//   The password must have at least 8 characters.
//   Password must contain at least 2 digits.
//   The password passed as a parameter must be the same as the confirmed password.
//   Create a user that meets all the requirements of the application
//   Create users that each violate a different requirement of the application

//2. Create the FacebookUser class, with the following fields: firstName, lastName, birthYear, List<String> posts.
//   The FacebookUser will have the writePost(String content) method, which will add a post to its list of posts.
//   and the printAllPosts() method, which will print all posts.
//   Create two users. Each user will write between 2 and 4 posts. Print the posts for each user.
