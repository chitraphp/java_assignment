package p33q32;

public class NonVoidMethods {
    public static int show(int data){
        return data*data;
    }
    public static void main(String[] args) {
        //call m1 method from here in different ways
        int result = show(100);
        show(20);
        int total = 100 + show(90);
    }

}
