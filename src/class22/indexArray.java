package class22;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class indexArray {
    public static void main(String[] args) {
        int listofData[] = {10,30,50,30,70,40,45,32};
        Scanner sc = new Scanner(System.in);
        int targetNumber = sc.nextInt();
        for(int i = 0; i<listofData.length; i++){
            if (listofData[i]==targetNumber){
                System.out.println(i);
            }
        }
    }
}
