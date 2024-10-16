public class User {
    private final String username;
    private final String email;
    private final UserRole role;

    public User(String username, String email, UserRole role){
        this.username = username;
        this.email = email;
        this.role = role;
    }
}
