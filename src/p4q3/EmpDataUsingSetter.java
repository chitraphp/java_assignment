package p4q3;

import p1.Employee;

public class EmpDataUsingSetter {
    public static void main(String[] args) {
        //here create object of Employee class and add 101,sam,1000 data into that using setter method
        //display that data here
        Employee employee = new Employee();
        employee.setId(100);
        employee.setSal(1000);
        employee.setName("sam");

        System.out.println("id: "+employee.getId());
        System.out.println("name: "+employee.getName());
        System.out.println(("Salary: "+ employee.getSal()));
    }

}
