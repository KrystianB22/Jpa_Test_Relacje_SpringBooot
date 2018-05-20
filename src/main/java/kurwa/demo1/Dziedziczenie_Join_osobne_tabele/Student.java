package kurwa.demo1.Dziedziczenie_Join_osobne_tabele;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Student_UTP")
public class Student extends Employee {
    public String getOceny() {
        return oceny;
    }

    public void setOceny(String oceny) {
        this.oceny = oceny;
    }

    @Column(name = "Oceny")
    private String oceny;
}
