package class9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("What your gender? M or F");
        String gender = sc.next();
        char genderinchar = gender.charAt(0);
        System.out.println(genderinchar);*/

        System.out.println("What your gender? M or F");
        String gender = sc.next();
        char genderinchar = gender.charAt(0);
        if (genderinchar=='M') {
            System.out.println("go work hard");
        }
        else if (genderinchar=='F'){
            System.out.println("enjoy your life");
        }
        else
            System.out.println("Wrong");


    }
}