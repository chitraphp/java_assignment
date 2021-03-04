package p20q19;

public class CallingNonStaticFromStatic {
    public  void show(float a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        //call m1 method from here
        float local = 10f;
        CallingNonStaticFromStatic callingNonStaticFromStatic = new CallingNonStaticFromStatic();
        callingNonStaticFromStatic.show(local);
    }

}
