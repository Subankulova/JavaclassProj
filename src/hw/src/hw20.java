package hw.src;

public class hw20 {
    public static void main(String[] args) {
        System.out.println("Task1==========");
        //1. Write a program to get a collection of elements and print it in reverse order
        //Input: 1 2 3 4 5
        //Output: 5 4 3 2 1
        int data[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i]);
        }
        System.out.println();


//        System.out.println("Task2==========");
//        //2.  Write a program to find the duplicate elements from the array
//        // (The element should not be repeated in the output ) - Brainstorm to find the logic
//        //Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//        //Output: 45, 65, 85
//        int digits[] = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
//        for (int i = 0; i < digits.length; i++) {
//            for (int j = i + 1; j < digits.length; j++) {
//                if (digits[i] == digits[j]) {
//                    System.out.print(digits[i] + " ");
//                }
//            }
//        }
//
//        System.out.println();


        System.out.println("Task3==========");
//        3. Program to print the elements of an array present in the odd position
//        Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//        Output: 65, 24, 85, 65, 85

        int elem[] = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
        int odd = 0;
        for (int w = 0; w < elem.length; w++) {
                if(w%2!=0)
                    System.out.print(elem[w] + " ");

        }
        System.out.println();


        System.out.println("Task4==========");
        //4. Write a program to sort array elements in ascending order
        //Input: 5 2 8 7 1
        //Output: 1 2 5 7 8
        int a[] = {5, 2, 8, 7, 1};
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}

