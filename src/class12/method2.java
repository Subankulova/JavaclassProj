package class12;
import java.util.Scanner;

public class method2 {
    /*public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumNumbers(a,b));
    }

    public static int sumNumbers(int a, int b) {
        int sum = 0;
        if (a == b) {
            sum = (a + b) * 2;
            return sum;
        }
        else {
            return a+b;
        }
}*/
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(answer(n1,n2));
    }
    public static boolean answer (int n1, int n2){
        if(n1>10 && n1<20 && n2>10 && n2<20){
            return true;
        }
        else return false;
    }

}
