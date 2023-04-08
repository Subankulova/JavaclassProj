package class24;

import java.util.Scanner;

public class ArrayPractice2 {
    public static void main(String[] args) {
      // get 2d array from user and print greatest number from each row
        long data[][] = new long[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<data.length; i++) {
            System.out.println("Enter data in rows: " + (i + 1));
            long max = Long.MIN_VALUE;

            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextLong();
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
            System.out.println("Greatest in row " + " is " + max);
        }
    }
}