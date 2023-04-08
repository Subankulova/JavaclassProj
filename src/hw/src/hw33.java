package hw.src;

import java.util.Scanner;

//ask 1:
//Create a class & take two integer values from the user
//Perform division operation & handle the appropriate Exception
//Create a String variable with a null value
//Find the length of the null variable and handle the appropriate Exception
//Create an array of five integers
//Access the element at the fifth position
//Handle the appropriate Exception
public class hw33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig1 = sc.nextInt(),dig2 = sc.nextInt();
        String str = null;
        int data[] = {3,4,5,6,7};
        try{
            int result = dig1/dig2;
            System.out.println(result);
        }catch (ArithmeticException a){
            System.out.println("Wrong operation");
        }
        try{
            System.out.println(str.length());
        }catch(NullPointerException a){
            System.out.println("Null Pointer");
        }
        try{
            System.out.println(data[5]);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Index Out Of Bounds");
        }
    }
}
