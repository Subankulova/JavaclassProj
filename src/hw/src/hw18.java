package hw.src;

import java.util.Scanner;

public class hw18 {
    public static void main(String[] args) {
        System.out.println("Task5=========");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Task6===============");
        int n1 = 5;
        for (int s = 1; s <= n; s++) {
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int k = s; k <= n1; k++) {
                System.out.print("*");
            }
            for (int k = s; k < n1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Task4============");

        int d = 5;
        for (int t = 1; t <= d; t++) {
            for (int a = 1; a <= t; a++) {
                System.out.print(a);
            }
            System.out.println();
        }

        System.out.println("Task1========");
        //1. Write a program to count the number of vowels from the String (Ignoring Case)
        //Example
        //Input - Welcome to Java Class
        //Output - Num of vowels=7

        String str = "Welcome to Java Class";
        System.out.println(str);
        str = str.toLowerCase();
        int count = 0;
        int l = 0;
        while (l < str.length()) {
            if (str.charAt(l) == 'e' || str.charAt(l) == 'o' || str.charAt(l) == 'a') {
                count++;
            }
            l++;
        }
        System.out.println("Num of vowels = " + count);


        System.out.println("Task3==========");
        // 3. Write a program to check given number is palindrome or not
        //Example1
        //Input - 1221
        //Output - Palindrome
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int r, rev = 0;
        int s = 0;
        s = num;
        while (num > 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (s == rev) {
            System.out.println("it's a palindrome");
        } else System.out.println("it's not a palindrome");

        System.out.println("Task2=======");
        //2. Write a program to print reverse of the given String
        //Example
        //Input - Wedevx
        //Output - xvedeW

        String str1 = "Wedevx";
        int end = 6;
        while (end > 0) {
            end--;
            char let = str1.charAt(end);
            System.out.print(let);
        }
    }
}
