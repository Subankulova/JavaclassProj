package class20;

import java.util.Scanner;

//write a program to print ach digit of the number in output in reverse order
//input 1234
//output 4321
public class Displaydigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count = 0;
        while(num>0){//remove one digit from number
            System.out.println(num%10);
            num = num/10;


        }

    }
}
