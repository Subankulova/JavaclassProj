package class22;
//write a program to print sum of data stored in the array
public class SumofArray {
    public static void main(String[] args) {
        int listofData[] = {10,30,50,30,70,40,45,32};
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum = sum + listofData[i];
        }
        System.out.println(sum);
    }
}
