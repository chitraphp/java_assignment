package p7q6;

import p1.Employee;

public class EmpObjAsParameterToNonStaticMethod {
    public static void main(String[] args) {
        //here create object of Employee class and add 101,sam,1000 data into that
        //call show method and pass this created object to show method
        Employee employee = new Employee(101, "sam", 1000);
        EmpObjAsParameterToNonStaticMethod empObjAsParameterToNonStaticMethod = new EmpObjAsParameterToNonStaticMethod();
        empObjAsParameterToNonStaticMethod.show(employee);
    }
    public void show(Employee employee){
        //do required changes to show method and display that data here
        System.out.println("id: "+employee.getId());
        System.out.println("name: "+employee.getName());
        System.out.println(("Salary: "+ employee.getSal()));
    }

}
