package p18q17;

public class CallingNonStaticFromStaticMethodInClass {
    public  void show(){
        System.out.println("m1 method");
    }
    public static void main(String[] args) {
        //call m1 method from here
        CallingNonStaticFromStaticMethodInClass callingNonStaticFromStaticMethodInClass = new CallingNonStaticFromStaticMethodInClass();
        callingNonStaticFromStaticMethodInClass.show();
    }

}
