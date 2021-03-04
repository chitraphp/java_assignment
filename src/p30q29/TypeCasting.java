package p30q29;

public class TypeCasting {
    public static float show(int data){
        System.out.println("show called");
        return data*data;
    }
    public static void main(String[] args) {
        //call m1 method and pass some number
        float result = show(100);
        int total = 100 + (int)result;
        System.out.println(total);
    }

}
