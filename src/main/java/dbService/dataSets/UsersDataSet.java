package dbService.dataSets;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "users")
public class UsersDataSet implements Serializable { // Serializable Important to Hibernate!
    private static final long serialVersionUID = -8706689714326132798L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true, updatable = false)
    private String name;

    @Column(name = "password", unique = false, updatable = false)
    private String password;

    //Important to Hibernate!
    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet() {
    }

    @SuppressWarnings("UnusedDeclaration")
    public UsersDataSet(long _id, String _name) {
        this.setId(_id);
        this.setName(_name);
        this.setPassword(_name);
    }

    public UsersDataSet(String _name) {
        this.setId(-1);
        this.setName(_name);
        this.setPassword(_name);
    }

    public UsersDataSet(String _name, String _password) {
        this.setId(-1);
        this.setName(_name);
        this.setPassword(_password);
    }

    public UsersDataSet(long _id, String _name, String _password) {
        this.setId(_id);
        this.setName(_name);
        this.setPassword(_password);
    }

    @SuppressWarnings("UnusedDeclaration")
    public String getName() {
        return this.name;
    }
    public long getId() {
        return this.id;
    }
    public String getPassword(){return this.password;}

    public void setName(String _name) {
        this.name = _name;
    }
    public void setId(long _id) {
        this.id = _id;
    }
    public void setPassword(String _password){
        this.password = _password;
    }





    @Override
    public String toString() {
        return "UserDataSet{" +
                "id=" + id +
                ", name='" + name + "', password='" + password +
                "'}";
    }
}