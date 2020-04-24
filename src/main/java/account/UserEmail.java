package account;

public class UserEmail <T extends String> {
    private T userEmail;

    public UserEmail(T _userEmail) {
        this.userEmail = _userEmail;
    }

    public T getUserEmail(){
        return this.userEmail;
    }
}
