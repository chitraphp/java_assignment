package p79q81;

import p1.Employee;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetOfEmp {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        Employee e1 = new Employee(101, "sam", 10000);
        Employee e2 = new Employee(102, "sameer", 2000);
        Employee e3 = new Employee(103, "shyam", 30000);
        Employee e4 = new Employee(104, "ram", 4000);
        Employee e5 = new Employee(101, "sam", 10000);


        //create another arrayList which contains Employees whose salary is more than 5000
        //display new list
        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        for (Employee e:set) {
            System.out.println(e);
        }
    }
}
