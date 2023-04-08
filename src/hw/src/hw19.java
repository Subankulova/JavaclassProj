package hw.src;

public class hw19 {
    public static void main(String[] args) {
        System.out.println("Task 1 ===========");
        //1.  Write a program to find the greatest number from an array
        //Example
        //Input - 12, 45, 67, 23, 13, 45, 56
        //Output - 67
        int numbers[] = {12, 45, 67, 23, 13, 45, 56};
        int greatest = numbers[0];
        for(int i=1; i<numbers.length; i++){
           if(numbers[i]>greatest) {
               greatest = numbers[i];
           }
        }
        System.out.println("The greatest number is " + greatest);


        System.out.println("Task 2 ===========");
        //2.  Write a program to find the sum of even and odd numbers
        //Example
        //Input - 12, 45, 67, 23, 13, 45, 56
        //Output - Sum of Even Elements - 68, Sum of Odd Elements - 193

        int data[] = {12, 45, 67, 23, 13, 45, 56};
        int sumodd = 0;
        int sumeven = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]%2!=0){
                sumodd = sumodd+data[i];
            }
        }
        for(int i=0;i<data.length;i++){
            if(data[i]%2==0){
                sumeven = sumeven+data[i];
            }
        }
        System.out.println("Sum of Odd Elements: " + sumodd);
        System.out.println("Sum of Even Elements: " + sumeven);


        System.out.println("Task 3 ===========");
        //3. Write a program to count number of positive(consider zero also positive)
        // and negative numbers from an array
        //Example
        //Input - 12, -45, 67, 23, -13, 45, -56
        //Output - Positive Elements - 4, Negative Elements - 3
        int data1[] = {12, -45, 67, 23, -13, 45, -56};
        int pos = 0; int neg = 0;
        for(int i=0;i<data.length;i++){
            if(data1[i]>=0){
                pos++;
            }
        }
        System.out.println("Positive Elements: " + pos);

        for(int i=0;i<data.length;i++){
            if(data1[i]<0){
                neg++;
            }
        }
        System.out.println("Negative Elements: " + neg);
    }
}
