package class18;

import java.util.Scanner;

public class doWhile1 {
    public static void main(String[] args) {
        //write a program to take a number and print square of it
        //continue the program till user enters no

        Scanner sc = new Scanner(System.in);
        String answ;

        do{
            System.out.println("Please enter any number");
            int n = sc.nextInt();
            if(n!=0) {
                int sq = n * n;
                System.out.println("This is the square of your number " + (sq));
            }
            System.out.println("Would you like continue? yes or no");
            answ = sc.next();
        }
        while(answ.equalsIgnoreCase("yes"));
    }
}
