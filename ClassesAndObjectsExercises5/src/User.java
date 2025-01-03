public class User {

    String username;
    String password;

    public User(String username, String password, String confirmPassword) {
        checkUsernameLength(username);
        checkPasswordLength(password);
        checkPasswordDigits(password);
        checkPasswords(password, confirmPassword);

        this.username = username;
        this.password = password;
    }

    private static void checkPasswords(String password, String confirmPassword) {
        if(!password.equals(confirmPassword)) {
            System.out.println("Problem: The entered passwords do not match");
        }
    }

    private static void checkPasswordDigits(String password) {
        char[] charactersPassword = password.toCharArray();
        int numberDigits = 0;
        for(char c : charactersPassword){
            if(Character.isDigit(c)){
                numberDigits++;
            }

        }
        if(numberDigits < 2){
            System.out.println("Problem: The password should contain at least 2 digits");
        }
    }

    private static void checkPasswordLength(String password) {
        if(password.length()<8){
            System.out.println("Problem: The password entered is less than 8 characters");
        }
    }

    private static void checkUsernameLength(String username) {
        if(username.length()<7){
            System.out.println("Problem: The username entered is less than 7 characters");
        }
    }
}
