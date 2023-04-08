package class18;

public class Whileloopp {
    public static void main(String[] args) {

        int n = 1;
        while (n <= 20) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
            n++;
        }

        int n1 = 0;
        while(n1<=50){
            if(n1%5==0 || n1%3==0){
                System.out.println(n1);
            }
            n1++;
        }
    }
}

