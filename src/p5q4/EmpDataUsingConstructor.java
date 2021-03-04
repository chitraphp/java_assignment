package p5q4;

import p1.Employee;

public class EmpDataUsingConstructor {
    public static void main(String[] args) {
        //here create object of Employee class and add 101,sam,1000 data into that using constructor
        //display that data here
        Employee employee = new Employee(101, "sam", 100);

        System.out.println("id: "+employee.getId());
        System.out.println("name: "+employee.getName());
        System.out.println(("Salary: "+ employee.getSal()));
    }

}
