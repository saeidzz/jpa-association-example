package ir.example.assosiation.model.manytoone.bidirectional_in_code_and_unidirectional_db;

import javax.persistence.*;
import java.util.List;

/**
 * @author saeid zangenehe
 */

@Table(name = "User5")
@Entity
public class User5 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String lName;
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Account5> account;

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

    public List<Account5> getAccount() {
        return account;
    }

    public void setAccount(List<Account5> account) {
        this.account = account;
    }
}
