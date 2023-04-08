package hw.src;

public class hw14 {
    public static void main(String[] args) {
        int n = 1;
        while (n < 10) { //1,2,3
            int check = 1;
            int count = 0;
            while (check <= n) { //1=1
                if (n % check == 0) {
                    count++;//1,2,3
                }
                check++;//2,3,4
            }

            if (count == 2 && n != 1) {
                System.out.print(n + " ");//2,
            }
            n++;//2,3
        }


    }
}
//This should correctly print out all prime numbers between 1 and 100.
//Write a program that prints all prime numbers between 1 and a 100  using a while loop.
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97




