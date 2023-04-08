package class19;

public class ForLoop {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=10; i++){
            i = i+2;
        }
        System.out.println(i);



        int sum = 0;
        for (int a = 1; a <= 5; a++) {
            sum = sum + a;
        }
        System.out.println("Sum: " + sum);
    }
}
