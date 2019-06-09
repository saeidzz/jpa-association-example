package ir.example.assosiation.model.onetoone.bidirectional_in_db_and_code;

import javax.persistence.*;

/**
 * @author saeid zangenehe
 */

@Entity
@Table(name = "Account1")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String type;
    @OneToOne
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
