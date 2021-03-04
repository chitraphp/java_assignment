package p32q31;

import p1.Employee;

public class ObjectAndEmpobj {
    public static Object show(){
        //create Employee object here and return
        Employee employee = new Employee(100,"chitra",1000);
        //don’t change m1 method prototype i.e return type or access specifier
        return employee;
    }
    public static void main(String[] args) {
        //call m1 method and catch returned employee object here
        Employee employee = (Employee)show();
        //display returned employee data here
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());
    }

}
