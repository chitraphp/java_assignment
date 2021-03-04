package p12q11;

import p1.Employee;

public class CallingStaticMethods {
    public static void main(String[] args) {
        //call show method in different ways
        show();
        CallingStaticMethods.show();
    }
    public static void show(){
        System.out.println("show method");
    }


}
