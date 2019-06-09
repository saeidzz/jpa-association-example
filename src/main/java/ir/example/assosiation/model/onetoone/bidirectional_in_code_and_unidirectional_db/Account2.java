package ir.example.assosiation.model.onetoone.bidirectional_in_code_and_unidirectional_db;

import javax.persistence.*;

/**
 * @author saeid zangenehe
 */

@Entity
@Table(name = "Account2")
public class Account2 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String type;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private User2 user;

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

    public User2 getUser() {
        return user;
    }

    public void setUser(User2 user) {
        this.user = user;
    }


}
