package ir.example.assosiation.model.manytoone.uni_directional;

import javax.persistence.*;
/**
 * @author saeid zangenehe
 *
 */

@Entity
@Table(name = "Account6")
public class Account6 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String type;
    @ManyToOne
    private User6 user6;

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

    public User6 getUser6() {
        return user6;
    }

    public void setUser6(User6 user6) {
        this.user6 = user6;
    }
}
