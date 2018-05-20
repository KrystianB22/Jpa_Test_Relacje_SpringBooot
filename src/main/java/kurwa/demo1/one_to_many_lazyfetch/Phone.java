package kurwa.demo1.one_to_many_lazyfetch;

import javax.persistence.*;

@Entity
@Table(name = "Numery")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Typ")
    private String typ;
    @Column(name = "Numer")
    private String  number;

    @ManyToOne
    @JoinColumn(name = "Employee_ID") // dodanie do tabeli kolumny z id pracownika
  private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
