package hw.src;

import java.util.Scanner;

public class hw13 {
    public static void main(String[] args) {
        System.out.println("Task1================");
        //Write a program that uses a while loop
        // to print the odd numbers from 1 to 20. => 1,3,5,7,9,11,13,15,17,19

        int n = 1;
        while(n<20){
            System.out.println(n);
            n++;
        }
        System.out.println("Task2================");

      //Write a program that uses a while loop to print the sum of the numbers
       // from 1 to 10. => 1+2+3+4+5+6+7+8+9+10. result should be 55?

        int num = 1;
        int sum = 0;
        while(num<=10){
            sum = num+sum;
            num++;
        }
        System.out.println(sum);

        System.out.println("Task3================");
        //Write a program that uses a while loop to print the multiplication table for a given number.
        //Enter number to print table: 7
        //7 * 1 = 7
        //7 * 2 = 14
        //7 * 3 = 21
        //7 * 4 = 28
        //7 * 5 = 35
        //7 * 6 = 42
        //7 * 7 = 49
        //7 * 8 = 56
        //7 * 9 = 63
        //7 * 10 = 70

        int a = 7;
        int b = 1;
        while (b<=10){
            System.out.print(a + " * " + b + " = " + (a*b) + "\n");
            b++;
        }




    }
}
