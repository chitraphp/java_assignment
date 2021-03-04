package p15q14;

public class CallingNonStaticMethodFromStaticMethod {
    public void show(){
        System.out.println("Hello world");
    }
}

 class CallingNonStaticMethodFromStaticMethod2 {
    public static void main(String[] args) {
        //call show method of Test class from here
        CallingNonStaticMethodFromStaticMethod callingStaticMethodFromStaticMethod = new CallingNonStaticMethodFromStaticMethod();
        callingStaticMethodFromStaticMethod.show();
    }

}
