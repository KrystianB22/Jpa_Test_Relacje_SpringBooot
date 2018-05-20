package kurwa.demo1.many_to_many;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Projekt")
public class Projekt {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Projekty_nazwa")
    private String nazwa;
    @ManyToMany
    @JoinTable(name = "Pracownicy_w_projektach",
    joinColumns = {@JoinColumn(name = "Projekt_ID")},
    inverseJoinColumns = {@JoinColumn(name = "Employee_ID")})
    private List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
