package class14;

public class StringLength {
    public static void main (String[]args){
        String str = "wedevx.co";
        System.out.println(str.length()-2);

        String str2 = "Hello World!";
        System.out.println(str2.length());

        String str3 = "United States of America";
        System.out.println(str3.length());
        String str4 = "Canada";
        String str5 = "Mexico";
        String str6 = "Cuba";

        int num = str3.length();
        int num1 = str4.length();
        int num2 = str5.length();
        int num3 = str6.length();
        int average = (num+num1+num2+num3)/4;
        System.out.println(average);
    }
}
