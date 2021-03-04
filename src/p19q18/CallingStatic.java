package p19q18;

public class CallingStatic {
    public static void show(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        //call m1 method from here
        int local = 10;
        show(local);
    }

}
