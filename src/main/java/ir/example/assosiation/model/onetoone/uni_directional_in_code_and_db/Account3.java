package ir.example.assosiation.model.onetoone.uni_directional_in_code_and_db;

import javax.persistence.*;

/**
 * @author saeid zangenehe
 */

@Entity
@Table(name = "Account3")
public class Account3 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String type;


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


}
