package class23;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Declaration of Two Dimensional Array
        int data[][] = {
                {34, 54, 23},
                {34, 45, 23},
                {54, 56, 34}
        };
        System.out.println(data[1][1]);

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(data[i][j] + " ");
            }
        }
        System.out.println();
    }
}
