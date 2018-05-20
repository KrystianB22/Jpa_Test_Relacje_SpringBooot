package kurwa.demo1.many_to_many;

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
    @ManyToMany(mappedBy = "employees")// mapowanie na pole w tabeli phone
    private List<Projekt> projekt;//lista

    public Employee() {
    }

    public Employee(String name, String last_name) {
        this.name = name;
        this.last_name = last_name;
    }

    public List<Projekt> getPhones() {
        return projekt;
    }

    public void setPhones(List<Projekt> phones) {
        this.projekt = phones;
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
