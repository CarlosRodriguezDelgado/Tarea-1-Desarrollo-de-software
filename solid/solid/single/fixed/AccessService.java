package solid.single.fixed;

public class AccessService {

    private ValidationService validator = new ValidationService();

    public AccessService() {

    }

    public void registerUser(String username, String password) {
        if (validator.validateUsername(username) && validator.validatePassword(password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser(String username, String password) {
        if (validator.validateUsername(username) && validator.validatePassword(password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
    
}
