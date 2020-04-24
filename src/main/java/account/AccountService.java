package account;

import dbService.DBException;
import dbService.DBService;


public class AccountService {
    private final DBService dbService;

    public AccountService(DBService _dbService) {
        this.dbService = _dbService;
    }

    public void addNewUser(UserProfile userProfile) {
        String name = userProfile.getLogin().getUserName();
        String password = userProfile.getPass().getUserPassword();
        String email = userProfile.getEmail().getUserEmail();
        try {
            dbService.addUser(name, password);
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

    public UserProfile getUserByLogin(String login) {
        try {
            String name = dbService.getUserByName(login).getName();
            String password = dbService.getUserByName(login).getPassword();
            UserProfile profile = new UserProfile(name, password);
            return profile;
        } catch (DBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
