package class22;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //create and initialize an array
        int listofData[] = {10,30,50,30,70,40,45,32};

        //Access element fron the array
        System.out.println(listofData[2]);

        System.out.println(listofData.length);
        for(int i = 0; i<listofData.length;i++)
        System.out.println(listofData[i]);
        System.out.println(Arrays.toString(listofData));


    }
}
