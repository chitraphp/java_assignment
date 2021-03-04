package p22q21;

import p1.Employee;

public class PassingObjToStatic {
    public static void show(Employee e){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        //call m1 method from here
        Employee employee = new Employee(100,"sam",1000);
        show(employee);
    }

}
