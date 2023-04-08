package class23;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        String fruits[] = new String[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 fruits");

        for(int i = 0; i< fruits.length; i++){
            fruits[i] = sc.next().trim();
        }
        for(int i = 0; i<fruits.length; i++){
            for (int j = i+1; j<fruits.length;j++){
                if(fruits[i].equals(fruits[j])){
                    System.out.println(fruits[j]);
                }
            }
        }
    }
}
