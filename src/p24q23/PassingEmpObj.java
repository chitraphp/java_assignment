package p24q23;

import p1.Employee;

public class PassingEmpObj {
    public static void show(Object o){
        Employee employee = (Employee)o;
        System.out.println(employee.getId());
    }
    public static void main(String[] args) {
        //call m1 method from here
        Employee employee = new Employee(100,"chitra",1000);
        Object o = employee;
        show(o);
    }

}
