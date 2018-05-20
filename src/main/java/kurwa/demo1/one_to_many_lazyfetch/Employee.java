package kurwa.demo1.one_to_many_lazyfetch;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Pracownik")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Imie")
    private String name;
    @Column(name = "Nazwisko")
    private  String last_name;
    @OneToMany(mappedBy = "employee")// mapowanie na pole w tabeli phone
    private List<Phone> phones;//lista

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
