package class17;

public class WhilwPractice4 {
    public static void main(String[] args) {
        //write a program to check given number is palindrome or not.
        //Example 1:
        ////
        ////Input:  12321
        ////Output: Palindrome

        int num = 12321;
        int r,rev = 0;
        int s = 0;
        s=num;
        while(num>0){
            r=num%10;
            rev = (rev*10)+r;
            num=num/10;
        }
        if(s==rev){
            System.out.println("it's a palindrome");
        }
        else System.out.println("it's not a palindrome");

    }
}
