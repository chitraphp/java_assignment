package p35q34;

import p1.Employee;
import p34q33.CreatingEmptyObject;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        //take data id,name,salary from user using scanner and display that data in show method
        Employee employee = new Employee();
        String name;
        int id, salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        id = scanner.nextInt();
        System.out.println("Enter salary");
        salary = scanner.nextInt();
        System.out.println("Enter name");
        name = scanner.next();
        employee.setId(id);
        employee.setSal(salary);
        employee.setName(name);
        CreatingEmptyObject useScanner = new CreatingEmptyObject();
        useScanner.show(employee);
    }

    public void show(Employee employee){
        //display data here by doing required changes
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());
    }
}
