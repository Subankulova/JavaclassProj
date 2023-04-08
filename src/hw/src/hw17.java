package hw.src;

import java.util.Scanner;

public class hw17 {
    public static void main(String[] args) {
        //1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
        int sum = 0;
        int power = 0;
        for (int num = 1; num <= 5; num++) {
            power++;
            sum += (int) Math.pow(num, power);

        }
        System.out.println(sum);

        //2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
        //Note - Please print the sum in decimal, answer should not be zero

        double sum1 = 0;
        double div = 1;
        for (int i = 1; i <= 10; i++) {
            div++;
            sum1 += i / div;
        }
        System.out.println(sum1);

        //3. Write a program to print the sum of each digit from the given number
        //Example1
        //Input - 3521
        //Output - 11
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        int f = 0;
        while (num2 > 0) {
            f = f + num2 % 10;
            num2 = num2 / 10;
        }
        System.out.println(f);

        // 4.  Write a program to print the greatest digit from the given number
        //Example1
        //Input - 86545
        //Output - Greatest digit is 8
        Scanner input = new Scanner(System.in);
        int num3 = input.nextInt();
        int m = 1;
        while (num3 > 0) {
            if (num3 % 10 > m) {
                m = num3 % 10;
            }
            num3 = num3 / 10;
        }
        System.out.println(m);

        //  5.  Write a program to print the reverse of the given number
        //Example1
        //Input - 86545
        //Output - 54568
        //Example2
        //Input - 23561
        //Output - 16532

        Scanner task = new Scanner(System.in);
        long num4 = task.nextInt();
        int count = 0;
        while (num4 > 0) {//remove one digit from number
            System.out.print(num4 % 10);
            num4 = num4 / 10;

        }
    }
}

