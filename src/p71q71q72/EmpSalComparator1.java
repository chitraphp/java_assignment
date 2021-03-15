package p71q71;

import p1.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpSalComparator1 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(102, "ram", 2000));
        al.add(new Employee(103, "shyam", 3000));
        al.add(new Employee(101, "sam", 10000));
        al.add(new Employee(104, "sameer", 40000));
        //sort list in ascending order of salary using sort method and Comparator
        Collections.sort(al, new EmpSalAsc());
        for (Employee e:al) {
            System.out.println(e.toString());
        }
    }

}
class EmpSalAsc implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSal() > o2.getSal())
            return 1;
        else if(o1.getSal() < o2.getSal())
            return -1;
        else
            return 0;

    }
}
