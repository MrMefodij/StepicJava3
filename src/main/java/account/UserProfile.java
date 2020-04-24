package account;

public class UserProfile {
    private final UserName login;
    private final UserPassword pass;
    private final UserEmail email;

    public UserProfile(String login, String pass, String email) {
        this.login = new UserName(login);
        this.pass = new UserPassword(pass);
        this.email = new UserEmail(email);
    }
    public UserProfile(String login, String pass) {
        this.login = new UserName(login);
        this.pass = new UserPassword(pass);
        this.email = new UserEmail(login + "@mail.ru");
    }

    public UserProfile(String login) {
        this.login = new UserName(login);
        this.pass = new UserPassword(login);
        this.email = new UserEmail(login);
    }

    public UserName getLogin() {
        return login;
    }

    public UserPassword getPass() {
        return pass;
    }

    public UserEmail getEmail() {
        return email;
    }

}
