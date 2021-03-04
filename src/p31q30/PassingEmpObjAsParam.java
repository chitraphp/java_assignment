package p31q30;

import p1.Employee;

public class PassingEmpObjAsParam {
    public static Employee show(){
        //create Employee object here and return
        Employee employee = new Employee(100,"chitra",1000);
        //do required changes in m1 method to do this task
        return employee;
    }


    public static void main(String[] args) {
        //call m1 method and catch returned employee object here
        Employee employee = show();
        //display returned employee data here
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());
    }

}
