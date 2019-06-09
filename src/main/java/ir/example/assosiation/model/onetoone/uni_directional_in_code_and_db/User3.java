package ir.example.assosiation.model.onetoone.uni_directional_in_code_and_db;

import javax.persistence.*;

/**
 * @author saeid zangenehe
 */

@Table(name = "User3")
@Entity
public class User3 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String lName;
    private String email;
    @OneToOne(targetEntity = Account3.class)
    private Account3 account;

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

    public Account3 getAccount() {
        return account;
    }

    public void setAccount(Account3 account) {
        this.account = account;
    }
}
