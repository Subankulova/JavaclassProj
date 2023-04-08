package hw.src;

import java.util.InputMismatchException;
import java.util.Scanner;

//Task 1:
//Write a program to print the number of days in a given month using If-Else
//Example
//Input - 1,  Output - 31 days
//Input - 2,  Output - 28/29 days
//Input - 3,  Output - 31 days
//Input - 4,  Output - 30 days
//Input - 12, Output - 31 days
//Input - Any other number - Throw the Exception
public class hw34 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of month");
        int input = sc.nextInt();
        if(input==1||input==3||input==5||input==7||input==8||input==10||input==12){
            System.out.println("31 days");
        }
        else if(input==4||input==6||input==9||input==11){
            System.out.println("30 days");
        }
        else if(input==2){
            System.out.println("28/29 days");
        }
        else {
            throw new Exception("Throw the Exception");}
    }
}
