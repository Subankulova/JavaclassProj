import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //**Write a program to find the greatest number out of three numbers using nested if statement**

        //**Question Type:** Write Code.
        //## Test Data:

        //Example 1:
        //Input - 43, 54, 24
        // Output - 54 is the greatest

        //Example 2:
        //Input - 53, 21, 65
        //Output - 65 is the greatest


        System.out.println("Please type three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2) {
            if (num1 > num3)
                System.out.println(num1 + " is the greatest");
            else System.out.println(num3 + " is the greatest");
        } else {
            if (num2 > num1 && num2 > num3)
                System.out.println(num2 + " is the greatest");
            else System.out.println(num3 + " is the greatest");
        }


        System.out.println("Task 2 =========================");

        /*2)> **Write a program to get a salary, age, and loan
        amount from the user and print how much credit card
        limit they can avail, based on the following criteria**
     ```java
      Salary
       ----------------------------------------------
      less than 1000              Not Eligible
      1001 to 5000                limit 10000
      5001 to 10000               limit 20000
      greater than 10001          limit 50000
      ----------------------------------------------
      Age should be greater than or equal to 18
      Loan Amount
      ---------------------------------
      less than 5000           No Deduction In Limit
      greater than 20000       Not Eligible
      5001 to 20000            Deduct Half Of The Loan Amount From Credit Card Limit
      ---------------------------------
      Note - If Credit Limit Turns Negative, Print - You Are Not Eligibile*/

        System.out.println("Please enter your salary");
        int salary = input.nextInt();
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Please enter your loan amount");
        int loan = input.nextInt();

        if (age >= 18) {
            if (salary > 1001 && salary <= 5000)
                System.out.println("limit 10000");
            else if (salary >= 5001 && salary <= 10000)
                System.out.println("limit 20000");
            else System.out.println("limit 50000");
        } else System.out.println("You Are Not Eligibile");

        if (age >= 18) {
            if (loan <= 5000 && loan > 0)
                System.out.println("No Deduction In Limit");
                else if (loan >= 5001 && loan <= 20000) {
                System.out.println("Deduct Half Of The Loan Amount From Credit Card Limit");
            } else System.out.println("You Are Not Eligibile");
        }
    }
}
