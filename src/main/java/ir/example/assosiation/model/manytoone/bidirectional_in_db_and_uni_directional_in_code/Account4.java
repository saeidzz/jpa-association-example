package ir.example.assosiation.model.manytoone.bidirectional_in_db_and_uni_directional_in_code;

import javax.persistence.*;
/**
 * @author saeid zangenehe
 */

@Entity
@Table(name = "Account4")
public class Account4 {
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
