package class13;

import java.util.Scanner;

public class instancemethod {
    public static void main(String[] args) {
        //Given two non-negative int values, return true if they have the same last digit,
        // such as with 27 and 57.
        // Note that the % “mod” operator computes remainders, so 17 % 10 is 7.
        instancemethod var = new instancemethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two non-negative int values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(var.lastDigit(a, b));
    }

    public boolean lastDigit(int a, int b) {
        if (a < 0 && b < 0) {
            if (a % 10 == b % 10) {
                return true;
            }
        }
        return false;
    }
}
