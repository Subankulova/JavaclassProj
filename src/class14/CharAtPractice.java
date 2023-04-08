package class14;

import java.util.Scanner;

public class CharAtPractice {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(str.charAt(5));
    }
}
