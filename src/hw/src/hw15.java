package hw.src;

import java.util.Scanner;

public class hw15 {
    public static void main(String[] args) {
        //Write a to take the opening balance and the account name from the user and display the below operations that the user can perform, at the end ask user if they want to perform more operations and then continue the same process until a user enters ‘NO’
        //Output
        //Welcome to the ATM Machine
        //Please enter your account opening balance: 1000
        //Please choose the operations you want to perform
        //1) Withdraw
        //2) Deposit
        //3) Check Balance
        //1
        //Please enter the amount you want to withdraw: 500
        //The available balance is: 500
        //Do you want to perform more operations?
        //Press 1 for yes, Press 2 for No
        //1
        //Please choose the operations you want to perform
        //1) Withdraw
        //2) Deposit
        //3) Check Balance
        //2
        //Please enter the amount you want to deposit: 500
        //The available balance is: 1000
        //Do you want to perform more operations?
        //Press 1 for yes, Press 2 for No
        Scanner sc = new Scanner(System.in);
        String answer;
         do {
            System.out.println("Welcome to the ATM Machine! Please enter your account opening balance: ");
            long balance = sc.nextLong();
            System.out.println("Please choose the operations you want to perform? 1 or 2 or 3?");
            System.out.println("1) Withdraw\n 2) Deposit\n 3) CheckBalance");
            String choice = sc.next();

            switch (choice){
                case "1":
                    System.out.println("Please enter the amount you want to withdraw: ");
                    Long withdraw = sc.nextLong();
                    System.out.println("The available balance is: " + (balance - withdraw));
                    break;
                case "2":
                    System.out.println("Please enter the amount you want to deposit: ");
                    Long deposit = sc.nextLong();
                    System.out.println("The available balance is: " + (balance + deposit));
                    break;
                case "3":
                    System.out.println("Please choose the operations you want to perform");
                    Long check = sc.nextLong();
                    System.out.println("The available balance is: " + (balance));
                    break;
                default:
            }
            System.out.println("Do you want to perform more operations? yes or no?");
            answer = sc.next();
        } while(answer.equalsIgnoreCase("yes"));




        //Write a program to print numbers from 10 to 1 using a do-while loop
        //Output
        //10
        //9
        //8
        //7
        //6
        //5
        //4
        //3
        //2
        //1

       /* int num = 11;
        do {
            num--;
            System.out.println(num);
        }while(num>1); */

    }
}
