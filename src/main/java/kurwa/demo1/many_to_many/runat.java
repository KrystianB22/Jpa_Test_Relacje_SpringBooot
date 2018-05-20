package kurwa.demo1.many_to_many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class runat {


    @Autowired
    private final Employee_Repository employee_repository;
    private final  Projekt_Repository projekt_repository;

    public runat(Employee_Repository employee_repository, Projekt_Repository projekt_repository) {
        this.employee_repository = employee_repository;
        this.projekt_repository = projekt_repository;
    }

    @PostConstruct
    public void save(){

        Projekt projekt=new Projekt();
        Projekt projekt1=new Projekt();
        projekt.setNazwa("Projekt_Sztuczna");
        projekt1.setNazwa("Projekt_Inżynieria");

      Employee employee=new Employee("Jurek","Owsiak");
        Employee employee1=new Employee("Adam","Owsiak");
        Employee employee2=new Employee("Pola","Owsiak");
        Employee employee3=new Employee("Wojk","Owsiak");
        Employee employee4=new Employee("Adam","Ulao");
        Employee employee5=new Employee("Monika","Polaka");
        Employee employee6=new Employee("Nadia","Oleka");

        List<Employee> employees =new ArrayList<Employee>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        List<Employee> employees1 =new ArrayList<Employee>();
        employees1.add(employee3);
        employees1.add(employee4);
        employees1.add(employee5);
        employees1.add(employee6);
        projekt1.setEmployees(employees);
        projekt.setEmployees(employees1);
        employee_repository.save(employee);
        employee_repository.save(employee1);
        employee_repository.save(employee2);
        employee_repository.save(employee3);
        employee_repository.save(employee4);
        employee_repository.save(employee5);
        employee_repository.save(employee6);
        projekt_repository.save(projekt);
        projekt_repository.save(projekt1);




    }

}
