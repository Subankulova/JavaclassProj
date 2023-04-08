package class17;

import com.sun.security.jgss.GSSUtil;

public class WhilePractice {
    public static void main(String[] args) {
     // write a program to print
     // 1 10 2 9 3 8 4 7 5 6

        int num = 1;
        int num1 = 10;
        while (num<=5 && num1>5 && num1<=10){
            System.out.println(num);
            System.out.println(num1);
            num++;
            num1--;
        }
    }
}
