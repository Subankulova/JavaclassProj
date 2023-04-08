package hw.src;

import java.io.PrintStream;
import java.util.Arrays;

public class hw21 {
    public static <list2> void main(String[] args) {
        //1. Write a program to get two 2D arrays from the user and print the sum of it
        //Input:
        //Array 1
        //1 1 1
        //2 2 2
        //3 3 3
        //Array 2
        //4 4 4
        //2 2 2
        //1 1 1
        //
        //Output:
        //5 5 5
        //4 4 4
        //4 4 4
        int data[][] = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        int data1[][] = {
                {4, 4, 4},
                {2, 2, 2},
                {1, 1, 1}
        };
        int sum[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = data[i][j] + data1[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Task2============");
        //2.  Write a program to find the sum of array elements using for-each loop
        //Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        //Output: 55

        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for(int i = 0; i<list.length; i++){
                total = total + list[i];
            }
        System.out.println(total);

        System.out.println("Task3============");
        //3. Program to print the sum of the smallest and greatest number from the array using for-each loop
        //Input: 45, 65, 85, 24, 45, 85, 34, 65, 100
        //Output: 124 (100 + 24)
        int list1[] = {45, 65, 85, 24, 45, 85, 34, 65, 100};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int numb : list1){
            if (numb>max){
                max=numb;
            }
        }
        for (int numb : list1){
            if (numb<min){
                min=numb;
            }
        }
        System.out.println(max+min);



        System.out.println("Task4============");
        //4. Write a program to sort array elements in ascending order using for-each loop
        //Input: 5 2 8 7 1
        //Output: 1 2 5 7 8

        int[] list2 = {5, 2, 8, 7, 1};
        Arrays.sort(list2);
        for(int num : list2) {
            System.out.print(num);
        }
    }
}
