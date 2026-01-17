package solid.single.fixed;

public class Main {
    public static void main(String[] args) {
        AccessService log_in = new AccessService();
        log_in.registerUser("john_doe", "Password123");
        log_in.loginUser("john_doe", "Password123");
    }
    
}
