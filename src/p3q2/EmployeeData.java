package p3q2;

import p1.Employee;

public class EmployeeData {
    public static void main(String[] args){
        //here create object of Employee class and add 101,sam,1000 data into that
        //display that data here
        Employee employee = new Employee(101, "sam", 100);

        System.out.println("id: "+employee.getId());
        System.out.println("name: "+employee.getName());
        System.out.println(("Salary: "+ employee.getSal()));
    }
}
