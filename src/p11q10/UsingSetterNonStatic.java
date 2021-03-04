package p11q10;

import p1.Employee;

public class UsingSetterNonStatic {
    public static void main(String[] args) {
        //create Employee object with 101,sam,1000 data
        Employee employee1 = new Employee(101, "sam", 1000);
        //display this object data by passing to show method
        UsingSetterNonStatic usingSetterNonStatic = new UsingSetterNonStatic();
        usingSetterNonStatic.show(employee1);
        //add 100 bonus in salary
        //display this object data by passing to show method
    }
    public void show(Employee employee){
        //do required changes in show method
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());
    }

}
