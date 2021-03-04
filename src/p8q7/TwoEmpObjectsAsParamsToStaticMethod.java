package p8q7;

import p1.Employee;

public class TwoEmpObjectsAsParamsToStaticMethod {
    public static void main(String[] args) {
        //here create two objects of Employee class and add  data into that
        //call show method and pass this two objects to show method
        Employee employee1 = new Employee(101, "sam", 1000);
        Employee employee2 = new Employee(102, "ram", 2000);
    }
    public static void show(Employee employee1,Employee employee2){
        //do required changes to show method and display that data here
        System.out.println(employee1.getId()+" " + employee1.getName() + " "+ employee1.getSal());
        System.out.println(employee2.getId()+" " + employee2.getName() + " "+ employee2.getSal());

    }

}
