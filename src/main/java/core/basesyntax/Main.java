package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        User user = new User("asfasfasf", "securePassword123", "securePassword123");

        UserService userService = new UserService();

        userService.registerUser(user);
    }
}
