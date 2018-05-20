package kurwa.demo1.Dziedziczenie_Join_osobne_tabele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Profesor")
public class Wykladowca extends Employee {
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    private String salary;
}
