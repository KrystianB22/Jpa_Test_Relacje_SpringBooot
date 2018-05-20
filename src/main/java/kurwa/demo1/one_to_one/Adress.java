//package kurwa.demo1.one_to_one;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "Adres")
//public class Adress {
//
//    private kurwa.demo1.one_to_one.employee employee;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(name = "adres")
//    private String name;
//    @OneToOne(mappedBy = "adress")// one to one mapowanie na pole w klasie employee
//
//
//
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public kurwa.demo1.one_to_one.employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(kurwa.demo1.one_to_one.employee employee) {
//        this.employee = employee;
//    }
//}
