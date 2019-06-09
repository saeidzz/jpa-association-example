package ir.example.assosiation.model.manytoone.bidirectional_in_db_and_uni_directional_in_code;

import javax.persistence.*;
import java.util.List;

/**
 * @author saeid zangenehe
 */

@Table(name = "User4")
@Entity
public class User4 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String lName;
    private String email;
    @OneToMany
    @JoinTable(name = "ACCOUNT4_USER4")
    private List<Account4> account;

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

    public List<Account4>  getAccount() {
        return account;
    }

    public void setAccount(List<Account4>  account) {
        this.account = account;
    }
}
