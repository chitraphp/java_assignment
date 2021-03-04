package p28q27;

public class PssingIntAsParam {
    public static int show(int number){
        System.out.println("m1 called");
        return number*number;
    }
    public static void main(String[] args) {
        //call m1 method and pass some number
        show(100);

    }

}
