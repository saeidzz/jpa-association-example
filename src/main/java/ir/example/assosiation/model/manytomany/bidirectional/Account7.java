package ir.example.assosiation.model.manytomany.bidirectional;

import javax.persistence.*;
import java.util.List;

/**
 * @author saeid zangenehe
 */
@Entity
@Table(name = "Account7")
public class Account7 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String type;
    @ManyToMany(mappedBy = "account")
    private List<User7> user;

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

    public List<User7> getUser() {
        return user;
    }

    public void setUser(List<User7> user) {
        this.user = user;
    }
}
