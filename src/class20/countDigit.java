package class20;

import java.util.Scanner;
//write a program to count number of digit in the given number
//input 34567
//output 5
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count =0;
        while(num>0){
            num = num/10;//remove one digit from number
            count++;
        }
        System.out.println(count);
    }
}
