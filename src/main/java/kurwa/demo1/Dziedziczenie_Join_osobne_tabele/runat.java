package kurwa.demo1.Dziedziczenie_Join_osobne_tabele;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class runat {

    @Autowired
    private final Employee_Repository employee_repository;
    private final  Student_Repository student_repository;
    private final Wykladowca_Repository wykładowca_repository;

    public runat(Employee_Repository employee_repository, Student_Repository student_repository, Wykladowca_Repository wykładowca_repository) {
        this.employee_repository = employee_repository;
        this.student_repository = student_repository;
        this.wykładowca_repository = wykładowca_repository;
    }

    @PostConstruct
    public void save(){

        Wykladowca wykładowca =new Wykladowca();
        wykładowca.setSalary("3000");
        wykładowca.setName("Olek");
        wykładowca.setLast_name("Matolek");

        Student student=new Student();
        student.setOceny("2");
        student.setName("Mikolaj");
        student.setLast_name("Motak");


        student_repository.save(student);
        wykładowca_repository.save(wykładowca);


        Employee olek = employee_repository.findAllByName("Olek");

        System.out.println(olek.getLast_name());



    }











}
