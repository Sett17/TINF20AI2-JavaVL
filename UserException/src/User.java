

public class User {
    String password;
    String username;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
        System.out.println("created " + this.username);
    }

    public static void main(String[] args) {
        new User("peter heins", "dasEinGutesPassword?");
        new User("peter", "dasAuchGutesPassword?");
        new User("12345", "123456");
    }

    public void checkUsername(String name) throws UsernameException {
        if (name.length() > 8) {
            throw new UsernameException("username too long");
        }
    }

    public void checkPassword(String name) throws RuntimeException {
        if (name.length() < 8) {
            throw new RuntimeException("password too short");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        checkPassword(password);
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        try {
            checkUsername(username);
            this.username = username;
        } catch (UsernameException e) {
            System.out.println("username was too long. only put first 8 characters");
            this.username = username.substring(0, 7);
        }
    }

}
