package p27q26;

import p1.Employee;

public class PassingIdAsParam {
    public static void show(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        //create Employee object here with 101,sam,1000 data
        Employee employee = new Employee(100,"chitra",1000);
        //call m1 method and pass employee id as parameter
        show(employee.getId());
    }

}
