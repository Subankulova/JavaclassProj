package hw.src;

import java.util.Scanner;

public class hw12 {
    public static void main(String[] args) {
        //Homework 1:
        //Write a method that takes a string and
        // returns true if the string starts with “hi” and false otherwise.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(FirstWord(str));
    }
    public static boolean FirstWord(String str) {
        if (str.length() < 2)
            return false;
        str = str.substring(0,2);
        return str.equalsIgnoreCase("hi");
        }*/

        //Homework 2:
        //Write a method that takes a string returns a new string
        // made of 3 copies of the last 2 chars of the original string.
        // The string length will be at least 2.
        //extraEnd(“Hi”) → “HiHiHi”
        //extraEnd(“Hello”) → “lololo”
        //extraEnd(“ab”) → “ababab”

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = sc.next();
        System.out.println(TwoChars(str1));
    }

    public static String TwoChars(String str1) {
        String chars;
        if (str1.length() < 2)
            chars = str1;
        else {
            chars = str1.substring(str1.length() - 2);
        }
        return chars + chars + chars;
    }
}

        //Homework 3:
        //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so “coding” yields “codign”.
        //lastTwo(“coding”) → “codign”
        //lastTwo(“cat”) → “cta”
        //lastTwo(“ab”) → “ba”
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(LastTwo(str));
    }

    public static String LastTwo(String str) {
        String str1 = str.substring(0,str.length()-2);
        str = str1+str.charAt(str.length()-1)+str.charAt(str.length()-2);
            return str;*/




