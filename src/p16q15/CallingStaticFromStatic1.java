package p16q15;

public class CallingStaticFromStatic1 {
    public static void show(){
        System.out.println("Hello world");
    }
}

 class CallingStaticFromStatic12 {
    public static void main(String[] args) {
        //call show method of Test class from here
        CallingStaticFromStatic1.show();
    }

}
