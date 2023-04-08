package class36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = input.nextInt(), num2 = input.nextInt();
        try{
            System.out.println(num1/num2);
//        }catch(InputMismatchException e){ //e is the object of the class
//            System.out.println("Please after hangover, enter numbers only");
//        }catch(ArithmeticException e){
//            System.out.println("Please study maths, we cannot divide with zero");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Bye");

    }
}
