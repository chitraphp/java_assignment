package p17q16;

public class CallingStaticFromStaticMethodInClass {
    public static void show(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        //call m1 method from here
        show();
    }

}
