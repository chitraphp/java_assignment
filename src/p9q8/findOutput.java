package p9q8;

import p1.Employee;

public class findOutput {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "sam", 1000);
        findOutput.show(emp);
        System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
        //before setter method
        //101 sam 1000
        //after setter method
        //102 sam 1000
    }

    public static void show(Employee ex) {
        System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
        ex.setId(102);
    }

}
