package ir.example.assosiation.model.manytoone.bidirectional_in_code_and_unidirectional_db;

import javax.persistence.*;

/**
 * @author saeid zangenehe
 */

@Entity
@Table(name = "Account5")
public class Account5 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private User5 user;

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

    public User5 getUser() {
        return user;
    }

    public void setUser(User5 user) {
        this.user = user;
    }


}
