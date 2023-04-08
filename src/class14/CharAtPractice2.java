package class14;

public class CharAtPractice2 {
    public static void main (String[]args){
        String str = "Superstar";
        System.out.println(lastChar(str));
    }

    public static char lastChar(String str){
        int length =  str.length();
        return str.charAt(length-8);
    }
}
