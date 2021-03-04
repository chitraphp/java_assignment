package p26q25;

import p1.Employee;

public class TypeCastingEmpObjToObject {
    public static void show(Object o){
        //display employee data here
        Employee employee = (Employee)o;
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());
    }
    public static void main(String[] args) {
        //create Employee object here with 101,sam,1000 data
        //call m1 method by passing this Employee object
        Employee employee = new Employee(100,"chitra",1000);
        show(employee);
    }

}
