package class24;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
// get 2d array from user and print greatest number from each row
        int data[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<data.length; i++) {
            System.out.println("Enter data in rows: " + (i + 1));
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextInt();
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
            System.out.println("Greatest in row " + " is " + max);
                }
            }
        }

