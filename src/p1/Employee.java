package p1;

public class Employee implements Cloneable, Comparable<Employee> {
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        String data = "Id:"+getId()+" Name:"+getName()+" Salary:"+getSal();
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee2 = (Employee)obj;
        if(this.id == employee2.id && this.name == employee2.name && this.sal == employee2.sal)
            return true;
        return false;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    /***
    @Override
    public int compareTo(Employee o) {
        if(this.id > o.getId())
            return 1;
        else if(this.id < o.getId())
            return -1;
        else
            return 0;

    }***/
    @Override
    public int compareTo(Employee o) {
        if(this.id > o.getId())
            return -1;
        else if(this.id < o.getId())
            return 1;
        else
            return 0;

    }

    @Override
    public int hashCode() {
        return id;
    }

}
