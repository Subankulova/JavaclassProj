import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");
        int number = input.nextInt();
        if ((number%2)!=0) {
            System.out.println(number + " is an odd number");
        } else
            System.out.println(number + " is an even number");
    }
}
