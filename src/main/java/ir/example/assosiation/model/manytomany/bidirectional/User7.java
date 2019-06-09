package ir.example.assosiation.model.manytomany.bidirectional;

import javax.persistence.*;
import java.util.List;

/**
 * @author saeid zangenehe
 */

@Table(name = "User7")
@Entity
public class User7 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String lName;
    private String email;
    @ManyToMany
    @JoinTable(name = "USER7_ACCOUNT7")
    private List<Account7> account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account7>  getAccount() {
        return account;
    }

    public void setAccount(List<Account7>  account) {
        this.account = account;
    }
}
