package p34q33;

import p1.Employee;

import java.util.Scanner;

public class CreatingEmptyObject {
    public static void show(Employee employee){
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());

    }
    public static void process(Employee employee){
        employee.setId(100);
        employee.setSal(1000);
        employee.setName("chitra");

    }

    public static void main(String[] args) {
        //do required changes in main,process and show method
        //create empty employee object here
        //add data into that empty object using process method
        //display employee object with data in show method
        Employee employee = new Employee();
        process(employee);
        show(employee);

    }



}
