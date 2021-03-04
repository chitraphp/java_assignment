package p6q5;
import p1.Employee;

public class EmpObjAsParameterToStaticMethod {
    public static void main(String[] args) {
        //here create object of Employee class and add 101,sam,1000 data into that
        //call show method and pass this created object to show method
        Employee employee = new Employee(101, "sam", 1000);
        show(employee);
    }
    public static void show(Employee employee){
        //do required changes to show method and display that data here
        System.out.println("id: "+employee.getId());
        System.out.println("name: "+employee.getName());
        System.out.println(("Salary: "+ employee.getSal()));
    }

}
