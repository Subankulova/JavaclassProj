package class18;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
       int i = 1;
       do {
           System.out.println(i);
           i++;
       }
       while(i>=5);

       String choice;
       do {
           Scanner sc = new Scanner(System.in);
           System.out.println("Please enter first number ");
           int num1 = sc.nextInt();

           System.out.println("Please enter second number ");
           int num2 = sc.nextInt();

           System.out.println("Please eenter operation you want to perform");
           String oper = sc.next();

           switch (oper.toLowerCase()) {
               case "add":
                   System.out.println(num1 + num2);
                   break;
               case "sub":
                   System.out.println(num1 - num2);
                   break;
               case "mul":
                   System.out.println(num1 * num2);
                   break;
               case "div":
                   System.out.println(num1 / num2);
                   break;
               default:
                   System.out.println("Please enter valid oper");
           }
           System.out.println("Woul dyou like to do more oper? yes or no");
           choice = sc.next();
       } while(choice.equalsIgnoreCase("yes"));

    }
}
