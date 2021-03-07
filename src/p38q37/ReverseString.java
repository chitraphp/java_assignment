package p38q37;

public class ReverseString {
    public static String reverseString(String str){
        //reverse str string here and return
        int start_index=0;
        int end_index = str.length()-1;
        char[] array = str.toCharArray();
        while(start_index < end_index){
            char temp = array[start_index];
            array[start_index] = array[end_index];
            array[end_index] = temp;
            start_index++;
            end_index--;
        }
        String revesedStr = new String(array);
        return  revesedStr;
    }
    public static void main(String[] args) {
        String str = "Hello Welcome";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }

}
