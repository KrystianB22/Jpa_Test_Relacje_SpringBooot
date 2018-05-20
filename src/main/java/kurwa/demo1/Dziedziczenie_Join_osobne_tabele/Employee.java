package kurwa.demo1.Dziedziczenie_Join_osobne_tabele;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Rodzaj")// ustawia nazwe dla Dtype domyślnego w kolumnie
public abstract class Employee {

    @Id
    @GeneratedValue()
    private int id;
    @Column(name = "Imie")
    private String name;
    @Column(name = "Nazwisko")
    private  String last_name;


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
