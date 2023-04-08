package class37;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            if (age >= 13 && age <= 19) {
                System.out.println("You are a teenager");
            }
            else if(age<=0||age>100){
                System.out.println("Invalid");
            }
            else System.out.println("you're not a teenager");
        }catch(Exception a){
            System.out.println("Invalid");
        }
    }
}
