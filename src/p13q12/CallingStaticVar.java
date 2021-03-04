package p13q12;

public class CallingStaticVar {
    private static int total = 10;
    public static void main(String[] args) {
        //print total in different ways
        System.out.println(total);
        System.out.println(CallingStaticVar.total);
    }

}
