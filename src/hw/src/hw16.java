package hw.src;

import java.util.Scanner;

public class hw16 {
    public static void main(String[] args) {
        System.out.println("Task1=========");
        //1. Write a program to print the sum of even numbers from 1 to 10
        // 2+4+6+8+10 = 30

        int sum = 0;
        for (int num = 0; num <= 10; num++) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);


        System.out.println("Task2=========");
        //2. Write a program to count the number of divisors of the given numbers
        //For example - Number 6 has 4 divisors & 12 has 6 divisors
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int n = sc.nextInt();
        int div = 0;
        for (int d = 1; n >= d; d++) {
            if (n % d == 0) {
                div++;
            }
        }
        System.out.println(n + " has a " + div + " divisors");

        System.out.println("Task3=========");
        //3. Write a program to find a magic number from 1 to 100,
        //if you divide that number by 5 you will get remainder 4
        //if you divide that number by 4 you will get remainder 3
        //if you divide that number by 3 you will get remainder 2
        //if you divide that number by 2 you will get remainder 1
        int max = 100;
        int number = 1;
        int i;
        for (i = number; i <= max; i++) {
            if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1) {
                System.out.println(i + " it's a magic number");
            }
        }

        System.out.println("Task4=========");
        //4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
        int sum1 = 0;
        for(int a=1; a<=10; a++){
            if(a%3==0){
                sum1=sum1-a;
            }
            else{
                sum1=sum1+a;
            }
        }
        System.out.println(sum1);

        System.out.println("Task5=========");
        //  5.  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5

        int sum2=0;
        for(int b=1; b<=5; b++){
            sum2 = sum2+b;
        }
        for(int c=10; c>5; c--){
            sum2=sum2+c;
        }
        System.out.println(sum2);

        System.out.println("Task6=========");
        // 6.  Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2

        int n1;
        int pow;
        int sum3 =0;
        for(n1=1;n1<=5;n1++){
            pow = n1*n1;
            sum3 = sum3+pow;
        }
        System.out.println(sum3);
    }
}