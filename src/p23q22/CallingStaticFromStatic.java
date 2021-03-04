package p23q22;

public class CallingStaticFromStatic {
    public static void show(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        //call m1 method from here
        show("chitra");
    }

}
