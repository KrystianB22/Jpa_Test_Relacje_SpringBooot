package kurwa.demo1.Dziedziczenie_SingleTable;

import javax.persistence.*;

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
