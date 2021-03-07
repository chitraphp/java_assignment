package p36q35;

public class FindOutput {
    static int total = 0;

    public static void add() {
        int total = 10 + 30;
    }

    public static void main(String[] args) {
        FindOutput.add();
        System.out.println(total);
    }

}
//output: 0;