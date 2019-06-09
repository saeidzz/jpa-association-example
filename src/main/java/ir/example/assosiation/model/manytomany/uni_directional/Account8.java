package ir.example.assosiation.model.manytomany.uni_directional;

import javax.persistence.*;
import java.util.List;

/**
 * @author saeid zangenehe
 */

@Entity
@Table(name = "Account8")
public class Account8 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String type;
    @ManyToMany
    @JoinTable(name = "ACCOUNT8_USER8")
    private List<User8> user;

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

    public  List<User8> getUser6() {
        return user;
    }

    public void setUser6( List<User8> user) {
        this.user = user;
    }
}
