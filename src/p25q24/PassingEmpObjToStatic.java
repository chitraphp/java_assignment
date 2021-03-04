package p25q24;

import p1.Employee;

public class PassingEmpObjToStatic {
    public static void show(Employee employee){
        //display data here
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());
    }
    public static void main(String[] args) {
        //call m1 method from here
        Employee employee = new Employee(100,"chitra",1000);
        show(employee);
    }

}
