package p10q9;

import p1.Employee;

public class usingSetter {
    public static void main(String[] args) {
        //create Employee object with 101,sam,1000 data
        Employee employee1 = new Employee(101, "sam", 1000);
        //display this object data by passing to show method
        show(employee1);
        //add 100 bonus in salary
        int salary = employee1.getSal();
        salary = salary + 100;
        employee1.setSal(salary);
        //display this object data by passing to show method
        show(employee1);

    }
    public static void show(Employee employee){
        //do required changes in show method
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSal());
        
    }

}

