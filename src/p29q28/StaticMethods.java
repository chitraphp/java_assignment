package p29q28;

public class StaticMethods {
    public static int show(int data){
        System.out.println("m1 called");
        return data*data;
    }
    public static void main(String[] args) {
        //call m1 method and pass some number
        int result = show(100);
        //int total = 100 + use returned value here;
        int total = 100 + result;
        System.out.println(total);
    }

}
